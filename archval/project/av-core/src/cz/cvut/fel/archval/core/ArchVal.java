package cz.cvut.fel.archval.core;

import cz.cvut.fel.archval.core.api.GraphModelGeneratorIface;
import cz.cvut.fel.archval.core.api.ValidationModelGeneratorIface;
import cz.cvut.fel.archval.core.api.ValidationTaskIface;
import cz.cvut.fel.archval.core.graphgen.GraphModelGenerator;
import cz.cvut.fel.archval.core.api.register.AnalysesRegisterIface;
import cz.cvut.fel.archval.core.api.register.GraphGeneratorsRegisterIface;
import cz.cvut.fel.archval.core.api.register.OperatorsRegisterIface;
import cz.cvut.fel.archval.core.task.ValidationTask;
import cz.cvut.fel.archval.core.valgen.ValidationModelGenerator;
import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.validation.ValidationModel;

/**
 * This class serves as facade to all Archval functionality.
 * 
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArchVal {

    private final GraphModelGeneratorIface graphModelGenerator;
    private final ValidationModelGeneratorIface validationModelGenerator;

    public ArchVal(GraphGeneratorsRegisterIface graphGeneratorsRegister,
            OperatorsRegisterIface operatorsRegister,
            AnalysesRegisterIface analysesRegister) {

        graphModelGenerator = new GraphModelGenerator(graphGeneratorsRegister);
        validationModelGenerator = new ValidationModelGenerator(
                operatorsRegister, analysesRegister);
    }

    public GraphModelGeneratorIface getGraphModelGenerator() {
        return graphModelGenerator;
    }

    public ValidationModelGeneratorIface getValidationModelGenerator() {
        return validationModelGenerator;
    }

    public ValidationTaskIface createValidationTask(
            GraphModel graphModel,
            ValidationModel validationModel) {
        return new ValidationTask(graphModel, validationModel);
    }
}
