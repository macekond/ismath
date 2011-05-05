package cz.cvut.fel.archval.core.api;

import cz.cvut.fel.archval.core.model.validation.ValidationModel;
import java.io.InputStream;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface ValidationModelGeneratorIface {

    ValidationModel constructValidationModel(InputStream is);

    ValidationModel constructModel(String string);

    ValidationModel constructModel();
}
