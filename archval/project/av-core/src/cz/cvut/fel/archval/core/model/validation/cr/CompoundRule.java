package cz.cvut.fel.archval.core.model.validation.cr;

import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.model.validation.Rule;
import cz.cvut.fel.archval.core.model.validation.cr.iface.CrObjectNodeIface;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents compound rule. It's able to evaluate itself when given GraphModel.
 * 
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class CompoundRule extends Rule {

    private CrObjectNodeIface compoundRuleExpressionRoot;

    public CrObjectNodeIface getCompoundRuleExpressionRoot() {
        return compoundRuleExpressionRoot;
    }

    public void setCompoundRuleExpressionRoot(CrObjectNodeIface compoundRuleExpressionRoot) {
        this.compoundRuleExpressionRoot = compoundRuleExpressionRoot;
    }

    public Set<String> getRequiredGraphTypes() {
        if (compoundRuleExpressionRoot == null) {
            return new HashSet<String>();
        }
        return compoundRuleExpressionRoot.getRequiredGraphTypes();
    }

    public boolean evaluate(GraphModel graphModel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
