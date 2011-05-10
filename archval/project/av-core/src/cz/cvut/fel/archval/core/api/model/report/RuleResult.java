package cz.cvut.fel.archval.core.api.model.report;

/**
 * Abstract class representing result of some rule.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public abstract class RuleResult extends ResultNode {

    private String ruleName;

    public abstract RuleType getRuleType();

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }
}
