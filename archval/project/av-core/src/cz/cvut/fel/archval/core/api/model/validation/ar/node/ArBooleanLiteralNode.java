package cz.cvut.fel.archval.core.api.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArBooleanNodeIface;
import cz.cvut.fel.archval.core.api.types.DataType;

/**
 * Represents boolean literal node (true or false).
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArBooleanLiteralNode implements ArBooleanNodeIface {

    private boolean value;

    public Boolean evaluate(Graph graph, Edge edge, DataType expectedType) {
        return value;
    }

    public Boolean evaluate(Graph graph, Vertex vertex, DataType expectedType) {
        return value;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}
