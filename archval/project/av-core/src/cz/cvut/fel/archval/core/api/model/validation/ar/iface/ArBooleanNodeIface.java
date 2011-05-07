package cz.cvut.fel.archval.core.api.model.validation.ar.iface;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface ArBooleanNodeIface extends ArObjectNodeIface {

    public Boolean evaluate(Graph graph, Edge edge);

    public Boolean evaluate(Graph graph, Vertex vertex);
}
