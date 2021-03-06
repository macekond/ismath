package cz.cvut.fel.archval.core.api.model.report;

import cz.cvut.fel.archval.core.model.validation.ar.AtomicRuleQuantificationType;
import cz.cvut.fel.archval.core.model.validation.ar.AtomicRuleType;
import java.util.HashMap;

/**
 * Class representing result of atomic rule evaluation.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class AtomicRuleResult extends RuleResult {

    private AtomicRuleType atomicRuleType;
    private ResultNode basicSetResult;
    private HashMap<Long, ResultNode> elementResults;
    private AtomicRuleQuantificationType atomicRuleQuantificationType;
    private boolean result;

    public AtomicRuleResult() {
        elementResults = new HashMap<Long, ResultNode>();
    }

    public RuleType getRuleType() {
        return RuleType.ATOMIC_RULE;
    }

    public AtomicRuleQuantificationType getAtomicRuleQuantificationType() {
        return atomicRuleQuantificationType;
    }

    public void setAtomicRuleQuantificationType(AtomicRuleQuantificationType atomicRuleQuantificationType) {
        this.atomicRuleQuantificationType = atomicRuleQuantificationType;
    }

    public AtomicRuleType getAtomicRuleType() {
        return atomicRuleType;
    }

    public void setAtomicRuleType(AtomicRuleType atomicRuleType) {
        this.atomicRuleType = atomicRuleType;
    }

    public ResultNode getBasicSetResult() {
        return basicSetResult;
    }

    public void setBasicSetResult(ResultNode basicSetResult) {
        this.basicSetResult = basicSetResult;
    }

    public void addElementResult(long elementId, ResultNode resultNode) {
        elementResults.put(elementId, resultNode);
    }

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
