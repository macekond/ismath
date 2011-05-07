package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArBooleanNodeIface;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArTruePredicate implements ArBooleanNodeIface {

    public Boolean evaluate(Graph graph, Vertex vertex, ResultNode resultNode) {
        return true;
    }

    public Boolean evaluate(Graph graph, Edge edge, ResultNode resultNode) {
        return true;
    }
}
