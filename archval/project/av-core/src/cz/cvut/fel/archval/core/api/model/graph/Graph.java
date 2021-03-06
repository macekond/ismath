package cz.cvut.fel.archval.core.api.model.graph;

import cz.cvut.fel.archval.core.api.model.graph.visitor.GraphElementVisitor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents one graph generated for software project sources.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class Graph {

    private Set<Edge> edges;
    private Set<Vertex> vertices;
    private String graphType;

    public Graph() {
        edges = new HashSet<Edge>();
        vertices = new HashSet<Vertex>();
    }

    public String getGraphType() {
        return graphType;
    }

    public void setGraphType(String graphType) {
        this.graphType = graphType;
    }

    @Deprecated
    public Set<Vertex> getVertices() {
        for (Vertex vertex : vertices) {

            System.out.println("vertex: " + vertex.getName());
        }
        System.out.println();
        System.out.println();
        return vertices;
    }

    @Deprecated
    public Set<Edge> getEdges() {
        return edges;
    }

    public void addEdge(Edge edge) {
        if (!vertices.contains(edge.getHead())
                || !vertices.contains(edge.getTail())) {
                throw new IllegalArgumentException("You can add to the graph"
                        + "only edges joining existing elements.");
        }
        edges.add(edge);
    }

    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
    }

    public Set<Edge> getVertexOutgoingEdges(Vertex vertex) {
        Set<Edge> resultSet = new HashSet<Edge>();
        for (Edge edge : edges) {
            if (edge.getTail().equals(vertex)) {
                resultSet.add(edge);
            }
        }
        return resultSet;
    }

    /**
     * Returns vertex by its name or null if no such vertex is in the graph
     * @param name name of the vertex to be found
     * @return Vertex instance or null
     */
    public Vertex getVertexByName(String name) {
        for (Vertex vertex : vertices) {
            if (vertex.getName().equals(name)) {
                return vertex;
            }
        }
        return null;
    }

    public Vertex getVertexByNameAndKind(String name, String kind) {
        for (Vertex vertex : vertices) {
            if (vertex.getName().equals(name)
                    && vertex.getKind().equals(kind)) {
                
                return vertex;
            }
        }
        return null;
    }

    public Edge getEdgeByVerticesAndClassifier(Vertex tail, Vertex head, String classifier) {
        for (Edge edge : edges) {
            if (edge.getTail() == tail
                    && edge.getHead() == head
                    && edge.getClassifier().equals(classifier)) {
                return edge;
            }
        }
        return null;
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
