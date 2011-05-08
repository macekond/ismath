package cz.cvut.fel.archval.core.api.model.report;

import java.util.List;

/**
 * Represents output from one performed analysis.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class AnalysisResult {

    private String analysisName;
    private List<VertexSetStatement> vertexSetStatements;
    private List<EdgeSetStatement> edgeSetStatements;

    public String getAnalysisName() {
        return analysisName;
    }

    public void setAnalysisName(String analysisName) {
        this.analysisName = analysisName;
    }

    public List<EdgeSetStatement> getEdgeSetStatements() {
        return edgeSetStatements;
    }

    public List<VertexSetStatement> getVertexSetStatements() {
        return vertexSetStatements;
    }

    public void addVertexSetStatement(VertexSetStatement setStatement) {
        vertexSetStatements.add(setStatement);
    }

    public void addEdgeSetStatement(EdgeSetStatement setStatement) {
        edgeSetStatements.add(setStatement);
    }
}
