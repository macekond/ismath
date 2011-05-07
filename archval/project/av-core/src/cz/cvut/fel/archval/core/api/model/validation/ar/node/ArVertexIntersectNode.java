package cz.cvut.fel.archval.core.api.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArVertexSetNodeIface;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArVertexIntersectNode implements ArVertexSetNodeIface {

    private ArVertexSetNodeIface left;
    private ArVertexSetNodeIface right;

    public ArVertexSetNodeIface getLeft() {
        return left;
    }

    public void setLeft(ArVertexSetNodeIface left) {
        this.left = left;
    }

    public ArVertexSetNodeIface getRight() {
        return right;
    }

    public void setRight(ArVertexSetNodeIface right) {
        this.right = right;
    }

    public Set<Vertex> evaluate(Graph graph, Vertex vertex) {
        HashSet<Vertex> hashSet = new HashSet<Vertex>();
        hashSet.addAll(left.evaluate(graph, vertex));
        hashSet.retainAll(right.evaluate(graph, vertex));
        return hashSet;
    }

    public Set<Vertex> evaluate(Graph graph, Edge edge) {
        HashSet<Vertex> hashSet = new HashSet<Vertex>();
        hashSet.addAll(left.evaluate(graph, edge));
        hashSet.retainAll(right.evaluate(graph, edge));
        return hashSet;
    }
}
