package cz.cvut.fel.archval.core.api.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArBooleanNodeIface;
import cz.cvut.fel.archval.core.api.types.DataType;

/**
 * Not operator node implementation.
 * 
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArNotNode implements ArBooleanNodeIface {

    private ArBooleanNodeIface operand;

    public Boolean evaluate(Graph graph, Edge edge, DataType expectedType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean evaluate(Graph graph, Vertex vertex, DataType expectedType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArBooleanNodeIface getOperand() {
        return operand;
    }

    public void setOperand(ArBooleanNodeIface operand) {
        this.operand = operand;
    }
}
