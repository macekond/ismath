package cz.cvut.fel.archval.integration.avd;

import cz.cvut.fel.archval.core.api.ValidationModelIface;
import cz.cvut.fel.archval.core.api.ex.OperatorMismatchException;
import cz.cvut.fel.archval.core.api.ex.OperatorNotFoundException;
import cz.cvut.fel.archval.core.api.ex.ValidationModelGenerationException;
import cz.cvut.fel.archval.integration.register.AmbiguousOperatorsFoundException;
import cz.cvut.fel.archval.integration.register.DuplicateAnalysisNameException;
import cz.cvut.fel.archval.integration.register.DuplicateGraphGeneratorException;
import java.io.IOException;
import org.antlr.runtime.RecognitionException;

/**
 * Cookie representing model loading from AVD file.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface AvdCookie {

    public ValidationModelIface getValidationModel() throws
            DuplicateGraphGeneratorException,
            AmbiguousOperatorsFoundException,
            DuplicateAnalysisNameException,
            IOException, ValidationModelGenerationException,
            OperatorNotFoundException, OperatorMismatchException,
            RecognitionException;
}
