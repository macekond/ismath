package cz.cvut.fel.archval.core.api;

import cz.cvut.fel.archval.core.api.ex.GraphGeneratorNotFoundException;
import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import java.io.File;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface GraphModelGeneratorIface {

    /**
     * Returns graph model composed of Graph of required types or throws
     * GraphGeneratorNotFoundException
     *
     * @param requiredGraphTypes set of string representing required graphs
     * @return GraphModel created using GraphGenerators available from GraphGenerator register
     * @throws GraphGeneratorNotFoundException if some of required graph generators was not found
     */
    public GraphModel generateModel(Set<String> requiredGraphTypes, File projectDirectory) throws Exception;
}
