package cz.cvut.fel.archval.core.api.model.report;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents some statement about set of edges.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class EdgeSetStatement extends Statement {

    private Set<Edge> edgeSet;

    public EdgeSetStatement() {
        edgeSet = new HashSet<Edge>();
    }

    public Set<Edge> getEdgeSet() {
        return edgeSet;
    }

    public void setEdgeSet(Set<Edge> edgeSet) {
        this.edgeSet = edgeSet;
    }
}
