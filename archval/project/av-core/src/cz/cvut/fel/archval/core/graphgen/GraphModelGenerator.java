package cz.cvut.fel.archval.core.graphgen;

import cz.cvut.fel.archval.core.api.GraphModelGeneratorIface;
import cz.cvut.fel.archval.core.api.register.GraphGeneratorsRegisterIface;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class GraphModelGenerator implements GraphModelGeneratorIface {

    private GraphGeneratorsRegisterIface graphGeneratorsRegister;

    public GraphModelGenerator(GraphGeneratorsRegisterIface generatorsRegister) {
    }
}
