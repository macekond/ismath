package cz.cvut.fel.archval.core.model.validation.ar;

import cz.cvut.fel.archval.core.api.ex.RequiredGraphNotFound;
import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArBooleanNodeIface;
import cz.cvut.fel.archval.core.model.validation.Rule;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArObjectNodeIface;
import java.util.HashSet;
import java.util.Set;

/**
 * AtomicRule object which can be evaluated on some graph.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class AtomicRule extends Rule {

    private String requiredGraphType;
    private AtomicRuleType atomicRuleType;
    private ArObjectNodeIface basicSetSelector;
    private AtomicRuleQuantificationType quantificationType;
    private ArBooleanNodeIface atomicRuleEpressionRoot;

    public Set<String> getRequiredGraphTypes() {
        Set<String> requiredGraphTypes = new HashSet<String>();
        requiredGraphTypes.add(requiredGraphType);
        return requiredGraphTypes;
    }

    public void setRequiredGraphType(String requiredGraphType) {
        this.requiredGraphType = requiredGraphType;
    }

    public AtomicRuleQuantificationType getQuantificationType() {
        return quantificationType;
    }

    public void setQuantificationType(AtomicRuleQuantificationType quantificationType) {
        this.quantificationType = quantificationType;
    }

    public void setBasicSetSelector(ArObjectNodeIface basicSetSelector) {
        this.basicSetSelector = basicSetSelector;
    }

    public AtomicRuleType getAtomicRuleType() {
        return atomicRuleType;
    }

    public void setAtomicRuleType(AtomicRuleType atomicRuleType) {
        this.atomicRuleType = atomicRuleType;
    }

    public ArBooleanNodeIface getAtomicRuleEpressionRoot() {
        return atomicRuleEpressionRoot;
    }

    public void setAtomicRuleEpressionRoot(ArBooleanNodeIface atomicRuleEpressionRoot) {
        this.atomicRuleEpressionRoot = atomicRuleEpressionRoot;
    }

    /**
     * Evaluates this node and returns boolean value.
     *
     * @param graph graph to be validated
     * @return true if this atomic rule is satisfied, false otherwise
     */
    public boolean evaluate(GraphModel graphModel) throws RequiredGraphNotFound {

        boolean result = false;

        Graph graph = graphModel.getGraphByType(requiredGraphType);
        if (graph == null) {
            throw new RequiredGraphNotFound("Graph of required type '"
                    + requiredGraphType + "' was not found in supplied model.");
        }

        if (atomicRuleType == AtomicRuleType.VERTEX_RULE) {
            Set<Vertex> vertices = (Set<Vertex>) basicSetSelector.evaluate(
                    graph, (Vertex) null);

            if (quantificationType == AtomicRuleQuantificationType.EXISTENTIAL) {

                result = false;
                for (Vertex vertex : vertices) {
                    result = atomicRuleEpressionRoot.evaluate(graph, vertex);
                    if (result == true) {
                        break;
                    }
                }

            } else {

                result = true;
                for (Vertex vertex : vertices) {
                    result = atomicRuleEpressionRoot.evaluate(graph, vertex);
                    if (result == false) {
                        break;
                    }
                }
            }

        } else if (atomicRuleType == AtomicRuleType.EDGE_RULE) {
            Set<Edge> edges = (Set<Edge>) basicSetSelector.evaluate(
                    graph, (Edge) null);

            if (quantificationType == AtomicRuleQuantificationType.EXISTENTIAL) {

                result = false;
                for (Edge edge : edges) {
                    result = atomicRuleEpressionRoot.evaluate(graph, edge);
                    if (result == true) {
                        break;
                    }
                }

            } else {

                result = true;
                for (Edge edge : edges) {
                    result = atomicRuleEpressionRoot.evaluate(graph, edge);
                    if (result == false) {
                        break;
                    }
                }

            }

        } else {
            assert false;
        }

        return result;
    }
}
