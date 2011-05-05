package cz.cvut.fel.archval.core.api.valgen;

import cz.cvut.fel.archval.core.api.ValidationModelGeneratorIface;
import cz.cvut.fel.archval.core.api.register.AnalysesRegisterIface;
import cz.cvut.fel.archval.core.api.register.OperatorsRegisterIface;
import cz.cvut.fel.archval.core.model.validation.ValidationModel;
import java.io.InputStream;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ValidationModelGenerator implements ValidationModelGeneratorIface {

    private OperatorsRegisterIface operatorsRegister;
    private AnalysesRegisterIface analysesRegister;

    public ValidationModelGenerator(
            OperatorsRegisterIface operatorsRegister,
            AnalysesRegisterIface analysesRegister) {

        this.operatorsRegister = operatorsRegister;
        this.analysesRegister = analysesRegister;
    }

    public ValidationModel constructValidationModel(InputStream is) {
        // TODO: implement
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ValidationModel constructModel(String string) {
        // TODO: implement
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ValidationModel constructModel() {
        // TODO: implement
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
