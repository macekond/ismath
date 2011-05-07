package cz.cvut.fel.archval.core.api.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArEdgeSetNodeIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArEdgeUnionNode implements ArEdgeSetNodeIface {

    private ArEdgeSetNodeIface left;
    private ArEdgeSetNodeIface right;

    public ArEdgeSetNodeIface getLeft() {
        return left;
    }

    public void setLeft(ArEdgeSetNodeIface left) {
        this.left = left;
    }

    public ArEdgeSetNodeIface getRight() {
        return right;
    }

    public void setRight(ArEdgeSetNodeIface right) {
        this.right = right;
    }

    public Set<Edge> evaluate(Graph graph, Vertex vertex, DataType expectedType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set<Edge> evaluate(Graph graph, Edge edge, DataType expectedType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
