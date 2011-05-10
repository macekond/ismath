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

        Set<Vertex> resultSet = new HashSet<Vertex>();
        Set<Vertex> visitedVertices = new HashSet<Vertex>();
        collectVertices(graph, vertex, vertexLabel, edgeLabel, resultSet,
                false, visitedVertices);

        return resultSet;
    }

    private void collectVertices(Graph g, Vertex v, String kind,
            String classifier, Set<Vertex> result, boolean labelFound,
            Set<Vertex> visitedVertices) {

        if (visitedVertices.contains(v)) {
            return; // this vertex was already visited
        }

        visitedVertices.add(v); // add this vertex to visited

        // if this vertex has required kind and was accessed using path
        // containing required label, add it to the resultset and return
        if (v.getKind().equals(kind) && labelFound) {
            result.add(v);
            return;
        }

        // process outgoing edges
        for (Edge edge : g.getVertexOutgoingEdges(v)) {
            if (edge.getClassifier().equals(classifier)) {
                collectVertices(g, edge.getHead(), kind, classifier, result, true,
                        visitedVertices);
            } else {
                collectVertices(g, edge.getHead(), kind, classifier, result, false,
                        visitedVertices);
            }
        }
    }
}
