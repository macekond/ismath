package cz.cvut.fel.archval.core.mock.operator;

import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class HasMoreThenOperator implements OperatorIface {

    private List<DataType> operandTypes;

    public HasMoreThenOperator() {
        operandTypes = new LinkedList<DataType>();
        operandTypes.add(DataType.VERTEX_SET);
        operandTypes.add(DataType.NUMBER);
    }

    public String getName() {
        return "has_more_then";
    }

    public int getOperandsCount() {
        return 2;
    }

    public DataType getOperandType(int index) {
        return operandTypes.get(index);
    }

    public DataType getReturnType() {
        return DataType.BOOLEAN;
    }

    public Object execute(Graph graph, List<Object> operands) {
        return true;
    }
}
