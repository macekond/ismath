package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.report.DataResult;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;
import cz.cvut.fel.archval.core.api.types.DataType;
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

    public Boolean evaluate(Graph graph, Vertex vertex, ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        DataResult childDataResult = new DataResult();
        dataResult.addChild(childDataResult);
        Boolean result = !operand.evaluate(graph, vertex, childDataResult);
        dataResult.setResult(result);
        dataResult.setDataType(DataType.BOOLEAN);
        return result;
    }

    public Boolean evaluate(Graph graph, Edge edge, ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        DataResult childDataResult = new DataResult();
        dataResult.addChild(childDataResult);
        Boolean result = !operand.evaluate(graph, edge, childDataResult);
        dataResult.setResult(result);
        dataResult.setDataType(DataType.BOOLEAN);
        return result;
    }
}
