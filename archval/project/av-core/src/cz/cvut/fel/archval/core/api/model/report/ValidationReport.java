package cz.cvut.fel.archval.core.api.model.report;

import java.util.LinkedList;
import java.util.List;

/**
 * ValidationReport. Tree representing the outcome from validation model. All
 * results for each validation tree nodes are stored.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ValidationReport {

    private List<RuleResult> ruleResults;
    private List<AnalysisResult> analysisResults;

    public ValidationReport() {
        ruleResults = new LinkedList<RuleResult>();
        analysisResults = new LinkedList<AnalysisResult>();
    }

    public void addRuleResult(RuleResult ruleResult) {
        ruleResults.add(ruleResult);
    }

    public void addAnalysisResult(AnalysisResult analysisResult) {
        analysisResults.add(analysisResult);
    }
}
