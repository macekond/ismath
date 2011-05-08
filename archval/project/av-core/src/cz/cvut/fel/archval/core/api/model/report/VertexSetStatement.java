package cz.cvut.fel.archval.core.api.model.report;

import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import java.util.Set;

/**
 * Represents some statement about set of vertices.
 * 
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class VertexSetStatement extends Statement {

    private Set<Vertex> vertexSet;

    public Set<Vertex> getVertexSet() {
        return vertexSet;
    }

    public void setVertexSet(Set<Vertex> vertexSet) {
        this.vertexSet = vertexSet;
    }
}
