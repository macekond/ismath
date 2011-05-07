package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.report.DataResult;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;
import cz.cvut.fel.archval.core.api.types.DataType;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArBooleanNodeIface;

/**
 * Represents boolean literal node (true or false).
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArBooleanLiteralNode implements ArBooleanNodeIface {

    private boolean value;

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public Boolean evaluate(Graph graph, Edge edge, ResultNode resultNode) {
        return evaluate(resultNode);
    }

    public Boolean evaluate(Graph graph, Vertex vertex, ResultNode resultNode) {
        return evaluate(resultNode);
    }

    protected Boolean evaluate(ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        dataResult.setResult(value);
        dataResult.setDataType(DataType.BOOLEAN);
        return value;
    }
}
