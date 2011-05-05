package cz.cvut.fel.archval.core;

import cz.cvut.fel.archval.core.api.GraphModelGeneratorIface;
import cz.cvut.fel.archval.core.api.ValidationModelGeneratorIface;
import cz.cvut.fel.archval.core.api.ValidationTaskIface;
import cz.cvut.fel.archval.core.api.graphgen.GraphModelGenerator;
import cz.cvut.fel.archval.core.api.task.ValidationTask;
import cz.cvut.fel.archval.core.api.valgen.ValidationModelGenerator;
import cz.cvut.fel.archval.core.model.graph.GraphModel;
import cz.cvut.fel.archval.core.model.validation.ValidationModel;

/**
 * This class serves as facade to all Archval functionality.
 * 
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public abstract class ArchVal {

    private static GraphModelGeneratorIface graphModelGenerator;
    private static ValidationModelGeneratorIface validationModelGenerator;

    public static GraphModelGeneratorIface getGraphModelGenerator() {
        if (graphModelGenerator == null) {
            graphModelGenerator = new GraphModelGenerator();
        }
        return graphModelGenerator;
    }

    public static ValidationModelGeneratorIface getValidationModelGenerator() {
        if (validationModelGenerator == null) {
            validationModelGenerator = new ValidationModelGenerator();
        }
        return validationModelGenerator;
    }

    public static ValidationTaskIface createValidationTask(
            GraphModel graphModel,
            ValidationModel validationModel) {
        return new ValidationTask(graphModel, validationModel);
    }
}
