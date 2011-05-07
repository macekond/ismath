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
    private String graphType;

    public String getGraphType() {
        return graphType;
    }

    public void setGraphType(String graphType) {
        this.graphType = graphType;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    /**
     * Visitor pattern implementation. This method accepts visitor, which
     * iterates allover the graph edges and vertices.
     * 
     * @param graphElementVisitor class implementing visitor interface, which receive the data
     */
    public void accept(GraphElementVisitor graphElementVisitor) {
        for (Edge edge : edges) {
            edge.accept(graphElementVisitor);
        }
        for (Vertex vertex : vertices) {
            vertex.accept(graphElementVisitor);
        }
    }
}
