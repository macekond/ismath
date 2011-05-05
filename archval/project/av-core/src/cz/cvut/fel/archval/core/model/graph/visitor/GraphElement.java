package cz.cvut.fel.archval.core.model.graph.visitor;

/**
 * Interface to be implemented by each element of the graph to allow external
 * entity to be accessed using visitor pattern.
 * 
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface GraphElement {

    public void accept(GraphElementVisitor graphElementVisitor);
}
