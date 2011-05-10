package cz.cvut.fel.archval.demeter.graphgen;

import cz.cvut.fel.archval.core.api.graphgen.GraphGeneratorIface;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.netbeans.api.java.source.CompilationController;
import org.netbeans.api.java.source.JavaSource;
import org.netbeans.api.java.source.Task;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

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

    protected void processJavaSource(JavaSource javaSource, final Graph graph) throws
            IOException, InterruptedException, ExecutionException {

        Task<CompilationController> task = new ScanTask(graph);
        Future<Void> visitorTask =
                javaSource.runWhenScanFinished(task, true);
        visitorTask.get(); // wait for task to finish
    }
}
