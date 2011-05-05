package cz.cvut.fel.archval.core.operator;

import cz.cvut.fel.archval.core.types.DataType;
import java.util.List;

/**
 *
 * @author martin
 */
public interface OperatorIface {

    public String getName();

    public int getOperandsCount();

    public DataType getOperandType(int index);

    public Object execute(List<?> operands);
}
