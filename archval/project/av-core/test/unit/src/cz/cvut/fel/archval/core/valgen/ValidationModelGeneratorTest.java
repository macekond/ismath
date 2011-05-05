package cz.cvut.fel.archval.core.valgen;

import cz.cvut.fel.archval.core.api.analysis.AnalysisIface;
import cz.cvut.fel.archval.core.api.register.AnalysesRegisterIface;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ValidationModelGeneratorTest {

    /**
     * Test of constructValidationModel method, of class ValidationModelGenerator.
     */
    @Test
    public void testConstructValidationModel() throws Exception {
        InputStream is = ValidationModelGeneratorTest.class.getResourceAsStream("../avd/parser/testing.avd");
        Assert.assertNotNull(is);

        // TODO: complete
        ValidationModelGenerator validationModelGenerator = new ValidationModelGenerator(null, new AnalysesRegisterIface() {

            @Override
            public List<AnalysisIface> getAnalysesList() {
                return new LinkedList<AnalysisIface>();
            }

            @Override
            public AnalysisIface getAnalysisByName(String name) {
                return new AnalysisIface() {};
            }
        });
        validationModelGenerator.constructValidationModel(is);
    }
}
