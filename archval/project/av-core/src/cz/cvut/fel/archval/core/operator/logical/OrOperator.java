package cz.cvut.fel.archval.core.operator.logical;

import cz.cvut.fel.archval.core.operator.OperatorIface;
import cz.cvut.fel.archval.core.types.DataType;
import java.util.List;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class OrOperator implements OperatorIface {

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
