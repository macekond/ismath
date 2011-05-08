package cz.cvut.fel.archval.core.api.model.report;

/**
 * Abstract class representing result of some rule.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public abstract class RuleResult extends ResultNode {

    public abstract RuleType getRuleType();
}
