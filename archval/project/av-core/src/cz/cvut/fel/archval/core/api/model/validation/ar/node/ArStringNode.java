package cz.cvut.fel.archval.core.api.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArStringNodeIface;
import cz.cvut.fel.archval.core.api.types.DataType;

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

    public String evaluate(Graph graph, Vertex vertex, DataType expectedType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String evaluate(Graph graph, Edge edge, DataType expectedType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
