package cz.cvut.fel.archval.demeter.operators;

import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.List;
import java.util.Set;

/**
 * Returns true if given vertex set is empty.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class EmptyVertexSetPredicate implements OperatorIface {

    public String getName() {
        return "vertex_set_is_empty";
    }

    public int getOperandsCount() {
        return 1;
    }

    public DataType getOperandType(int index) {
        return DataType.VERTEX_SET;
    }

    public DataType getReturnType() {
        return DataType.BOOLEAN;
    }

    public Object execute(Graph graph, List<Object> operands) {
        Set<Vertex> vertexSet = (Set<Vertex>) operands.get(0);
        return vertexSet.isEmpty();
    }
}
