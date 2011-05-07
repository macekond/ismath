package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArEdgeSetNodeIface;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArEdgeSetminusNode implements ArEdgeSetNodeIface {

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

    public Set<Edge> evaluate(Graph graph, Vertex vertex) {
        HashSet<Edge> hashSet = new HashSet<Edge>();
        hashSet.addAll(left.evaluate(graph, vertex));
        hashSet.removeAll(right.evaluate(graph, vertex));
        return hashSet;
    }

    public Set<Edge> evaluate(Graph graph, Edge edge) {
        HashSet<Edge> hashSet = new HashSet<Edge>();
        hashSet.addAll(left.evaluate(graph, edge));
        hashSet.removeAll(right.evaluate(graph, edge));
        return hashSet;
    }
}
