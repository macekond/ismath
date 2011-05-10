package cz.cvut.fel.archval.demeter.graphgen;

import com.sun.source.tree.ClassTree;
import com.sun.source.tree.IdentifierTree;
import com.sun.source.tree.MemberSelectTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.NewArrayTree;
import com.sun.source.tree.NewClassTree;
import com.sun.source.tree.VariableTree;
import com.sun.source.util.TreePath;
import com.sun.source.util.TreePathScanner;
import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import org.netbeans.api.java.source.CompilationInfo;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class SourceMemberVisitor extends TreePathScanner<Void, Void> {

    private CompilationInfo info;
    private InputOutput io = IOProvider.getDefault().getIO("DG-analysis",
            false);
    private Graph graph;
    private Deque<Vertex> stack;
    private String currentEdgeClassifier = "use";
    private boolean inclass = false;
    private static final String KIND_CLASS = "class";
    private static final String KIND_METHOD = "method";

    public SourceMemberVisitor(CompilationInfo info) {
        this.info = info;
        stack = new LinkedList<Vertex>();
        io.select();
    }

    public Void visitClass(ClassTree node, Void v) {
        TreePath currentPath = getCurrentPath();
        Element el = info.getTrees().getElement(currentPath);
        int level = getNestingLevel(currentPath);

        if (level == 1) { // toplevel class
            TypeElement tel = (TypeElement) el;

            printIndented("[add class vertex '" + tel.getQualifiedName()
                    + "' to stack here]", level);
            Vertex vertex =
                    ensureVertex(tel.getQualifiedName().toString(), KIND_CLASS);
            stack.push(vertex);

        }

        inclass = true;
        Void retval = super.visitClass(node, v);
        inclass = false;

        if (level == 1) {
            printIndented("[remove class from stack]\n\n", level);
            stack.pop();
        }
        return retval;
    }

    @Override
    public Void visitMethod(MethodTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        Element el = info.getTrees().getElement(currentPath);
        int level = getNestingLevel(currentPath);
        if (level == 2) { // method in toplevel class

            TypeElement tel = (TypeElement) el.getEnclosingElement();

            printIndented("[add method vertex '"
                    + tel.getQualifiedName().toString() + "." + node.getName()
                    + "(~)' to stack]", level);

            Vertex vertex = ensureVertex(tel.getQualifiedName().toString()
                    + "." + node.getName() + "()", KIND_METHOD);
            stack.push(vertex);

            // add references to this class and supertypes
            printIndented("[add edge " + tel.getQualifiedName() + "(self)]", level);
            Vertex target = ensureVertex(tel.getQualifiedName().toString(),
                    KIND_CLASS);
            ensureEdge(stack.peek(), target, "self");
            for (TypeElement typeElement : getSupertypes(tel)) {
                printIndented("[add edge "
                        + typeElement.getQualifiedName() + "(self)]", level);
                target = ensureVertex(typeElement.getQualifiedName().toString(),
                        KIND_CLASS);
                ensureEdge(stack.peek(), target, "self");
            }

        }

        Void retval = super.visitMethod(node, p);
        if (level == 2) { // end of method in toplevel class
            printIndented("[remove method vertex from stack]", level);
            stack.pop();
        }
        return retval;
    }

    @Override
    public Void visitVariable(VariableTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);

        currentEdgeClassifier = "use";
        if (level == 2) { // field
            printIndented("[set edge type to \"field\"]", level);
            currentEdgeClassifier = "field";
        } else if (level == 3) {
            printIndented("[set edge type to \"arg\"]", level);
            currentEdgeClassifier = "arg";
        }
        Void retval = super.visitVariable(node, p);
        printIndented("[set edge type to \"use\"]", level);

        currentEdgeClassifier = "use";

        return retval;
    }

    @Override
    public Void visitIdentifier(IdentifierTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (level > 2) { // filter out some package identifiers etc.

            if (el.getKind() == ElementKind.CLASS
                    || el.getKind() == ElementKind.ENUM
                    || el.getKind() == ElementKind.INTERFACE) {

                TypeElement tel = (TypeElement) el;

                printIndented("[add edge '" + tel.getQualifiedName() + "' ("
                        + currentEdgeClassifier + ")]", level);
                Vertex target = ensureVertex(tel.getQualifiedName().toString(),
                        KIND_CLASS);
                ensureEdge(stack.peek(), target, currentEdgeClassifier);

                if (currentEdgeClassifier != null
                        && (currentEdgeClassifier.equals("field")
                        || currentEdgeClassifier.equals("arg")
                        || currentEdgeClassifier.equals("constr"))) {

                    // add all superclasses also
                    for (TypeElement typeElement : getSupertypes(tel)) {
                        printIndented("[add edge '" + typeElement.getQualifiedName() + "' ("
                                + currentEdgeClassifier + ")]", level);

                        target = ensureVertex(typeElement.getQualifiedName().toString(),
                                KIND_CLASS);
                        ensureEdge(stack.peek(), target, currentEdgeClassifier);
                    }
                }
            }
        }

        Void retval = super.visitIdentifier(node, p);
        return retval;
    }

    @Override
    public Void visitMethodInvocation(MethodInvocationTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        ExecutableElement exl = (ExecutableElement) info.getTrees().getElement(currentPath);

        if (exl.getModifiers().contains(Modifier.STATIC)) { // static method calls are allowed
            return super.visitMethodInvocation(node, p);
        }

        TypeElement enclosingClassElement = (TypeElement) exl.getEnclosingElement();
        printIndented("[add edge " + enclosingClassElement.getQualifiedName() + " (use)]", level);
        Vertex target = ensureVertex(enclosingClassElement.getQualifiedName().toString(),
                KIND_CLASS);
        ensureEdge(stack.peek(), target, currentEdgeClassifier);

        return super.visitMethodInvocation(node, p);
    }

    @Override
    public Void visitMemberSelect(MemberSelectTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);

        if (inclass) {
            if (el.getKind() == ElementKind.FIELD) {
                TypeElement enclosingClassElement = (TypeElement) el.getEnclosingElement();
                printIndented("[member add edge " + enclosingClassElement.getQualifiedName() + " (use)]", level);
                Vertex target = ensureVertex(enclosingClassElement.getQualifiedName().toString(),
                        KIND_CLASS);
                ensureEdge(stack.peek(), target, currentEdgeClassifier);
            }
        }

        Void retval = super.visitMemberSelect(node, p);

        return retval;
    }

    @Override
    public Void visitNewClass(NewClassTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        String backup = currentEdgeClassifier;
        currentEdgeClassifier = "constr";
        printIndented("[change classifier to \"constr\"]", level);
        Void retval = super.visitNewClass(node, p);
        currentEdgeClassifier = backup;
        printIndented("[change classifier back to \"" + backup + "\"]", level);
        return retval;
    }

    @Override
    public Void visitNewArray(NewArrayTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        String backup = currentEdgeClassifier;
        currentEdgeClassifier = "constr";
        printIndented("[change classifier to \"constr\"]", level);
        Void retval = super.visitNewArray(node, p);
        currentEdgeClassifier = backup;
        printIndented("[change classifier back to \"" + backup + "\"]", level);
        return retval;
    }

    private int getNestingLevel(TreePath treePath) {
        int level = 0;
        TreePath tp = treePath;
        while ((tp = tp.getParentPath()) != null) {
            level++;
        }
        return level;
    }

    private Set<TypeElement> getSupertypes(TypeElement tel) {
        Set<TypeElement> superTypes = new HashSet<TypeElement>();
        while (tel.getSuperclass().getKind() != TypeKind.NONE) {
            tel = (TypeElement) ((DeclaredType) tel.getSuperclass()).asElement();
            superTypes.add(tel);
        }
        return superTypes;
    }

    private void printIndented(String string, int level) {
        // InputOutput localIo = IOProvider.getDefault().getIO("DG-analysis-tree", false);
      /*  String indentation = "";
        for (int i = 0; i < level; i++) {
        indentation += "    ";
        }
        io.getOut().println("[" + level + "] " + indentation + string); */
        io.getOut().println(string);
    }

    private Vertex ensureVertex(String name, String kind) {
        Vertex vertex = graph.getVertexByNameAndKind(name, kind);
        if (vertex == null) {
            vertex = Vertex.create(name, kind);
            graph.addVertex(vertex);
        }
        return vertex;
    }

    private Edge ensureEdge(Vertex tail, Vertex head, String classifier) {
        Edge edge = graph.getEdgeByVerticesAndClassifier(tail, head, classifier);
        if (edge == null) {
            io.getOut().println("create : " + tail.getName() + " - " + head.getName() + " - " + classifier);

            edge = Edge.create(tail, head, classifier);
            graph.addEdge(edge);
        }
        return edge;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }
}
