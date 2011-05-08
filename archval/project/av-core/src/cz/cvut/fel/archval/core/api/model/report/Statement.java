package cz.cvut.fel.archval.core.api.model.report;

/**
 * Represents some statement about some object. It's just simple text.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public abstract class Statement {

    private String statement;
    private String graph;

    public String getGraph() {
        return graph;
    }

    public void setGraph(String graph) {
        this.graph = graph;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
}
