package cz.cvut.fel.archval.core.api.model.graph;

import cz.cvut.fel.archval.core.api.model.graph.visitor.GraphElementVisitor;
import java.util.List;

/**
 * Represents one graph generated for software project sources.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class Graph {

    // TODO: implement completely and test completely

    private List<Edge> edges;
    private List<Vertex> vertices;
    // add graph type

    public void accept(GraphElementVisitor graphElementVisitor) {
        for (Edge edge : edges) {
            edge.accept(graphElementVisitor);
        }
        for (Vertex vertex : vertices) {
            vertex.accept(graphElementVisitor);
        }
    }
}
