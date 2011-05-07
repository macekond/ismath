package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.report.DataResult;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;
import cz.cvut.fel.archval.core.api.types.DataType;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArEdgeNodeIface;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArEdgeNode implements ArEdgeNodeIface {

    public Edge evaluate(Graph graph, Vertex vertex, ResultNode resultNode) {
        throw new IllegalStateException("This method can't be called in edge "
                + "bound rule.");
    }

    public Edge evaluate(Graph graph, Edge edge, ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        dataResult.setResult(edge);
        dataResult.setDataType(DataType.EDGE);
        return edge;
    }
}
