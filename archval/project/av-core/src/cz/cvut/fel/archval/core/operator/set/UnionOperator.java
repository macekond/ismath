package cz.cvut.fel.archval.core.operator.set;

import cz.cvut.fel.archval.core.operator.OperatorIface;
import cz.cvut.fel.archval.core.types.DataType;
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
        return DataType.SET;
    }

    public Object execute(List<?> operands) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
