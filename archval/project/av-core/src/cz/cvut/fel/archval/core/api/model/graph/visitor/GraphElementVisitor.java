package cz.cvut.fel.archval.core.api.model.graph.visitor;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;

/**
 * Interface for visitor of the graph (can accept both edges and vertices).
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface GraphElementVisitor {

    public void visit(Edge edge);

    public void visit(Vertex vertex);
}
