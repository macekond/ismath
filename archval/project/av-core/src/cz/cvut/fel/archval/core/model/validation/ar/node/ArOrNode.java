package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArBooleanNodeIface;

/**
 * Or operator node implementation.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArOrNode implements ArBooleanNodeIface {

    private ArBooleanNodeIface left;
    private ArBooleanNodeIface right;

    public ArBooleanNodeIface getLeft() {
        return left;
    }

    public void setLeft(ArBooleanNodeIface left) {
        this.left = left;
    }

    public ArBooleanNodeIface getRight() {
        return right;
    }

    public void setRight(ArBooleanNodeIface right) {
        this.right = right;
    }

    public Boolean evaluate(Graph graph, Vertex vertex) {
        Boolean leftResult = left.evaluate(graph, vertex);
        Boolean rightResult = right.evaluate(graph, vertex);
        return leftResult || rightResult;
    }

    public Boolean evaluate(Graph graph, Edge edge) {
        Boolean leftResult = left.evaluate(graph, edge);
        Boolean rightResult = right.evaluate(graph, edge);
        return leftResult || rightResult;
    }
}
