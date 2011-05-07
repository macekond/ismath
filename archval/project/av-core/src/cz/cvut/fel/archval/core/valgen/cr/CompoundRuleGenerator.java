package cz.cvut.fel.archval.core.valgen.cr;

import cz.cvut.fel.archval.core.api.ex.ValidationModelGenerationException;
import cz.cvut.fel.archval.core.model.validation.cr.CompoundRule;
import cz.cvut.fel.archval.core.model.validation.Rule;
import cz.cvut.fel.archval.core.model.validation.cr.iface.CrBooleanNodeIface;
import cz.cvut.fel.archval.core.model.validation.cr.node.CrAndNode;
import cz.cvut.fel.archval.core.model.validation.cr.node.CrNotNode;
import cz.cvut.fel.archval.core.model.validation.cr.node.CrOrNode;
import cz.cvut.fel.archval.core.model.validation.cr.node.CrRuleNode;
import cz.cvut.fel.archval.core.api.register.OperatorsRegisterIface;
import cz.cvut.fel.archval.core.avd.parser.TokenList;
import java.io.FileNotFoundException;
import java.io.IOException;
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

    public CompoundRule constructCompoundRule(Tree compoundRuleTree, HashMap<String, Rule> definedRules) throws FileNotFoundException, IOException, ValidationModelGenerationException {

        CompoundRule compoundRule = new CompoundRule();
        compoundRule.setCompoundRuleExpressionRoot(
                constructBooleanNode(compoundRuleTree.getChild(0), definedRules));

        return compoundRule;
    }

    protected CrBooleanNodeIface constructBooleanNode(
            Tree tree, HashMap<String, Rule> dr) throws FileNotFoundException, IOException, ValidationModelGenerationException {
        String tokenType = TokenList.getInstance().getTokenName(tree.getType());
        CrBooleanNodeIface node = null;
        if (tokenType.equals("OR")) {
            CrOrNode crOrNode = new CrOrNode();
            crOrNode.setLeft(constructBooleanNode(tree.getChild(0), dr));
            crOrNode.setRight(constructBooleanNode(tree.getChild(1), dr));
            node = crOrNode;
        } else if (tokenType.equals("AND")) {
            CrAndNode crAndNode = new CrAndNode();
            crAndNode.setLeft(constructBooleanNode(tree.getChild(0), dr));
            crAndNode.setRight(constructBooleanNode(tree.getChild(1), dr));
            node = crAndNode;
        } else if (tokenType.equals("NOT")) {
            CrNotNode crNotNode = new CrNotNode();
            crNotNode.setOperand(constructBooleanNode(tree.getChild(0), dr));
            node = crNotNode;
        } else if (tokenType.equals("Name")) {
            CrRuleNode crRuleNode = new CrRuleNode();
            String ruleName = tree.getText();
            if (!dr.containsKey(ruleName)) {
                throw new ValidationModelGenerationException("Can't find '"
                        + ruleName + "' definition. (Line: "
                        + tree.getLine() + ", column: "
                        + tree.getCharPositionInLine()
                        + ")");
            }
            crRuleNode.setRule(dr.get(ruleName));
            node = crRuleNode;
        } else {
            assert false;
        }
        return node;
    }
}
