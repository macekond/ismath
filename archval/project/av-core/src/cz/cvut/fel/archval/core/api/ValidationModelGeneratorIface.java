package cz.cvut.fel.archval.core.api;

import cz.cvut.fel.archval.core.api.ex.OperatorNotFoundException;
import cz.cvut.fel.archval.core.api.ex.ValidationModelGenerationException;
import cz.cvut.fel.archval.core.api.model.validation.ValidationModel;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.runtime.RecognitionException;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface ValidationModelGeneratorIface {

    /**
     * Constructs new ValidationModel from inpust stream representing AVD file.
     *
     * @param is InputStream of existing AVD file
     * @return ValidationModel instance
     * @throws IOException if AVD file or token file couldn't be read
     * @throws RecognitionException if there was error during AVD file parsing
     * @throws ValidationModelGenerationException when there was error with model construction
     * @throws OperatorNotFoundException when some of required operators couldn't be found
     */
    ValidationModel constructValidationModel(InputStream is) throws
            IOException, RecognitionException,
            ValidationModelGenerationException,
            OperatorNotFoundException;

    /**
     * Constructs new ValidationModel from string.
     *
     * @param string
     * @return
     * @throws IOException
     * @throws RecognitionException
     * @throws ValidationModelGenerationException
     * @throws OperatorNotFoundException
     */
    ValidationModel constructValidationModel(String string) throws
            IOException, RecognitionException,
            ValidationModelGenerationException,
            OperatorNotFoundException;
}
