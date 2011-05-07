package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArBooleanNodeIface;

/**
 * Not operator node implementation.
 * 
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArNotNode implements ArBooleanNodeIface {

    private ArBooleanNodeIface operand;

    public ArBooleanNodeIface getOperand() {
        return operand;
    }

    public void setOperand(ArBooleanNodeIface operand) {
        this.operand = operand;
    }

    public Boolean evaluate(Graph graph, Vertex vertex) {
        return !operand.evaluate(graph, vertex);
    }

    public Boolean evaluate(Graph graph, Edge edge) {
        return !operand.evaluate(graph, edge);
    }
}
