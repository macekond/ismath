package cz.cvut.fel.archval.core.api.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArEdgeNodeIface;
import cz.cvut.fel.archval.core.api.types.DataType;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArEdgeNode implements ArEdgeNodeIface {

    public Edge evaluate(Graph graph, Vertex vertex, DataType expectedType) {
        throw new IllegalStateException("This method can't be called in edge "
                + "bound rule.");
    }

    public Edge evaluate(Graph graph, Edge edge, DataType expectedType) {
        return edge;
    }
}
