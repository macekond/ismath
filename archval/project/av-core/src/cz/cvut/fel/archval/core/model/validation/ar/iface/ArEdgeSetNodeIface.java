package cz.cvut.fel.archval.core.model.validation.ar.iface;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface ArEdgeSetNodeIface extends ArObjectNodeIface {

    public Set<Edge> evaluate(Graph graph, Vertex vertex);

    public Set<Edge> evaluate(Graph graph, Edge edge);
}
