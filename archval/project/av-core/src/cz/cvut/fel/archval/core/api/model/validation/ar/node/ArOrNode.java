package cz.cvut.fel.archval.core.api.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArBooleanNodeIface;
import cz.cvut.fel.archval.core.api.types.DataType;

/**
 * Or operator node implementation.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArOrNode implements ArBooleanNodeIface {

    private ArBooleanNodeIface left;
    private ArBooleanNodeIface right;

    public Boolean evaluate(Graph graph, Edge edge, DataType expectedType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean evaluate(Graph graph, Vertex vertex, DataType expectedType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

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
}
