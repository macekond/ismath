package cz.cvut.fel.archval.integration.avd;

import cz.cvut.fel.archval.core.api.ArchVal;
import cz.cvut.fel.archval.core.api.ValidationModelGeneratorIface;
import cz.cvut.fel.archval.core.api.ValidationModelIface;
import cz.cvut.fel.archval.core.api.ex.OperatorMismatchException;
import cz.cvut.fel.archval.core.api.ex.OperatorNotFoundException;
import cz.cvut.fel.archval.core.api.ex.ValidationModelGenerationException;
import cz.cvut.fel.archval.integration.archval.ArchvalInstance;
import cz.cvut.fel.archval.integration.register.AmbiguousOperatorsFoundException;
import cz.cvut.fel.archval.integration.register.DuplicateAnalysisNameException;
import cz.cvut.fel.archval.integration.register.DuplicateGraphGeneratorException;
import java.io.IOException;
import org.antlr.runtime.RecognitionException;

/**
 * Implementation of AvdCookie interface.
 * 
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class AvdSupport implements AvdCookie {

    private AvdDataObject avdDataObject;

    public AvdSupport(AvdDataObject avdDataObject) {
        this.avdDataObject = avdDataObject;
    }

    /**
     * Returns validation model based on selected AVD file
     *
     * @return validation model to be used to perform validation
     */
    public ValidationModelIface getValidationModel() throws
            DuplicateGraphGeneratorException,
            AmbiguousOperatorsFoundException,
            DuplicateAnalysisNameException,
            IOException, ValidationModelGenerationException,
            OperatorNotFoundException, OperatorMismatchException, RecognitionException {

        ArchVal archval = ArchvalInstance.getInstance();

        ValidationModelGeneratorIface validationModelGenerator =
                archval.getValidationModelGenerator();

        return validationModelGenerator.constructValidationModel(
                avdDataObject.getPrimaryFile().getInputStream());
    }
}
