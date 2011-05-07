package cz.cvut.fel.archval.core.mock.operator;

import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class EmptyOperator implements OperatorIface {

    private List<DataType> operandTypes;

    public EmptyOperator() {
        operandTypes = new LinkedList<DataType>();
        operandTypes.add(DataType.VERTEX_SET);
    }

    public String getName() {
        return "empty";
    }

    public int getOperandsCount() {
        return operandTypes.size();
    }

    public DataType getOperandType(int index) {
        return operandTypes.get(index);
    }

    public DataType getReturnType() {
        return DataType.BOOLEAN;
    }

    public Object execute(Graph graph, List<Object> operands) {
        return new HashSet<Vertex>();
    }
}
