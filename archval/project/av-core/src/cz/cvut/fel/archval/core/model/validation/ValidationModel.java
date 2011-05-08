package cz.cvut.fel.archval.core.model.validation;

import cz.cvut.fel.archval.core.api.ValidationModelIface;
import cz.cvut.fel.archval.core.api.analysis.AnalysisIface;
import cz.cvut.fel.archval.core.api.ex.RequiredGraphNotFound;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.report.AtomicRuleResult;
import cz.cvut.fel.archval.core.api.model.report.CompoundRuleResult;
import cz.cvut.fel.archval.core.api.model.report.ValidationReport;
import cz.cvut.fel.archval.core.api.model.report.RuleResult;
import cz.cvut.fel.archval.core.model.validation.ar.AtomicRule;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * ArchVal validation model. Core component which represents all required rules
 * and performs the validation when its validate() method is invoked.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ValidationModel implements ValidationModelIface {

    private List<AnalysisIface> requiredAnalyses;
    private List<Rule> requiredRules;
    private Set<String> requiredGraphTypes;

    /**
     * Creates new instance of ValidationModel.
     *
     * Do not use this constructor directly. Use ValidationModelGeneratorIface
     * instance to construct instance of this class based on existing avd file.
     */
    public ValidationModel() {
        requiredAnalyses = new LinkedList<AnalysisIface>();
        requiredRules = new LinkedList<Rule>();
        requiredGraphTypes = new HashSet<String>();
    }

    public void addRequiredAnalysis(AnalysisIface analysis) {
        requiredAnalyses.add(analysis);
    }

    /**
     * Adds existing rule (atomic or compound) to the model. This rule will be 
     * used for validation if validate method is called.
     * 
     * @param rule to be added to the list of rules (rule may be added and performed multiple times)
     */
    public void addRequiredRule(Rule rule) {
        requiredRules.add(rule);
    }

    public void addRequiredGraphType(String graphType) {
        requiredGraphTypes.add(graphType);
    }

    public Set<String> getAllRequiredGraphTypes() {
        return requiredGraphTypes;
    }

    /**
     * Validator interface implementation. This method is to be used by task
     * to validate existing GraphModel.
     * 
     * @param graphModel model to be validated by this ValidationModel
     * @return ValidationReport object, which is tree of validation result for avd file tree structure
     */
    public ValidationReport validate(GraphModel graphModel) throws RequiredGraphNotFound {

        ValidationReport validationReport = new ValidationReport();

        // evaluate validation commands
        for (Rule rule : requiredRules) {
            RuleResult ruleResult = null;
            if (rule instanceof AtomicRule) {
                ruleResult = new AtomicRuleResult();
            } else {
                ruleResult = new CompoundRuleResult();
            }
            rule.evaluate(graphModel, ruleResult);
            validationReport.addRuleResult(ruleResult);
        }

        // evaluate analysis commands
        for (AnalysisIface analysisIface : requiredAnalyses) {
            Graph analysisGraph = graphModel.getGraphByType(analysisIface.getRequiredGraphType());
            if (analysisGraph == null) {
                throw new RequiredGraphNotFound("Graph of type '"
                        + analysisIface.getRequiredGraphType() + "' was not found in the "
                        + "supplied graph model.");

            }
            validationReport.addAnalysisResult(analysisIface.evaluate(analysisGraph));
        }

        return validationReport;
    }
}
