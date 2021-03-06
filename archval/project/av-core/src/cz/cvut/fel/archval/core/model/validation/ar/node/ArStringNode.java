package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.report.DataResult;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;
import cz.cvut.fel.archval.core.api.types.DataType;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArStringNodeIface;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArStringNode implements ArStringNodeIface {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String evaluate(Graph graph, Vertex vertex, ResultNode resultNode) {
        return evaluate(resultNode);
    }

    public String evaluate(Graph graph, Edge edge, ResultNode resultNode) {
        return evaluate(resultNode);
    }

    protected String evaluate(ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        dataResult.setResult(value);
        dataResult.setDataType(DataType.LABEL);
        return value;
    }
}
