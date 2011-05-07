package cz.cvut.fel.archval.core.model.validation.ar.iface;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface ArVertexNodeIface extends ArObjectNodeIface {

    public Vertex evaluate(Graph graph, Vertex vertex, ResultNode resultNode);

    public Vertex evaluate(Graph graph, Edge edge, ResultNode resultNode);
}
