package cz.cvut.fel.archval.core.api.graphgen;

import cz.cvut.fel.archval.core.api.model.graph.Graph;

/**
 * Interface which must be implemented by graph generator provider.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface GraphGeneratorIface {

    public String getGraphType();

    // TODO: specify input for graph generator!!!
    public Graph getGraph();
}
