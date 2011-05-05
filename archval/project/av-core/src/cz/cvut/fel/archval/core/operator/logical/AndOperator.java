package cz.cvut.fel.archval.core.operator.logical;

import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.List;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class AndOperator implements OperatorIface {

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getOperandsCount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DataType getOperandType(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object execute(List<?> operands) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DataType getReturnType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
