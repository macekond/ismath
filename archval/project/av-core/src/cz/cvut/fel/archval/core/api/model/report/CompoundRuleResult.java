package cz.cvut.fel.archval.core.api.model.report;

/**
 * Class representing result of compound rule evaluation.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class CompoundRuleResult extends RuleResult {

    private DataResult dataResult;

    public RuleType getRuleType() {
        return RuleType.COMPOUND_RULE;
    }

    public DataResult getDataResult() {
        return dataResult;
    }

    public void setDataResult(DataResult dataResult) {
        this.dataResult = dataResult;
    }
}
