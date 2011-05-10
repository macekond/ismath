package cz.cvut.fel.archval.demeter.graphgen;

import com.sun.source.tree.AnnotatedTypeTree;
import com.sun.source.tree.AnnotationTree;
import com.sun.source.tree.ArrayAccessTree;
import com.sun.source.tree.ArrayTypeTree;
import com.sun.source.tree.AssertTree;
import com.sun.source.tree.AssignmentTree;
import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.BlockTree;
import com.sun.source.tree.BreakTree;
import com.sun.source.tree.CaseTree;
import com.sun.source.tree.CatchTree;
import com.sun.source.tree.ClassTree;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.CompoundAssignmentTree;
import com.sun.source.tree.ConditionalExpressionTree;
import com.sun.source.tree.ContinueTree;
import com.sun.source.tree.DoWhileLoopTree;
import com.sun.source.tree.EmptyStatementTree;
import com.sun.source.tree.EnhancedForLoopTree;
import com.sun.source.tree.ErroneousTree;
import com.sun.source.tree.ExpressionStatementTree;
import com.sun.source.tree.ForLoopTree;
import com.sun.source.tree.IdentifierTree;
import com.sun.source.tree.IfTree;
import com.sun.source.tree.ImportTree;
import com.sun.source.tree.InstanceOfTree;
import com.sun.source.tree.LabeledStatementTree;
import com.sun.source.tree.LiteralTree;
import com.sun.source.tree.MemberSelectTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.ModifiersTree;
import com.sun.source.tree.NewArrayTree;
import com.sun.source.tree.NewClassTree;
import com.sun.source.tree.ParameterizedTypeTree;
import com.sun.source.tree.ParenthesizedTree;
import com.sun.source.tree.PrimitiveTypeTree;
import com.sun.source.tree.ReturnTree;
import com.sun.source.tree.SwitchTree;
import com.sun.source.tree.SynchronizedTree;
import com.sun.source.tree.ThrowTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TryTree;
import com.sun.source.tree.TypeCastTree;
import com.sun.source.tree.TypeParameterTree;
import com.sun.source.tree.UnaryTree;
import com.sun.source.tree.VariableTree;
import com.sun.source.tree.WhileLoopTree;
import com.sun.source.tree.WildcardTree;
import com.sun.source.util.TreePath;
import com.sun.source.util.TreePathScanner;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import org.netbeans.api.java.source.CompilationInfo;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class SourceMemberVisitor extends TreePathScanner<Void, Void> {

    private CompilationInfo info;
    private InputOutput io = IOProvider.getDefault().getIO("DG-analysis", false);
    private Graph graph;

    public SourceMemberVisitor(CompilationInfo info) {
        this.info = info;
        io.select();
    }

    public Void visitClass(ClassTree node, Void v) {
        TreePath currentPath = getCurrentPath();
        Element el = info.getTrees().getElement(currentPath);
        int level = getNestingLevel(currentPath);
        printIndented("Class:", level);

        if (level == 1) { // toplevel class
            io.getOut().println("<Add class to stack here.>");
            TypeElement tel = (TypeElement) el;
            io.getOut().println("Class: " + tel.getQualifiedName());
            while (tel.getSuperclass().getKind() != TypeKind.NONE) {
                tel = (TypeElement) ((DeclaredType) tel.getSuperclass()).asElement();
                io.getOut().println(" - self - " + tel.getQualifiedName());
                printIndented("super: " + tel.getQualifiedName(), level);
            }
        }

        Void retval = super.visitClass(node, v);

        if (level == 1) {
            io.getOut().println("<Remove class from stack here.>");
        }

        /*
        TypeElement typeElement = (TypeElement) el;

        for (Element element : el.getEnclosedElements()) {
        printIndented(element.getKind().toString(), level + 1);
        }
        if (el.getKind() == ElementKind.CLASS) {
        printIndented("Class:" + typeElement.getQualifiedName(), level);
        retval = super.visitClass(node, v);
        printIndented(">  >Class", level);
        } else if (el.getKind() == ElementKind.INTERFACE) {
        printIndented("Interface: " + typeElement.getQualifiedName(), level);
        retval = super.visitClass(node, v);
        printIndented(">  >Interface", level);
        } else if (el.getKind() == ElementKind.ENUM) {
        printIndented("Enum: " + typeElement.getQualifiedName(), level);
        retval = super.visitClass(node, v);
        printIndented(">  >Enum", level);
        } else {
        printIndented("Unknown class type: " + typeElement.getQualifiedName(), level);
        retval = super.visitClass(node, v);
        printIndented(">  >Unknown class type", level);
        }*/
        return retval;
    }

    @Override
    public Void visitMethod(MethodTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);

        printIndented("Method: " + node.getName(), level);
        Void retval = super.visitMethod(node, p);
        printIndented(">  >Method", level);

        return retval;
    }

    @Override
    public Void visitVariable(VariableTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);


        Element el = info.getTrees().getElement(currentPath);

        if (level == 2) {
            TypeElement typeElement = (TypeElement) el.getEnclosingElement();

            io.getOut().println("Enclosing element of variable " + node.getName()
                    + " is " + typeElement.getQualifiedName());

        }
        printIndented("Variable: " + el.getSimpleName(), level);
        if (el.getKind() == ElementKind.CLASS || el.getKind() == ElementKind.INTERFACE) {
            printIndented("variable type: ", level);
        }
        Void retval = super.visitVariable(node, p);
        printIndented(">  >Variable", level);
        return retval;
    }

    @Override
    public Void visitIdentifier(IdentifierTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el.getKind() == ElementKind.CLASS || el.getKind() == ElementKind.INTERFACE) {
            TypeElement typeElement = (TypeElement) el;
            printIndented("Identifier: " + el.getKind() + " " + typeElement.getQualifiedName(), level);
        } else if (el.getKind() == ElementKind.CONSTRUCTOR) {
            ExecutableElement exl = (ExecutableElement) el;
            printIndented("Identifier: " + el.getKind() + " " + exl.getReturnType(), level);
        } else if (el.getKind() == ElementKind.FIELD) {
            VariableElement vel = (VariableElement) el;
            printIndented("Identifier (field): " + el.getKind() + " " + node.getName() + " " + vel.asType(), level);
        } else {
            printIndented("Identifier: " + el.getKind() + " " + el.getSimpleName(), level);
        }
        Void retval = super.visitIdentifier(node, p);
        printIndented(">  >Identifier", level);
        return retval;
    }

    @Override
    public Void visitMethodInvocation(MethodInvocationTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        ExecutableElement exl = (ExecutableElement) info.getTrees().getElement(currentPath);

        TypeElement myclass = (TypeElement) exl.getEnclosingElement();
        printIndented("enclosing element: " + myclass, level);

        if (node.getMethodSelect().getKind() == Tree.Kind.MEMBER_SELECT) {
            printIndented("methodselect", level);
            printIndented(((MemberSelectTree) node.getMethodSelect()).getIdentifier().toString(), level);
        } else if (node.getMethodSelect().getKind() == Tree.Kind.IDENTIFIER) {
            printIndented(((IdentifierTree) node.getMethodSelect()).getName().toString(), level);
        }

        if (exl.getModifiers().contains(Modifier.STATIC)) {
            printIndented("It's static method.", level);
        }
        if (el != null) {
            TypeElement type = null;
            printIndented("thishaskind: " + exl.getReturnType().getKind(), level);
            if (exl.getReturnType().getKind() == TypeKind.DECLARED) {
                // type = (TypeElement) ((DeclaredType) exl.getReturnType()).asElement().getKind();
                type = ((TypeElement) ((DeclaredType) exl.getReturnType()).asElement());

                for (TypeParameterElement typeParameterElement : type.getTypeParameters()) {

                    printIndented("parametrized::" + typeParameterElement.getKind(), level);
                    for (TypeMirror typeMirror : typeParameterElement.getBounds()) {

                        printIndented("cosi: " + typeMirror.getKind(), level);
                    }


                }

                printIndented("ithaskind: " + type.toString(), level);
            }
            printIndented("kind:: " + exl.getReturnType().getKind(), level);
        }
        Void retval = super.visitMethodInvocation(node, p);
        return retval;
    }

    @Override
    public Void visitMemberSelect(MemberSelectTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            if (el.getKind() == ElementKind.FIELD) {
                printIndented("MemberSelect: " + el.getKind() + " " + el.asType(), level);
            } else {
                printIndented("MemberSelect: " + el.getKind(), level);
            }
        } else {
            printIndented("MemberSelect:", level);
        }
        Void retval = super.visitMemberSelect(node, p);
        printIndented(">  >MemberSelect", level);
        return retval;
    }

    @Override
    public Void visitNewClass(NewClassTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("NewClass: " + el.getKind(), level);
        } else {
            printIndented("NewClass:", level);
        }
        Void retval = super.visitNewClass(node, p);
        printIndented(">  >NewClass", level);
        return retval;
    }

    @Override
    public Void visitAnnotatedType(AnnotatedTypeTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("AnnotatedType: " + el.getKind(), level);
        } else {
            printIndented("AnnotatedType:", level);
        }
        Void retval = super.visitAnnotatedType(node, p);
        printIndented(">  >AnnotatedType", level);
        return retval;
    }

    @Override
    public Void visitAnnotation(AnnotationTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Annotation: " + el.getKind(), level);
        } else {
            printIndented("Annotation:", level);
        }
        Void retval = super.visitAnnotation(node, p);
        printIndented(">  >Annotation", level);
        return retval;
    }

    @Override
    public Void visitArrayAccess(ArrayAccessTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("ArrayAccess: " + el.getKind(), level);
        } else {
            printIndented("ArrayAccess:", level);
        }
        Void retval = super.visitArrayAccess(node, p);
        printIndented(">  >ArrayAccess", level);
        return retval;
    }

    @Override
    public Void visitArrayType(ArrayTypeTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("ArrayType: " + el.getKind(), level);
        } else {
            printIndented("ArrayType:", level);
        }
        Void retval = super.visitArrayType(node, p);
        printIndented(">  >ArrayType", level);
        return retval;
    }

    @Override
    public Void visitAssert(AssertTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Assert: " + el.getKind(), level);
        } else {
            printIndented("Assert:", level);
        }
        Void retval = super.visitAssert(node, p);
        printIndented(">  >Assert", level);
        return retval;
    }

    @Override
    public Void visitAssignment(AssignmentTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Assignment: " + el.getKind(), level);
        } else {
            printIndented("Assignment:", level);
        }
        Void retval = super.visitAssignment(node, p);
        printIndented(">  >Assignment", level);
        return retval;
    }

    @Override
    public Void visitBinary(BinaryTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Binary: " + el.getKind(), level);
        } else {
            printIndented("Binary:", level);
        }
        Void retval = super.visitBinary(node, p);
        printIndented(">  >Binary", level);
        return retval;
    }

    @Override
    public Void visitBlock(BlockTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Block: " + el.getKind(), level);
        } else {
            printIndented("Block:", level);
        }
        Void retval = super.visitBlock(node, p);
        printIndented(">  >Block", level);
        return retval;
    }

    @Override
    public Void visitBreak(BreakTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Break: " + el.getKind(), level);
        } else {
            printIndented("Break:", level);
        }
        Void retval = super.visitBreak(node, p);
        printIndented(">  >Break", level);
        return retval;
    }

    @Override
    public Void visitCase(CaseTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Case: " + el.getKind(), level);
        } else {
            printIndented("Case:", level);
        }
        Void retval = super.visitCase(node, p);
        printIndented(">  >Case", level);
        return retval;
    }

    @Override
    public Void visitCatch(CatchTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Catch: " + el.getKind(), level);
        } else {
            printIndented("Catch:", level);
        }
        Void retval = super.visitCatch(node, p);
        printIndented(">  >Catch", level);
        return retval;
    }

    @Override
    public Void visitCompilationUnit(CompilationUnitTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("CompilationUnit: " + el.getKind(), level);
        } else {
            printIndented("CompilationUnit:", level);
        }
        Void retval = super.visitCompilationUnit(node, p);
        printIndented(">  >CompilationUnit", level);
        return retval;
    }

    @Override
    public Void visitCompoundAssignment(CompoundAssignmentTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("CompoundAssignment: " + el.getKind(), level);
        } else {
            printIndented("CompoundAssignment:", level);
        }
        Void retval = super.visitCompoundAssignment(node, p);
        printIndented(">  >CompoundAssignment", level);
        return retval;
    }

    @Override
    public Void visitConditionalExpression(ConditionalExpressionTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("ConditionalExpression: " + el.getKind(), level);
        } else {
            printIndented("ConditionalExpression:", level);
        }
        Void retval = super.visitConditionalExpression(node, p);
        printIndented(">  >ConditionalExpression", level);
        return retval;
    }

    @Override
    public Void visitContinue(ContinueTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Continue: " + el.getKind(), level);
        } else {
            printIndented("Continue:", level);
        }
        Void retval = super.visitContinue(node, p);
        printIndented(">  >Continue", level);
        return retval;
    }

    @Override
    public Void visitDoWhileLoop(DoWhileLoopTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("DoWhileLoop: " + el.getKind(), level);
        } else {
            printIndented("DoWhileLoop:", level);
        }
        Void retval = super.visitDoWhileLoop(node, p);
        printIndented(">  >DoWhileLoop", level);
        return retval;
    }

    @Override
    public Void visitEmptyStatement(EmptyStatementTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("EmptyStatement: " + el.getKind(), level);
        } else {
            printIndented("EmptyStatement:", level);
        }
        Void retval = super.visitEmptyStatement(node, p);
        printIndented(">  >EmptyStatement", level);
        return retval;
    }

    @Override
    public Void visitEnhancedForLoop(EnhancedForLoopTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("EnhancedForLoop: " + el.getKind(), level);
        } else {
            printIndented("EnhancedForLoop:", level);
        }
        Void retval = super.visitEnhancedForLoop(node, p);
        printIndented(">  >EnhancedForLoop", level);
        return retval;
    }

    @Override
    public Void visitErroneous(ErroneousTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Erroneous: " + el.getKind(), level);
        } else {
            printIndented("Erroneous:", level);
        }
        Void retval = super.visitErroneous(node, p);
        printIndented(">  >Erroneous", level);
        return retval;
    }

    @Override
    public Void visitExpressionStatement(ExpressionStatementTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("ExpressionStatement: " + el.getKind(), level);
        } else {
            printIndented("ExpressionStatement:", level);
        }
        Void retval = super.visitExpressionStatement(node, p);
        printIndented(">  >ExpressionStatement", level);
        return retval;
    }

    @Override
    public Void visitForLoop(ForLoopTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("ForLoop: " + el.getKind(), level);
        } else {
            printIndented("ForLoop:", level);
        }
        Void retval = super.visitForLoop(node, p);
        printIndented(">  >ForLoop", level);
        return retval;
    }

    @Override
    public Void visitIf(IfTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("If: " + el.getKind(), level);
        } else {
            printIndented("If:", level);
        }
        Void retval = super.visitIf(node, p);
        printIndented(">  >If", level);
        return retval;
    }

    @Override
    public Void visitImport(ImportTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Import: " + el.getKind(), level);
        } else {
            printIndented("Import:", level);
        }
        Void retval = super.visitImport(node, p);
        printIndented(">  >Import", level);
        return retval;
    }

    @Override
    public Void visitInstanceOf(InstanceOfTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("InstanceOf: " + el.getKind(), level);
        } else {
            printIndented("InstanceOf:", level);
        }
        Void retval = super.visitInstanceOf(node, p);
        printIndented(">  >InstanceOf", level);
        return retval;
    }

    @Override
    public Void visitLabeledStatement(LabeledStatementTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("LabeledStatement: " + el.getKind(), level);
        } else {
            printIndented("LabeledStatement:", level);
        }
        Void retval = super.visitLabeledStatement(node, p);
        printIndented(">  >LabeledStatement", level);
        return retval;
    }

    @Override
    public Void visitLiteral(LiteralTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Literal: " + el.getKind(), level);
        } else {
            printIndented("Literal:", level);
        }
        Void retval = super.visitLiteral(node, p);
        printIndented(">  >Literal", level);
        return retval;
    }

    @Override
    public Void visitModifiers(ModifiersTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Modifiers: " + el.getKind(), level);
        } else {
            printIndented("Modifiers:", level);
        }
        for (Modifier modifier : node.getFlags()) {
            printIndented("- " + modifier.toString(), level);
        }
        Void retval = super.visitModifiers(node, p);
        printIndented(">  >Modifiers", level);
        return retval;
    }

    @Override
    public Void visitNewArray(NewArrayTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("NewArray: " + el.getKind(), level);
        } else {
            printIndented("NewArray:", level);
        }
        Void retval = super.visitNewArray(node, p);
        printIndented(">  >NewArray", level);
        return retval;
    }

    @Override
    public Void visitOther(Tree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Other: " + el.getKind(), level);
        } else {
            printIndented("Other:", level);
        }
        Void retval = super.visitOther(node, p);
        printIndented(">  >Other", level);
        return retval;
    }

    @Override
    public Void visitParameterizedType(ParameterizedTypeTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("ParameterizedType: " + el.getKind(), level);
        } else {
            printIndented("ParameterizedType:", level);
        }
        Void retval = super.visitParameterizedType(node, p);
        printIndented(">  >ParameterizedType", level);
        return retval;
    }

    @Override
    public Void visitParenthesized(ParenthesizedTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Parenthesized: " + el.getKind(), level);
        } else {
            printIndented("Parenthesized:", level);
        }
        Void retval = super.visitParenthesized(node, p);
        printIndented(">  >Parenthesized", level);
        return retval;
    }

    @Override
    public Void visitPrimitiveType(PrimitiveTypeTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("PrimitiveType: " + el.getKind(), level);
        } else {
            printIndented("PrimitiveType:", level);
        }
        Void retval = super.visitPrimitiveType(node, p);
        printIndented(">  >PrimitiveType", level);
        return retval;
    }

    @Override
    public Void visitReturn(ReturnTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Return: " + el.getKind(), level);
        } else {
            printIndented("Return:", level);
        }
        Void retval = super.visitReturn(node, p);
        printIndented(">  >Return", level);
        return retval;
    }

    @Override
    public Void visitSwitch(SwitchTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Switch: " + el.getKind(), level);
        } else {
            printIndented("Switch:", level);
        }
        Void retval = super.visitSwitch(node, p);
        printIndented(">  >Switch", level);
        return retval;
    }

    @Override
    public Void visitSynchronized(SynchronizedTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Synchronized: " + el.getKind(), level);
        } else {
            printIndented("Synchronized:", level);
        }
        Void retval = super.visitSynchronized(node, p);
        printIndented(">  >Synchronized", level);
        return retval;
    }

    @Override
    public Void visitThrow(ThrowTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Throw: " + el.getKind(), level);
        } else {
            printIndented("Throw:", level);
        }
        Void retval = super.visitThrow(node, p);
        printIndented(">  >Throw", level);
        return retval;
    }

    @Override
    public Void visitTry(TryTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Try: " + el.getKind(), level);
        } else {
            printIndented("Try:", level);
        }
        Void retval = super.visitTry(node, p);
        printIndented(">  >Try", level);
        return retval;
    }

    @Override
    public Void visitTypeCast(TypeCastTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("TypeCast: " + el.getKind(), level);
        } else {
            printIndented("TypeCast:", level);
        }
        Void retval = super.visitTypeCast(node, p);
        printIndented(">  >TypeCast", level);
        return retval;
    }

    @Override
    public Void visitTypeParameter(TypeParameterTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("TypeParameter: " + el.getKind(), level);
        } else {
            printIndented("TypeParameter:", level);
        }
        Void retval = super.visitTypeParameter(node, p);
        printIndented(">  >TypeParameter", level);
        return retval;
    }

    @Override
    public Void visitUnary(UnaryTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Unary: " + el.getKind(), level);
        } else {
            printIndented("Unary:", level);
        }
        Void retval = super.visitUnary(node, p);
        printIndented(">  >Unary", level);
        return retval;
    }

    @Override
    public Void visitWhileLoop(WhileLoopTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("WhileLoop: " + el.getKind(), level);
        } else {
            printIndented("WhileLoop:", level);
        }
        Void retval = super.visitWhileLoop(node, p);
        printIndented(">  >WhileLoop", level);
        return retval;
    }

    @Override
    public Void visitWildcard(WildcardTree node, Void p) {
        TreePath currentPath = getCurrentPath();
        int level = getNestingLevel(currentPath);
        Element el = info.getTrees().getElement(currentPath);
        if (el != null) {
            printIndented("Wildcard: " + el.getKind(), level);
        } else {
            printIndented("Wildcard:", level);
        }
        Void retval = super.visitWildcard(node, p);
        printIndented(">  >Wildcard", level);
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

    private void printIndented(String string, int level) {
        InputOutput localIo = IOProvider.getDefault().getIO("DG-analysis-tree", false);
        String indentation = "";
        for (int i = 0; i < level; i++) {
            indentation += "    ";
        }
        localIo.getOut().println(indentation + string);
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }
}
