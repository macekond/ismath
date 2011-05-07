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
public class SelectorOperator implements OperatorIface {

    private List<DataType> operandTypes;

    public SelectorOperator() {
        operandTypes = new LinkedList<DataType>();
        operandTypes.add(DataType.LABEL);
        operandTypes.add(DataType.VERTEX);
    }

    public String getName() {
        return "selector";
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
