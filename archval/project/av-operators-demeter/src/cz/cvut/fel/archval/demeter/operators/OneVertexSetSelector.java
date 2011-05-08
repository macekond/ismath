package cz.cvut.fel.archval.demeter.operators;

import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Construct vertex set given one vertex object.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class OneVertexSetSelector implements OperatorIface {

    public String getName() {
        return "construct_vertex_set_from_vertex";
    }

    public int getOperandsCount() {
        return 1;
    }

    public DataType getOperandType(int index) {
        return DataType.VERTEX;
    }

    public DataType getReturnType() {
        return DataType.VERTEX_SET;
    }

    public Object execute(Graph graph, List<Object> operands) {
        Set<Vertex> set = new HashSet<Vertex>();
        set.add((Vertex) operands.get(0));
        return set;
    }
}
