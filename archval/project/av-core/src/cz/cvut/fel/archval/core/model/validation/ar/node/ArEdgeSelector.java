package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.report.DataResult;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArEdgeSetNodeIface;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArObjectNodeIface;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArEdgeSelector implements ArEdgeSetNodeIface {

    private List<ArObjectNodeIface> operands;
    private OperatorIface operator;

    public ArEdgeSelector() {
        operands = new LinkedList<ArObjectNodeIface>();
    }

    public void addOperand(ArObjectNodeIface operand) {
        operands.add(operand);
    }

    public void setOperator(OperatorIface operator) {
        this.operator = operator;
    }

    public Set<Edge> evaluate(Graph graph, Vertex vertex, ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        List<Object> results = new LinkedList<Object>();
        for (ArObjectNodeIface arObjectNodeIface : operands) {
            DataResult childDataResult = new DataResult();
            dataResult.addChild(childDataResult);
            results.add(arObjectNodeIface.evaluate(graph, vertex, childDataResult));
        }
        Set<Edge> result = (Set<Edge>) operator.execute(graph, results);
        dataResult.setResult(result);
        dataResult.setDataType(DataType.EDGE_SET);
        return result;
    }

    public Set<Edge> evaluate(Graph graph, Edge edge, ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        List<Object> results = new LinkedList<Object>();
        for (ArObjectNodeIface arObjectNodeIface : operands) {
            DataResult childDataResult = new DataResult();
            dataResult.addChild(childDataResult);
            results.add(arObjectNodeIface.evaluate(graph, edge, childDataResult));
        }
        Set<Edge> result = (Set<Edge>) operator.execute(graph, results);
        dataResult.setResult(result);
        dataResult.setDataType(DataType.EDGE_SET);
        return result;
    }
}
