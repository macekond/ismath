package cz.cvut.fel.archval.core.valgen;

import cz.cvut.fel.archval.core.api.ex.OperatorNotFoundException;
import cz.cvut.fel.archval.core.api.ex.ValidationModelGenerationException;
import cz.cvut.fel.archval.core.api.model.validation.ValidationModel;
import cz.cvut.fel.archval.core.mock.MockAnalysesRegister;
import cz.cvut.fel.archval.core.mock.MockOperatorsRegister;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for ValidationModelGenerator.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ValidationModelGeneratorTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNullParametersInConstructionMethods() throws
            RecognitionException, ValidationModelGenerationException,
            IOException, OperatorNotFoundException {

        ValidationModelGenerator validationModelGenerator =
                new ValidationModelGenerator(
                new MockOperatorsRegister(),
                new MockAnalysesRegister());

        validationModelGenerator.constructValidationModel((String) null);
        validationModelGenerator.constructValidationModel((InputStream) null);
    }

    // TODO: remove UOE after complete class is implemented
    @Test(expected=UnsupportedOperationException.class)
    public void testConstructionFromStream() throws IOException,
            RecognitionException, ValidationModelGenerationException, OperatorNotFoundException {

        ValidationModelGenerator validationModelGenerator =
                new ValidationModelGenerator(
                new MockOperatorsRegister(),
                new MockAnalysesRegister());

        InputStream inputStream =
                ValidationModelGeneratorTest.class.getResourceAsStream(
                "testing-valid.avd");
        
        Assert.assertNotNull(inputStream);

        ValidationModel validationModel =
                validationModelGenerator.constructValidationModel(inputStream);
    }
}
