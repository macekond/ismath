package cz.cvut.fel.archval.core.model.validation.ar;

import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArBooleanNodeIface;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.model.validation.Rule;
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
    private OperatorIface basicSetSelector;
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

    /**
     * Returns operator which is used to select basic set.
     *
     * @return operator selecting basic set or null if no selector was specified
     */
    public OperatorIface getBasicSetSelector() {
        return basicSetSelector;
    }

    public void setBasicSetSelector(OperatorIface basicSetSelector) {
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
    public boolean evaluate(GraphModel graphModel) {
        // TODO: implement
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
