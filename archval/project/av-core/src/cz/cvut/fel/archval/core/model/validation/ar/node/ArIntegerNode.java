package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.report.DataResult;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;
import cz.cvut.fel.archval.core.api.types.DataType;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArIntegerNodeIface;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArIntegerNode implements ArIntegerNodeIface {

    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer evaluate(Graph graph, Vertex vertex, ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        return evaluate(resultNode);
    }

    public Integer evaluate(Graph graph, Edge edge, ResultNode resultNode) {
        return evaluate(resultNode);
    }

    protected Integer evaluate(ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        dataResult.setResult(value);
        dataResult.setDataType(DataType.NUMBER);
        return value;
    }
}
