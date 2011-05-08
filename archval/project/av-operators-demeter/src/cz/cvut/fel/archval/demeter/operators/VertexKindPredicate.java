package cz.cvut.fel.archval.demeter.operators;

import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.LinkedList;
import java.util.List;

/**
 * Returns true for vertex and kind, if the vertex has that kind.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class VertexKindPredicate implements OperatorIface {

    private List<DataType> operandTypes;

    public VertexKindPredicate() {
        operandTypes = new LinkedList<DataType>();
        operandTypes.add(DataType.VERTEX);
        operandTypes.add(DataType.LABEL);
    }

    public String getName() {
        return "kind";
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
        Vertex v = (Vertex) operands.get(0);
        String label = (String) operands.get(1);
        if (v.getKind().equals(label)) {
            return true;
        }
        return false;
    }
}
