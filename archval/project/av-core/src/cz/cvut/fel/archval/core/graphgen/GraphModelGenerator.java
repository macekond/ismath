package cz.cvut.fel.archval.core.graphgen;

import cz.cvut.fel.archval.core.api.GraphModelGeneratorIface;
import cz.cvut.fel.archval.core.api.ex.GraphGeneratorNotFoundException;
import cz.cvut.fel.archval.core.api.graphgen.GraphGeneratorIface;
import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.register.GraphGeneratorsRegisterIface;
import java.io.File;
import java.util.Set;

/**
 * GraphModel generator. Generates required graph using GraphGeneratorIface
 * instances provided by GraphModelGeneratorRegisterIface instance.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class GraphModelGenerator implements GraphModelGeneratorIface {

    private GraphGeneratorsRegisterIface graphGeneratorsRegister;

    public GraphModelGenerator(GraphGeneratorsRegisterIface generatorsRegister) {
        this.graphGeneratorsRegister = generatorsRegister;
    }

    public GraphModel generateModel(Set<String> requiredGraphTypes,
            File projectDirectory) throws Exception {
        GraphModel graphModel = new GraphModel();
        for (String string : requiredGraphTypes) {
            GraphGeneratorIface graphGenerator = graphGeneratorsRegister.getGraphGeneratorByType(string);
            if (graphGenerator == null) {
                throw new GraphGeneratorNotFoundException("No such generator found.");
            }
            graphModel.addGraph(graphGenerator.getGraph(projectDirectory));
        }
        return graphModel;
    }
}
