package cz.cvut.fel.archval.demeter.operators;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class LevelTwoVertexSelector implements OperatorIface {

    private List<DataType> operandTypes;

    public LevelTwoVertexSelector() {
        operandTypes = new LinkedList<DataType>();
        operandTypes.add(DataType.VERTEX);
        operandTypes.add(DataType.LABEL);
        operandTypes.add(DataType.LABEL);
    }

    @Override
    public String getName() {
        return "level_two_vertex_selector";
    }

    @Override
    public int getOperandsCount() {
        return operandTypes.size();
    }

    @Override
    public DataType getOperandType(int index) {
        return operandTypes.get(index);
    }

    @Override
    public DataType getReturnType() {
        return DataType.VERTEX_SET;
    }

    @Override
    public Object execute(Graph graph, List<Object> operands) {
        Vertex vertex = (Vertex) operands.get(0);
        String first = (String) operands.get(1);
        String second = (String) operands.get(2);

        Set<Vertex> resultSet = new HashSet<Vertex>();
        collectVertices(graph, vertex, 0, first, second, resultSet);
        return resultSet;
    }

    private void collectVertices(Graph graph, Vertex vertex, int level, String first,
            String second, Set<Vertex> resultSet) {
        if (level == 0) {
            for (Edge edge : graph.getVertexOutgoingEdges(vertex)) {
                if (edge.getClassifier().equals(first)) {
                    collectVertices(graph, edge.getHead(), level + 1, first, second, resultSet);

                }
            }
            return;
        } else if (level == 1) {
            for (Edge edge : graph.getVertexOutgoingEdges(vertex)) {
                resultSet.add(edge.getHead());
            }
        }
    }
}
