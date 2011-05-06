package cz.cvut.fel.archval.core.api.model.validation;

import cz.cvut.fel.archval.core.api.analysis.AnalysisIface;
import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.report.ValidationReport;
import cz.cvut.fel.archval.core.api.validator.Validator;
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
public class ValidationModel implements Validator {

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

    public List<String> getAllRequiredGraphTypes() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * Validator interface implementation. This method is to be used by task
     * to validate existing GraphModel.
     * 
     * @param graphModel model to be validated by this ValidationModel
     * @return ValidationReport object, which is tree of validation result for avd file tree structure
     */
    public ValidationReport validate(GraphModel graphModel) {

        ValidationReport validationReport = new ValidationReport();

        // TODO: perform validation and assemble the validationReport object

        // evaluate validation commands

        // evaluate analysis commands
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
