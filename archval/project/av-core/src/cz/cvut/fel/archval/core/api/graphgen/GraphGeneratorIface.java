package cz.cvut.fel.archval.core.api.graphgen;

import cz.cvut.fel.archval.core.api.model.graph.Graph;
import java.io.File;

/**
 * Interface which must be implemented by graph generator provider.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface GraphGeneratorIface {

    public String getGraphType();

    public Graph getGraph(File projectDirectory);
}
