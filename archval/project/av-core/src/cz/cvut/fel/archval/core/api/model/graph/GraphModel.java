package cz.cvut.fel.archval.core.api.model.graph;

import java.util.HashMap;
import java.util.Set;

/**
 * GraphModel represents set of Graph objects representing project, which is to
 * be validated or analyzed.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class GraphModel {

    private HashMap<String, Graph> graphs;

    public GraphModel() {
        graphs = new HashMap<String, Graph>();
    }

    /**
     * Adds existing graph to GraphModel. If this model already exists graph of
     * the same type no action is taken and the model is left the same.
     *
     * @param graph graph to be added to the model
     */
    public void addGraph(Graph graph) {
        if (graphs.containsKey(graph.getGraphType())) {
            return;
        }
        graphs.put(graph.getGraphType(), graph);
    }

    /**
     * Returns available graph types.
     *
     * @return Set of  strings representing available graph types
     */
    public Set<String> getAvailableGraphTypes() {
        return graphs.keySet();
    }

    /**
     * Returns graph by type. If no such graph is found, returns null.
     *
     * @param graphType string representing graph type to be found
     * @return graph or null if no graph of such type is found
     */
    public Graph getGraphByType(String graphType) {
        return graphs.get(graphType);
    }
}
