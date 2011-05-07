package cz.cvut.fel.archval.core.api.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArEdgeSetNodeIface;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArObjectNodeIface;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArEdgeSelector implements ArEdgeSetNodeIface {

    private List<ArObjectNodeIface> operands;
    private OperatorIface operator;

    public void addOperand(ArObjectNodeIface operand) {
        operands.add(operand);
    }

    public void setOperator(OperatorIface operator) {
        this.operator = operator;
    }

    public Set<Edge> evaluate(Graph graph, Vertex vertex, DataType expectedType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set<Edge> evaluate(Graph graph, Edge edge, DataType expectedType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
