package cz.cvut.fel.archval.core.api;

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
import cz.cvut.fel.archval.core.model.validation.ValidationModel;

/**
 * This class serves as facade to all Archval functionality.
 * 
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArchVal {

    private final GraphModelGeneratorIface graphModelGenerator;
    private final ValidationModelGeneratorIface validationModelGenerator;

    /**
     * ArchVal facade constructor. May be freely used to construct this libary
     * instances.
     *
     * @param graphGeneratorsRegister integration interface providing access to existing graph generators
     * @param operatorsRegister integration interface providing access to existing operators in the system
     * @param analysesRegister integration interface providing access to existing analyses in the system
     */
    public ArchVal(GraphGeneratorsRegisterIface graphGeneratorsRegister,
            OperatorsRegisterIface operatorsRegister,
            AnalysesRegisterIface analysesRegister) {

        graphModelGenerator = new GraphModelGenerator(graphGeneratorsRegister);
        validationModelGenerator = new ValidationModelGenerator(
                operatorsRegister, analysesRegister);
    }

    /**
     * Returns GraphModelGenerator instance which can be used for new GraphModel
     * generation.
     *
     * @return GraphModelGenerator instance singleton
     */
    public GraphModelGeneratorIface getGraphModelGenerator() {
        return graphModelGenerator;
    }

    /**
     * Returns ValidationModelGenerator which can be used to generate validation
     * model from AVD files.
     *
     * @return ValidationModelGenerator instance singleton
     */
    public ValidationModelGeneratorIface getValidationModelGenerator() {
        return validationModelGenerator;
    }

    /**
     * Factory method. Provides new validation task, which can be run on
     * existing GraphModel and ValidationModel.
     *
     * @param graphModel graph model to be validatd
     * @param validationModel validation model to be used for validation
     * @return ValidationTask instance which can be stared and run
     */
    public ValidationTaskIface createValidationTask(
            GraphModel graphModel,
            ValidationModel validationModel) {
        return new ValidationTask(graphModel, validationModel);
    }
}
