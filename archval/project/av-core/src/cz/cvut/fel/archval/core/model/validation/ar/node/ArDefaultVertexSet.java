package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.graph.visitor.GraphElementVisitor;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArVertexSetNodeIface;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArDefaultVertexSet implements ArVertexSetNodeIface, GraphElementVisitor {

    private Set<Vertex> vertices;

    public Set<Vertex> evaluate(Graph graph, Vertex vertex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set<Vertex> evaluate(Graph graph, Edge edge) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set<Vertex> evaluate(Graph graph) {
        vertices = new HashSet<Vertex>();
        graph.accept(this);
        return vertices;
    }

    public void visit(Edge edge) {
        return;
    }

    public void visit(Vertex vertex) {
        vertices.add(vertex);
    }
}
