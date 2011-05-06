package cz.cvut.fel.archval.core.valgen;

import cz.cvut.fel.archval.core.api.ex.OperatorNotFoundException;
import cz.cvut.fel.archval.core.api.model.validation.AtomicRule;
import cz.cvut.fel.archval.core.api.model.validation.AtomicRuleQuantificationType;
import cz.cvut.fel.archval.core.api.model.validation.AtomicRuleType;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArBooleanNodeIface;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.register.OperatorsRegisterIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import cz.cvut.fel.archval.core.api.types.TokenTypeMap;
import java.io.IOException;
import org.antlr.runtime.tree.Tree;

/**
 * Generates new AtomicRule object based on supplied tree and operators get
 * from supplied register.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class AtomicRuleGenerator {

    private OperatorsRegisterIface operatorsRegister;

    public AtomicRuleGenerator(OperatorsRegisterIface operatorsRegister) {
        this.operatorsRegister = operatorsRegister;
    }

    public AtomicRule constructAtomicRule(Tree atomicRuleTree) throws IOException, OperatorNotFoundException {
        if (atomicRuleTree.getChildCount() < 3) {
            throw new IllegalArgumentException("Invalid tree passed. This tree "
                    + "is supposed to have at least 3 children according to the"
                    + "grammar. Please check that valid tree is supplied.");
        }

        AtomicRule atomicRule = new AtomicRule();

        atomicRule.setRequiredGraphType(atomicRuleTree.getChild(0).getText());
        if (atomicRuleTree.getChild(1).getText().equals("ALL")) {
            atomicRule.setQuantificationType(AtomicRuleQuantificationType.UNIVERSAL);
        } else if (atomicRuleTree.getChild(1).getText().equals("EXISTS")) {
            atomicRule.setQuantificationType(AtomicRuleQuantificationType.EXISTENTIAL);
        } else {
            assert false;
        }

        String ruleTypeString = atomicRuleTree.getChild(1).getChild(0).getText();
        AtomicRuleType ruleType = AtomicRuleType.VERTEX_RULE;
        if (ruleTypeString.equals("e")) {
            ruleType = AtomicRuleType.EDGE_RULE;
        }
        atomicRule.setAtomicRuleType(ruleType);

        atomicRule.setBasicSetSelector(null);
        int childNodePointer = 2;
        if (atomicRuleTree.getChildCount() > 3) {

            // TODO: replace this code with call to OperatorSignatureChecker class
            Tree selectorTree = atomicRuleTree.getChild(childNodePointer);

            // check operator name
            String operatorName = selectorTree.getText();
            OperatorIface selectedOperator = operatorsRegister.getOperatorByName(operatorName);
            if (selectedOperator == null) {
                throw new OperatorNotFoundException("Operator with name "
                        + operatorName + " was not found. (Line: "
                        + selectorTree.getLine() + ", column: "
                        + +selectorTree.getCharPositionInLine() + ")");
            }

            // check parameters count
            int paramsCount = selectorTree.getChildCount();
            if (selectedOperator.getOperandsCount() != paramsCount) {
                throw new OperatorNotFoundException("Invalid operator operands"
                        + "count. Found operator with same name, but with "
                        + "differend paramater count. (Line: "
                        + selectorTree.getLine() + ", column: "
                        + +selectorTree.getCharPositionInLine() + ")");
            }

            // check return value
            DataType expectedReturnDataType =
                    (ruleType == AtomicRuleType.VERTEX_RULE)
                    ? DataType.VERTEX_SET : DataType.EDGE_SET;

            if (selectedOperator.getReturnType() != expectedReturnDataType) {
                throw new OperatorNotFoundException("Invalid operator return "
                        + "value. (Line: " + selectorTree.getLine()
                        + ", column: " + selectorTree.getCharPositionInLine()
                        + ")");
            }

            // check operand types
            for (int i = 0; i < paramsCount; i++) {
                Tree operandTree = selectorTree.getChild(i);
                TokenTypeMap ttm = TokenTypeMap.getInstance();
                DataType operandType = ttm.getTokenDataType(operandTree.getType());

                if (operandType != selectedOperator.getOperandType(i)) {
                    throw new OperatorNotFoundException("Unexpected parameter "
                            + "type. Expected "
                            + selectedOperator.getOperandType(i).toString()
                            + "value. (Line: " + operandTree.getLine()
                            + ", column: " + operandTree.getCharPositionInLine()
                            + ")");
                }
            }
            atomicRule.setBasicSetSelector(selectedOperator);

            childNodePointer++;
        }

        atomicRule.setAtomicRuleEpressionRoot(
                constructAtomicRuleExpressionTree(
                atomicRuleTree.getChild(childNodePointer)));
        return atomicRule;
    }

    protected ArBooleanNodeIface constructAtomicRuleExpressionTree(
            Tree expressionTree) {

        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
