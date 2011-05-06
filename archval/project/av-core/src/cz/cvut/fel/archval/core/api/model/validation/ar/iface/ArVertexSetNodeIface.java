package cz.cvut.fel.archval.core.api.model.validation.ar.iface;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface ArVertexSetNodeIface extends ArObjectNodeIface {

    public Set<Vertex> evaluate(Graph graph, Vertex vertex,
            DataType expectedType);

    public Set<Vertex> evaluate(Graph graph, Edge edge,
            DataType expectedType);
}
