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
import cz.cvut.fel.archval.core.api.graphgen.GraphGeneratorIface;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import org.netbeans.api.java.source.CompilationController;
import org.netbeans.api.java.source.CompilationInfo;
import org.netbeans.api.java.source.JavaSource;
import org.netbeans.api.java.source.Task;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;

/**
 * Graph which generates graph suitable for LoD analysis based on specified
 * project directory. The project directory may contain some prebuilt (or 
 * hand generated) version of the graph, which can be directly used.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class DemeterGraphGenerator implements GraphGeneratorIface {

    public String getGraphType() {
        return "demeter_graph";
    }

    public Graph getGraph(File projectDirectory) throws IOException, InterruptedException, ExecutionException {

        Graph graph = new Graph();

        FileObject projectDirectoryFileObject =
                FileUtil.toFileObject(projectDirectory);

        Enumeration<? extends FileObject> children =
                projectDirectoryFileObject.getChildren(true);

        for (Enumeration<? extends FileObject> en =
                children; en.hasMoreElements();) {

            FileObject fo = en.nextElement();
            if (fo.isFolder()) {
                continue;
            }
            JavaSource js = JavaSource.forFileObject(fo);
            if (js == null) {
                continue;
            }
            processJavaSource(js, graph);
        }
        return graph;
    }

    protected void processJavaSource(JavaSource javaSource, Graph graph) throws
            IOException, InterruptedException, ExecutionException {

        // TODO: process java source and add all elements to graph
        InputOutput io = IOProvider.getDefault().getIO("DG-analysis", false);
        io.getOut().println();

        Task<CompilationController> task = new Task<CompilationController>() {

            @Override
            public void run(CompilationController compilationController) throws
                    Exception {

                compilationController.toPhase(JavaSource.Phase.RESOLVED);

                if (compilationController.getCompilationUnit() != null) {
                    new MemberVisitor(compilationController).scan(
                            compilationController.getCompilationUnit(), null);
                } else {
                    throw new IOException("Couldn't get compilation unit.");
                }
            }
        };
        Future<Void> visitorTask =
                javaSource.runWhenScanFinished(task, true);
        visitorTask.get();
    }

    private static class MemberVisitor extends TreePathScanner<Void, Void> {

        private CompilationInfo info;
        private InputOutput io = IOProvider.getDefault().getIO("DG-analysis", false);

        public MemberVisitor(CompilationInfo info) {
            this.info = info;
            io.select();
        }

        public Void visitClass(ClassTree t, Void v) {
            TreePath currentPath = getCurrentPath();
            int level = getNestingLevel(currentPath);
            Element el = info.getTrees().getElement(currentPath);
            if (el == null) {
                StatusDisplayer.getDefault().setStatusText(
                        "Cannot resolve class!");
            } else {
                if (el.getKind() == ElementKind.CLASS || el.getKind() == ElementKind.INTERFACE) {
                    TypeElement typeElement = (TypeElement) el;
                    printIndented("class name: " + typeElement.getQualifiedName(), level);
                } else if (el.getKind() == ElementKind.ENUM) {
                    TypeElement typeElement = (TypeElement) el;
                    printIndented("enum name: " + typeElement.getQualifiedName(), level);
                }
            }
            return super.visitClass(t, v);
        }

        @Override
        public Void visitMethod(MethodTree node, Void p) {
            TreePath currentPath = getCurrentPath();
            int level = getNestingLevel(currentPath);
            printIndented("method: " + node.getName(), level);
            return super.visitMethod(node, p);
        }

        @Override
        public Void visitIdentifier(IdentifierTree node, Void p) {
            TreePath currentPath = getCurrentPath();
            int level = getNestingLevel(currentPath);
            Element el = info.getTrees().getElement(currentPath);
            if (el.getKind() == ElementKind.CLASS || el.getKind() == ElementKind.INTERFACE) {
                TypeElement typeElement = (TypeElement) el;
                printIndented("use of type: " + typeElement.getQualifiedName(), level);
            }
            return super.visitIdentifier(node, p);
        }

        @Override
        public Void visitVariable(VariableTree node, Void p) {
            TreePath currentPath = getCurrentPath();
            int level = getNestingLevel(currentPath);
            Element el = info.getTrees().getElement(currentPath);
            printIndented("variable: " + el.getSimpleName(), level);

            if (el.getKind() == ElementKind.CLASS || el.getKind() == ElementKind.INTERFACE) {
                TypeElement typeElement = (TypeElement) el;
                printIndented("variable type: " + typeElement.getQualifiedName(), level);
            }
            return super.visitVariable(node, p);
        }

        @Override
        public Void visitAnnotatedType(AnnotatedTypeTree node, Void p) {
            return super.visitAnnotatedType(node, p);
        }

        @Override
        public Void visitAnnotation(AnnotationTree node, Void p) {
            return super.visitAnnotation(node, p);
        }

        @Override
        public Void visitArrayAccess(ArrayAccessTree node, Void p) {
            return super.visitArrayAccess(node, p);
        }

        @Override
        public Void visitArrayType(ArrayTypeTree node, Void p) {
            return super.visitArrayType(node, p);
        }

        @Override
        public Void visitAssert(AssertTree node, Void p) {
            return super.visitAssert(node, p);
        }

        @Override
        public Void visitAssignment(AssignmentTree node, Void p) {
            return super.visitAssignment(node, p);
        }

        @Override
        public Void visitBinary(BinaryTree node, Void p) {
            return super.visitBinary(node, p);
        }

        @Override
        public Void visitBlock(BlockTree node, Void p) {
            return super.visitBlock(node, p);
        }

        @Override
        public Void visitBreak(BreakTree node, Void p) {
            return super.visitBreak(node, p);
        }

        @Override
        public Void visitCase(CaseTree node, Void p) {
            return super.visitCase(node, p);
        }

        @Override
        public Void visitCatch(CatchTree node, Void p) {
            return super.visitCatch(node, p);
        }

        @Override
        public Void visitCompilationUnit(CompilationUnitTree node, Void p) {
            return super.visitCompilationUnit(node, p);
        }

        @Override
        public Void visitCompoundAssignment(CompoundAssignmentTree node, Void p) {
            return super.visitCompoundAssignment(node, p);
        }

        @Override
        public Void visitConditionalExpression(ConditionalExpressionTree node, Void p) {
            return super.visitConditionalExpression(node, p);
        }

        @Override
        public Void visitContinue(ContinueTree node, Void p) {
            return super.visitContinue(node, p);
        }

        @Override
        public Void visitDoWhileLoop(DoWhileLoopTree node, Void p) {
            return super.visitDoWhileLoop(node, p);
        }

        @Override
        public Void visitEmptyStatement(EmptyStatementTree node, Void p) {
            return super.visitEmptyStatement(node, p);
        }

        @Override
        public Void visitEnhancedForLoop(EnhancedForLoopTree node, Void p) {
            return super.visitEnhancedForLoop(node, p);
        }

        @Override
        public Void visitErroneous(ErroneousTree node, Void p) {
            return super.visitErroneous(node, p);
        }

        @Override
        public Void visitExpressionStatement(ExpressionStatementTree node, Void p) {
            return super.visitExpressionStatement(node, p);
        }

        @Override
        public Void visitForLoop(ForLoopTree node, Void p) {
            return super.visitForLoop(node, p);
        }

        @Override
        public Void visitIf(IfTree node, Void p) {
            return super.visitIf(node, p);
        }

        @Override
        public Void visitImport(ImportTree node, Void p) {
            return super.visitImport(node, p);
        }

        @Override
        public Void visitInstanceOf(InstanceOfTree node, Void p) {
            return super.visitInstanceOf(node, p);
        }

        @Override
        public Void visitLabeledStatement(LabeledStatementTree node, Void p) {
            return super.visitLabeledStatement(node, p);
        }

        @Override
        public Void visitLiteral(LiteralTree node, Void p) {
            return super.visitLiteral(node, p);
        }

        @Override
        public Void visitMemberSelect(MemberSelectTree node, Void p) {
            return super.visitMemberSelect(node, p);
        }

        @Override
        public Void visitMethodInvocation(MethodInvocationTree node, Void p) {
            return super.visitMethodInvocation(node, p);
        }

        @Override
        public Void visitModifiers(ModifiersTree node, Void p) {
            return super.visitModifiers(node, p);
        }

        @Override
        public Void visitNewArray(NewArrayTree node, Void p) {
            return super.visitNewArray(node, p);
        }

        @Override
        public Void visitNewClass(NewClassTree node, Void p) {
            return super.visitNewClass(node, p);
        }

        @Override
        public Void visitOther(Tree node, Void p) {
            return super.visitOther(node, p);
        }

        @Override
        public Void visitParameterizedType(ParameterizedTypeTree node, Void p) {
            return super.visitParameterizedType(node, p);
        }

        @Override
        public Void visitParenthesized(ParenthesizedTree node, Void p) {
            return super.visitParenthesized(node, p);
        }

        @Override
        public Void visitPrimitiveType(PrimitiveTypeTree node, Void p) {
            return super.visitPrimitiveType(node, p);
        }

        @Override
        public Void visitReturn(ReturnTree node, Void p) {
            return super.visitReturn(node, p);
        }

        @Override
        public Void visitSwitch(SwitchTree node, Void p) {
            return super.visitSwitch(node, p);
        }

        @Override
        public Void visitSynchronized(SynchronizedTree node, Void p) {
            return super.visitSynchronized(node, p);
        }

        @Override
        public Void visitThrow(ThrowTree node, Void p) {
            return super.visitThrow(node, p);
        }

        @Override
        public Void visitTry(TryTree node, Void p) {
            return super.visitTry(node, p);
        }

        @Override
        public Void visitTypeCast(TypeCastTree node, Void p) {
            return super.visitTypeCast(node, p);
        }

        @Override
        public Void visitTypeParameter(TypeParameterTree node, Void p) {
            return super.visitTypeParameter(node, p);
        }

        @Override
        public Void visitUnary(UnaryTree node, Void p) {
            return super.visitUnary(node, p);
        }

        @Override
        public Void visitWhileLoop(WhileLoopTree node, Void p) {
            return super.visitWhileLoop(node, p);
        }

        @Override
        public Void visitWildcard(WildcardTree node, Void p) {
            return super.visitWildcard(node, p);
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
            String indentation = "";
            for (int i = 0; i < level; i++) {
                indentation += "    ";
            }
            io.getOut().println(indentation + string);
        }
    }
}
