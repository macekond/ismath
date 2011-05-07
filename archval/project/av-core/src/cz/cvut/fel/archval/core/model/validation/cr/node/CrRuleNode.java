package cz.cvut.fel.archval.core.model.validation.cr.node;

import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.model.validation.Rule;
import cz.cvut.fel.archval.core.model.validation.ar.AtomicRule;
import cz.cvut.fel.archval.core.model.validation.cr.iface.CrBooleanNodeIface;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class CrRuleNode implements CrBooleanNodeIface {

    private Rule rule;

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public Boolean evaluate(GraphModel graphModel) {
        return rule.evaluate(graphModel);
    }

    public Set<String> getRequiredGraphTypes() {
        return rule.getRequiredGraphTypes();
    }
}
