package cz.cvut.fel.archval.core.api.model.graph;

import cz.cvut.fel.archval.core.api.model.graph.visitor.GraphElement;
import cz.cvut.fel.archval.core.api.model.graph.visitor.GraphElementVisitor;

/**
 * Domain object representing Vertex in the graph.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class Vertex implements GraphElement {

    private String name;
    private String kind;
    private long id;
    private static long idCounter = 1;

    private Vertex() {
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    private void setKind(String type) {
        this.kind = type;
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    /**
     * Special factory method, which ensures that newly created Vertex object is
     * properly initialized.
     * 
     * @param name name of the vertex to be created
     * @param kind type of the vertex to be created
     * @return new Vertex object
     */
    public static Vertex create(String name, String kind) {
        if (name == null || kind == null) {
            throw new IllegalArgumentException("Vertex object can't be created "
                    + "using null values. Please supply valid arguments to this "
                    + "method.");
        }
        Vertex vertex = new Vertex();
        vertex.setName(name);
        vertex.setKind(kind);
        vertex.setId(idCounter);
        idCounter++;
        return vertex;
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
