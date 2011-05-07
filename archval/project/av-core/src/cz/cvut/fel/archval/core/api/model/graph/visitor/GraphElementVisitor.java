package cz.cvut.fel.archval.core.api.model.graph.visitor;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;

/**
 * Interface for visitor of the graph (can accept both edges and vertices).
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface GraphElementVisitor {

    /**
     * Visitor pattern implementation. This method will be called with existing
     * edge from the graph.
     *
     * @param edge edge which can be processed by the visitor implementing class
     */
    public void visit(Edge edge);

    /**
     * Visitor pattern implementation. This method will be called with existing
     * edge from the graph.
     *
     * @param vertex vertex which can be processed by the visitor implementing class
     */
    public void visit(Vertex vertex);
}
