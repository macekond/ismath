package cz.cvut.fel.archval.demeter.graphgen;

import cz.cvut.fel.archval.core.api.model.graph.Graph;
import java.io.IOException;
import org.netbeans.api.java.source.CompilationController;
import org.netbeans.api.java.source.JavaSource;
import org.netbeans.api.java.source.Task;

/**
 * Represents graph generating task for one javasource.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ScanTask implements Task<CompilationController> {

    private Graph graph;

    public ScanTask(Graph graph) {
        this.graph = graph;
    }

    public void run(CompilationController compilationController) throws Exception {

        compilationController.toPhase(JavaSource.Phase.RESOLVED);

        if (compilationController.getCompilationUnit() != null) {
            SourceMemberVisitor sourceMemberVisitor =
                    new SourceMemberVisitor(compilationController);
            sourceMemberVisitor.setGraph(graph);
            sourceMemberVisitor.scan(compilationController.getCompilationUnit(),
                    null);
        } else {
            throw new IOException("Couldn't get compilation unit.");
        }
    }
}
