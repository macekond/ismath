package cz.cvut.fel.archval.integration.register;

import cz.cvut.fel.archval.core.api.graphgen.GraphGeneratorIface;
import cz.cvut.fel.archval.core.api.register.GraphGeneratorsRegisterIface;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import org.openide.util.Lookup;

/**
 * GraphGeneratorsRegisterIface implementation. Implemented as a singleton.
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class GraphGeneratorsRegister implements GraphGeneratorsRegisterIface {

    private HashMap<String, GraphGeneratorIface> graphGeneratorsMap;
    private static GraphGeneratorsRegister instance;

    private GraphGeneratorsRegister() throws DuplicateGraphGeneratorException {
        graphGeneratorsMap = new HashMap<String, GraphGeneratorIface>();
        Collection<? extends GraphGeneratorIface> graphGenerators =
                Lookup.getDefault().lookupAll(GraphGeneratorIface.class);
        for (GraphGeneratorIface graphGenerator : graphGenerators) {
            if (graphGeneratorsMap.containsKey(graphGenerator.getGraphType())) {
                throw new DuplicateGraphGeneratorException("Multiple graph "
                        + "generators with the same type ("
                        + graphGenerator.getGraphType()
                        + ") found. Can't continue.");
            }
            graphGeneratorsMap.put(graphGenerator.getGraphType(),
                    graphGenerator);
        }

    }

    public static GraphGeneratorsRegister getInstance() throws DuplicateGraphGeneratorException {
        if (instance == null) {
            instance = new GraphGeneratorsRegister();
        }
        return instance;
    }

    public Set<String> getAvaliableGeneratorTypes() {
        return graphGeneratorsMap.keySet();
    }

    public GraphGeneratorIface getGraphGeneratorByType(String type) {
        return graphGeneratorsMap.get(type);
    }
}
