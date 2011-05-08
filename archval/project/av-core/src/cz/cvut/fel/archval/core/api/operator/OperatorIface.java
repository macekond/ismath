package cz.cvut.fel.archval.core.api.operator;

import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.List;

/**
 * Common interface for all the operators. It must be implemented by operator
 * provider.
 * 
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface OperatorIface {

    /**
     * This method should return name of the operator, which will be used in AVD file.
     * 
     * @return string containing name of this operator (must match exactly the name used in avd spec)
     */
    public String getName();

    /**
     * This method should return actual number of parameters.
     *
     * @return count of parameters for this operator
     */
    public int getOperandsCount();

    /**
     * Returns operand type for position identified by supplied parameter
     *
     * @param index index of operand
     * @return DataType enum constant identifying what type will be hidden in generic Object
     */
    public DataType getOperandType(int index);

    /**
     * This method should return enum value determining result type of this method.
     *
     * @return one of DataType enum values, it determines actual object packed into Object returned by execute method
     */
    public DataType getReturnType();

    /**
     * Performs real operator execution. This method would contain operator implementation.
     *
     * @param operands list of operands, types of these operands will correspond to that provede by getOperandType method
     * @return object, whose precise type corresponds with getReturnType() method value
     */
    public Object execute(Graph graph, List<Object> operands);
}
