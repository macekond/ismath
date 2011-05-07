package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArBooleanNodeIface;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArObjectNodeIface;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents predicate node.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArPredicateNode implements ArBooleanNodeIface {

    private List<ArObjectNodeIface> operands;
    private OperatorIface operator;

    public ArPredicateNode() {
        operands = new LinkedList<ArObjectNodeIface>();
    }

    public void addOperand(ArObjectNodeIface arObjectNodeIface) {
        operands.add(arObjectNodeIface);
    }

    public void setOperator(OperatorIface operator) {
        this.operator = operator;
    }

    public Boolean evaluate(Graph graph, Vertex vertex) {
        List<Object> list = new LinkedList<Object>();
        for (ArObjectNodeIface arObjectNodeIface : operands) {
            list.add(arObjectNodeIface.evaluate(graph, vertex));
        }
        return (Boolean) operator.execute(graph, list);
    }

    public Boolean evaluate(Graph graph, Edge edge) {
        List<Object> list = new LinkedList<Object>();
        for (ArObjectNodeIface arObjectNodeIface : operands) {
            list.add(arObjectNodeIface.evaluate(graph, edge));
        }
        return (Boolean) operator.execute(graph, list);
    }
}
