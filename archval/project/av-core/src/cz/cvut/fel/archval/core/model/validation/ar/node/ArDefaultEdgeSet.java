package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.graph.visitor.GraphElementVisitor;
import cz.cvut.fel.archval.core.api.model.report.DataResult;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;
import cz.cvut.fel.archval.core.api.types.DataType;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArEdgeSetNodeIface;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArDefaultEdgeSet implements ArEdgeSetNodeIface, GraphElementVisitor {

    private Set<Edge> edges;

    public Set<Edge> evaluate(Graph graph, Vertex vertex, ResultNode resultNode) {
        return evaluate(graph, resultNode);
    }

    public Set<Edge> evaluate(Graph graph, Edge edge, ResultNode resultNode) {
        return evaluate(graph, resultNode);
    }

    protected Set<Edge> evaluate(Graph graph, ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        edges = new HashSet<Edge>();
        graph.accept(this);
        dataResult.setResult(edges);
        dataResult.setDataType(DataType.EDGE_SET);
        return edges;
    }

    public void visit(Edge edge) {
        edges.add(edge);
    }

    public void visit(Vertex vertex) {
        return;
    }
}
