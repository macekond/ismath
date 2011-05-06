package cz.cvut.fel.archval.core.valgen;

import cz.cvut.fel.archval.core.api.model.validation.CompoundRule;
import cz.cvut.fel.archval.core.api.model.validation.Rule;
import cz.cvut.fel.archval.core.api.model.validation.cr.iface.CrBooleanNodeIface;
import cz.cvut.fel.archval.core.api.register.OperatorsRegisterIface;
import java.util.HashMap;
import org.antlr.runtime.tree.Tree;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class CompoundRuleGenerator {

    private OperatorsRegisterIface operatorsRegister;

    public CompoundRuleGenerator(OperatorsRegisterIface operatorsRegister) {
        this.operatorsRegister = operatorsRegister;
    }

    public CompoundRule constructCompoundRule(Tree compoundRuleTree, HashMap<String, Rule> definedRules) {

        CompoundRule compoundRule = new CompoundRule();
        // TODO: construct CompoundRule object
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    protected CrBooleanNodeIface constructAtomicRuleExpressionTree(
            Tree expressionTree) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
