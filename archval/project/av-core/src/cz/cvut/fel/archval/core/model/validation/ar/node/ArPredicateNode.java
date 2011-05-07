package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.report.DataResult;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArBooleanNodeIface;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArObjectNodeIface;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
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

    public Boolean evaluate(Graph graph, Vertex vertex, ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        List<Object> list = new LinkedList<Object>();
        for (ArObjectNodeIface arObjectNodeIface : operands) {
            DataResult childDataResult = new DataResult();
            dataResult.addChild(childDataResult);
            list.add(arObjectNodeIface.evaluate(graph, vertex, childDataResult));
        }
        Boolean result = (Boolean) operator.execute(graph, list);
        dataResult.setResult(result);
        dataResult.setDataType(DataType.BOOLEAN);
        return result;
    }

    public Boolean evaluate(Graph graph, Edge edge, ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        List<Object> list = new LinkedList<Object>();
        for (ArObjectNodeIface arObjectNodeIface : operands) {
            DataResult childDataResult = new DataResult();
            dataResult.addChild(childDataResult);
            list.add(arObjectNodeIface.evaluate(graph, edge, childDataResult));
        }
        Boolean result = (Boolean) operator.execute(graph, list);
        dataResult.setResult(result);
        dataResult.setDataType(DataType.BOOLEAN);
        return result;
    }
}
