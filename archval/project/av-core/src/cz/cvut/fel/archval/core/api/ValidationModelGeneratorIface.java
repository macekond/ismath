package cz.cvut.fel.archval.core.api;

import cz.cvut.fel.archval.core.model.validation.ValidationModel;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.runtime.RecognitionException;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface ValidationModelGeneratorIface {

    ValidationModel constructValidationModel(InputStream is) throws IOException, RecognitionException;

    ValidationModel constructValidationModel(String string) throws RecognitionException;
}
