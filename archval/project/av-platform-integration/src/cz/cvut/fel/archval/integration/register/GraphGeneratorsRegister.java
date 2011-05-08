
package cz.cvut.fel.archval.integration.register;

import cz.cvut.fel.archval.core.api.graphgen.GraphGeneratorIface;
import cz.cvut.fel.archval.core.api.register.GraphGeneratorsRegisterIface;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class GraphGeneratorsRegister implements GraphGeneratorsRegisterIface {

    public Set<String> getAvaliableGeneratorTypes() {
        // TODO: implement
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public GraphGeneratorIface getGraphGeneratorByType(String type) {
        // TODO: implement
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
