package cz.cvut.fel.archval.demeter.operators;

import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.LinkedList;
import java.util.List;

/**
 * F selector implementation (selects vertices which are first follower with
 * class c and there is label l on the path to them).
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class FVertexSetSelector implements OperatorIface {

    private List<DataType> operandTypes;

    public FVertexSetSelector() {
        operandTypes = new LinkedList<DataType>();
        operandTypes.add(DataType.VERTEX);
        operandTypes.add(DataType.LABEL);
        operandTypes.add(DataType.LABEL);
    }

    public String getName() {
        return "F";
    }

    public int getOperandsCount() {
        return operandTypes.size();
    }

    public DataType getOperandType(int index) {
        return operandTypes.get(index);
    }

    public DataType getReturnType() {
        return DataType.VERTEX_SET;
    }

    public Object execute(Graph graph, List<Object> operands) {
        Vertex vertex = (Vertex) operands.get(0);
        String vertexLabel = (String) operands.get(1);
        String edgeLabel = (String) operands.get(2);
        
        // TODO: implement F operator as specified in the work
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
