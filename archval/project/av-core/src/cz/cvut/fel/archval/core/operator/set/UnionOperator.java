package cz.cvut.fel.archval.core.operator.set;

import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.List;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class UnionOperator implements OperatorIface {

    public String getName() {
        return "UNION";
    }

    public int getOperandsCount() {
        return 2;
    }

    public DataType getOperandType(int index) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public Object execute(List<?> operands) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DataType getReturnType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
