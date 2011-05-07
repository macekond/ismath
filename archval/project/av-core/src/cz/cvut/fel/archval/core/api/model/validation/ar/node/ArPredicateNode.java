package cz.cvut.fel.archval.core.api.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArBooleanNodeIface;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArObjectNodeIface;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.List;

/**
 * Represents predicate node.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArPredicateNode implements ArBooleanNodeIface {

    private List<ArObjectNodeIface> operands;
    private OperatorIface operator;

    public void addOperand(ArObjectNodeIface arObjectNodeIface) {
        operands.add(arObjectNodeIface);
    }

    public void setOperator(OperatorIface operator) {
        this.operator = operator;
    }

    public Boolean evaluate(Graph graph, Edge edge, DataType expectedType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean evaluate(Graph graph, Vertex vertex, DataType expectedType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
