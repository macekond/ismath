package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.report.DataResult;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;
import cz.cvut.fel.archval.core.api.types.DataType;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArBooleanNodeIface;

/**
 * And operator node representation.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArAndNode implements ArBooleanNodeIface {

    private ArBooleanNodeIface left;
    private ArBooleanNodeIface right;

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

    public Boolean evaluate(Graph graph, Edge edge, ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        DataResult leftDataResult = new DataResult();
        DataResult rightDataResult = new DataResult();
        dataResult.addChild(leftDataResult);
        dataResult.addChild(rightDataResult);
        Boolean leftResult = left.evaluate(graph, edge, leftDataResult);
        Boolean rightResult = right.evaluate(graph, edge, rightDataResult);
        Boolean result = leftResult && rightResult;
        dataResult.setResult(result);
        dataResult.setDataType(DataType.BOOLEAN);
        return result;
    }

    public Boolean evaluate(Graph graph, Vertex vertex, ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        DataResult leftDataResult = new DataResult();
        DataResult rightDataResult = new DataResult();
        dataResult.addChild(leftDataResult);
        dataResult.addChild(rightDataResult);
        Boolean leftResult = left.evaluate(graph, vertex, leftDataResult);
        Boolean rightResult = right.evaluate(graph, vertex, rightDataResult);
        Boolean result = leftResult && rightResult;
        dataResult.setResult(result);
        dataResult.setDataType(DataType.BOOLEAN);
        return result;
    }
}
