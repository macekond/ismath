package cz.cvut.fel.archval.demeter.graphgen;

import com.sun.source.tree.ClassTree;
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
import org.netbeans.api.java.source.CompilationController;
import org.netbeans.api.java.source.CompilationInfo;
import org.netbeans.api.java.source.JavaSource;
import org.netbeans.api.java.source.Task;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.Exceptions;
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

        final InputOutput io = IOProvider.getDefault().getIO("DemeterGraphGen", true);
        io.select();

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
            processJavaSource(js, graph, io);
        }
        return graph;
    }

    protected void processJavaSource(JavaSource javaSource, Graph graph,
            InputOutput io) throws IOException, InterruptedException, ExecutionException {
        // TODO: process java source and add required elements to graph
        io.getOut().println("Processing next file.");

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

        public MemberVisitor(CompilationInfo info) {
            this.info = info;
        }

        @Override
        public Void visitClass(ClassTree t, Void v) {
            Element el = info.getTrees().getElement(getCurrentPath());
            if (el == null) {
                StatusDisplayer.getDefault().setStatusText(
                        "Cannot resolve class!");
            } else {
                InputOutput io = IOProvider.getDefault().getIO("Analysis of "
                        + info.getFileObject().getName(), true);
                if (el.getKind() == ElementKind.CONSTRUCTOR) {
                    io.getOut().println("Hurray, this is a constructor: "
                            + el.getSimpleName());
                } else if (el.getKind() == ElementKind.METHOD) {
                    io.getOut().println("Hurray, this is a method: "
                            + el.getSimpleName());
                } else if (el.getKind() == ElementKind.FIELD) {
                    io.getOut().println("Hurray, this is a field: "
                            + el.getSimpleName());
                } else {
                    io.getOut().println("Hurray, this is something else: "
                            + el.getSimpleName());
                }
                io.getOut().close();
            }
            return null;
        }
    }
}
