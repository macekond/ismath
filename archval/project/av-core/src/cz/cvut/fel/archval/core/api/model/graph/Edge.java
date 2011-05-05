package cz.cvut.fel.archval.core.api.model.graph;

import cz.cvut.fel.archval.core.api.model.graph.visitor.GraphElement;
import cz.cvut.fel.archval.core.api.model.graph.visitor.GraphElementVisitor;

/**
 * Edge entity.
 *
 * Edge can be modified only during creation. Otherwise all components all read-only.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class Edge implements GraphElement {

    private Vertex tail;
    private Vertex head;
    private String classifier;
    private long id;
    private static long idCounter = 1;

    private Edge() {
    }

    public String getClassifier() {
        return classifier;
    }

    private void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    public Vertex getHead() {
        return head;
    }

    private void setHead(Vertex head) {
        this.head = head;
    }

    public Vertex getTail() {
        return tail;
    }

    private void setTail(Vertex tail) {
        this.tail = tail;
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    /**
     * Simple edge factory.
     *
     * Ensures that each edge in the system has unique id.
     */
    public static Edge create(Vertex tail, Vertex head, String classifier) {
        if (tail == null || head == null || classifier == null) {
            throw new IllegalArgumentException(
                    "Edge cannot be created using null vertex or classifier.");
        }
        Edge edge = new Edge();
        edge.tail = tail;
        edge.head = head;
        edge.classifier = classifier;
        edge.setId(idCounter);
        idCounter++;
        return edge;
    }

    /**
     * Visitor pattern implementation.
     *
     * @param graphElementVisitor
     */
    public void accept(GraphElementVisitor graphElementVisitor) {
        if (graphElementVisitor == null) {
            return;
        }
        graphElementVisitor.visit(this);
    }
}
