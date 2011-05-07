package cz.cvut.fel.archval.core.api.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArVertexNodeIface;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArVertexNode implements ArVertexNodeIface {

    public Vertex evaluate(Graph graph, Vertex vertex) {
        return vertex;
    }

    public Vertex evaluate(Graph graph, Edge edge) {
        throw new IllegalStateException("This method can't be called in vertex "
                + "bound rule.");
    }
}
