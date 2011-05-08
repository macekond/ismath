package cz.cvut.fel.archval.core.api.register;

import cz.cvut.fel.archval.core.api.graphgen.GraphGeneratorIface;
import java.util.Set;

/**
 * Important integration interface. Represents list of object implementing
 * GraphGenerator interface in the system.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface GraphGeneratorsRegisterIface {

    /**
     * Returns set of all available graph types which can be generated using
     * existing graph generator providers.
     *
     * @return set of string denoting types of graph generators (or graphs)
     */
    public Set<String> getAvaliableGeneratorTypes();

    /**
     * Returns existing graph generator for requested type or null.
     *
     * @param type string representing graph type
     * @return existing graph generator instance or null if no such instance is found
     */
    public GraphGeneratorIface getGraphGeneratorByType(String type);
    
}
