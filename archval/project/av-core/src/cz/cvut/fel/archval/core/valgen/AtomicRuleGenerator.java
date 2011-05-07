package cz.cvut.fel.archval.core.valgen;

import cz.cvut.fel.archval.core.api.ex.OperatorNotFoundException;
import cz.cvut.fel.archval.core.api.ex.ValidationModelGenerationException;
import cz.cvut.fel.archval.core.api.model.validation.AtomicRule;
import cz.cvut.fel.archval.core.api.model.validation.AtomicRuleQuantificationType;
import cz.cvut.fel.archval.core.api.model.validation.AtomicRuleType;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArBooleanNodeIface;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArEdgeNodeIface;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArEdgeSetNodeIface;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArIntegerNodeIface;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArStringNodeIface;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArVertexNodeIface;
import cz.cvut.fel.archval.core.api.model.validation.ar.iface.ArVertexSetNodeIface;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArAndNode;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArBooleanLiteralNode;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArEdgeIntersectNode;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArEdgeNode;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArEdgeSelector;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArEdgeSetminusNode;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArEdgeUnionNode;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArIntegerNode;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArNotNode;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArOrNode;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArPredicateNode;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArStringNode;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArVertexIntersectNode;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArVertexNode;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArVertexSelector;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArVertexSetminusNode;
import cz.cvut.fel.archval.core.api.model.validation.ar.node.ArVertexUnionNode;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.register.OperatorsRegisterIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import cz.cvut.fel.archval.core.api.types.TokenTypeMap;
import cz.cvut.fel.archval.core.avd.parser.TokenList;
import cz.cvut.fel.archval.core.operator.checker.OperatorMismatchException;
import cz.cvut.fel.archval.core.operator.checker.OperatorSignatureChecker;
import java.io.FileNotFoundException;
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

    public AtomicRule constructAtomicRule(Tree atomicRuleTree) throws IOException, OperatorNotFoundException, OperatorMismatchException {
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
                        + selectorTree.getCharPositionInLine() + ")");
            }

            // check parameters count
            int paramsCount = selectorTree.getChildCount();
            if (selectedOperator.getOperandsCount() != paramsCount) {
                throw new OperatorNotFoundException("Invalid operator operands"
                        + "count. Found operator with same name, but with "
                        + "differend paramater count. (Line: "
                        + selectorTree.getLine() + ", column: "
                        + selectorTree.getCharPositionInLine() + ")");
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
                constructBooleanNode(
                atomicRuleTree.getChild(childNodePointer).getChild(0),
                atomicRule.getAtomicRuleType()));
        return atomicRule;
    }

    protected ArBooleanNodeIface constructBooleanNode(Tree tree, AtomicRuleType art) throws FileNotFoundException, IOException, OperatorMismatchException {
        String tokenType = TokenList.getInstance().getTokenName(tree.getType());
        ArBooleanNodeIface node = null;
        if (tokenType.equals("OR")) {
            ArOrNode arOrNode = new ArOrNode();
            arOrNode.setLeft(constructBooleanNode(tree.getChild(0), art));
            arOrNode.setRight(constructBooleanNode(tree.getChild(1), art));
            node = arOrNode;
        } else if (tokenType.equals("AND")) {
            ArAndNode arAndNode = new ArAndNode();
            arAndNode.setLeft(constructBooleanNode(tree.getChild(0), art));
            arAndNode.setRight(constructBooleanNode(tree.getChild(1), art));
            node = arAndNode;
        } else if (tokenType.equals("NOT")) {
            ArNotNode arNotNode = new ArNotNode();
            arNotNode.setOperand(constructBooleanNode(tree.getChild(0), art));
            node = arNotNode;
        } else if (tokenType.equals("True")) {
            ArBooleanLiteralNode arBooleanLiteralNode = new ArBooleanLiteralNode();
            arBooleanLiteralNode.setValue(true);
            node = arBooleanLiteralNode;
        } else if (tokenType.equals("False")) {
            ArBooleanLiteralNode arBooleanLiteralNode = new ArBooleanLiteralNode();
            arBooleanLiteralNode.setValue(false);
            node = arBooleanLiteralNode;
        } else if (tokenType.equals("Name")) {
            OperatorIface operator =
                    operatorsRegister.getOperatorByName(tree.getText());
            OperatorSignatureChecker.getInstance().validateOperator(
                    operator, tree, DataType.BOOLEAN);
            ArPredicateNode arPredicateNode = new ArPredicateNode();
            arPredicateNode.setOperator(operator);
            for (int i = 0; i < operator.getOperandsCount(); i++) {
                if (operator.getOperandType(i) == DataType.VERTEX_SET) {
                    arPredicateNode.addOperand(constructVertexSetNode(
                            tree.getChild(i), art));
                } else if (operator.getOperandType(i) == DataType.EDGE_SET) {
                    arPredicateNode.addOperand(constructEdgeSetNode(
                            tree.getChild(i), art));
                } else if (operator.getOperandType(i) == DataType.NUMBER) {
                    arPredicateNode.addOperand(constructIntegerNode(
                            tree.getChild(i)));
                } else if (operator.getOperandType(i) == DataType.LABEL) {
                    arPredicateNode.addOperand(constructStringNode(
                            tree.getChild(i)));
                } else {
                    assert false;
                }
            }
            node = arPredicateNode;
        } else {
            assert false;
        }
        return node;
    }

    protected ArIntegerNodeIface constructIntegerNode(Tree tree) throws FileNotFoundException, IOException {
        ArIntegerNode arIntegerNode = new ArIntegerNode();
        arIntegerNode.setValue(Integer.parseInt(tree.getText()));
        return arIntegerNode;
    }

    protected ArStringNodeIface constructStringNode(Tree tree) throws FileNotFoundException, IOException {
        ArStringNode arStringNode = new ArStringNode();
        arStringNode.setValue(tree.getText());
        return arStringNode;
    }

    protected ArVertexNodeIface constructVertexNode(Tree tree, AtomicRuleType art) throws FileNotFoundException, IOException, ValidationModelGenerationException {
        if (art == AtomicRuleType.EDGE_RULE) {
            throw new ValidationModelGenerationException("You can't use"
                    + "vertex identifier in edge bound rule. (Line: "
                    + tree.getLine() + ", column: "
                    + tree.getCharPositionInLine()
                    + ")");
        }
        return new ArVertexNode();
    }

    protected ArEdgeNodeIface constructEdgeNode(Tree tree, AtomicRuleType art) throws FileNotFoundException, IOException, ValidationModelGenerationException {
        if (art == AtomicRuleType.EDGE_RULE) {
            throw new ValidationModelGenerationException("You can't use"
                    + "edge identifier in vertex bound rule. (Line: "
                    + tree.getLine() + ", column: "
                    + tree.getCharPositionInLine()
                    + ")");
        }
        return new ArEdgeNode();
    }

    protected ArVertexSetNodeIface constructVertexSetNode(Tree tree, AtomicRuleType art) throws FileNotFoundException, IOException, OperatorMismatchException {
        String tokenType = TokenList.getInstance().getTokenName(tree.getType());
        ArVertexSetNodeIface node = null;
        if (tokenType.equals("INTERSECT")) {
            ArVertexIntersectNode arVertexIntersectNode = new ArVertexIntersectNode();
            arVertexIntersectNode.setLeft(constructVertexSetNode(tree.getChild(0), art));
            arVertexIntersectNode.setRight(constructVertexSetNode(tree.getChild(1), art));
            node = arVertexIntersectNode;
        } else if (tokenType.equals("UNION")) {
            ArVertexUnionNode arVertexUnionNode = new ArVertexUnionNode();
            arVertexUnionNode.setLeft(constructVertexSetNode(tree.getChild(0), art));
            arVertexUnionNode.setRight(constructVertexSetNode(tree.getChild(1), art));
            node = arVertexUnionNode;
        } else if (tokenType.equals("SETMINUS")) {
            ArVertexSetminusNode arVertexSetminusNode = new ArVertexSetminusNode();
            arVertexSetminusNode.setLeft(constructVertexSetNode(tree.getChild(0), art));
            arVertexSetminusNode.setRight(constructVertexSetNode(tree.getChild(1), art));
            node = arVertexSetminusNode;
        } else if (tokenType.equals("Name")) {
            OperatorIface operator =
                    operatorsRegister.getOperatorByName(tree.getText());
            OperatorSignatureChecker.getInstance().validateOperator(
                    operator, tree, DataType.VERTEX_SET);
            ArVertexSelector arVertexSelector = new ArVertexSelector();
            arVertexSelector.setOperator(operator);
            for (int i = 0; i < operator.getOperandsCount(); i++) {
                if (operator.getOperandType(i) == DataType.VERTEX) {
                    arVertexSelector.addOperand(constructVertexSetNode(
                            tree.getChild(i), art));
                } else if (operator.getOperandType(i) == DataType.EDGE) {
                    arVertexSelector.addOperand(constructEdgeSetNode(
                            tree.getChild(i), art));
                } else if (operator.getOperandType(i) == DataType.NUMBER) {
                    arVertexSelector.addOperand(constructIntegerNode(
                            tree.getChild(i)));
                } else if (operator.getOperandType(i) == DataType.LABEL) {
                    arVertexSelector.addOperand(constructStringNode(
                            tree.getChild(i)));
                } else {
                    assert false;
                }
            }
            node = arVertexSelector;
        } else {
            assert false;
        }
        return node;
    }

    protected ArEdgeSetNodeIface constructEdgeSetNode(Tree tree, AtomicRuleType art) throws FileNotFoundException, IOException, OperatorMismatchException {
        String tokenType = TokenList.getInstance().getTokenName(tree.getType());
        ArEdgeSetNodeIface node = null;
        if (tokenType.equals("INTERSECT")) {
            ArEdgeIntersectNode arEdgeIntersectNode = new ArEdgeIntersectNode();
            arEdgeIntersectNode.setLeft(constructEdgeSetNode(tree.getChild(0), art));
            arEdgeIntersectNode.setRight(constructEdgeSetNode(tree.getChild(1), art));
            node = arEdgeIntersectNode;
        } else if (tokenType.equals("UNION")) {
            ArEdgeUnionNode arEdgeUnionNode = new ArEdgeUnionNode();
            arEdgeUnionNode.setLeft(constructEdgeSetNode(tree.getChild(0), art));
            arEdgeUnionNode.setRight(constructEdgeSetNode(tree.getChild(1), art));
            node = arEdgeUnionNode;
        } else if (tokenType.equals("SETMINUS")) {
            ArEdgeSetminusNode arEdgeSetminusNode = new ArEdgeSetminusNode();
            arEdgeSetminusNode.setLeft(constructEdgeSetNode(tree.getChild(0), art));
            arEdgeSetminusNode.setRight(constructEdgeSetNode(tree.getChild(1), art));
            node = arEdgeSetminusNode;
        } else if (tokenType.equals("Name")) {
            OperatorIface operator =
                    operatorsRegister.getOperatorByName(tree.getText());
            OperatorSignatureChecker.getInstance().validateOperator(
                    operator, tree, DataType.VERTEX_SET);
            ArEdgeSelector arEdgeSelector = new ArEdgeSelector();
            arEdgeSelector.setOperator(operator);
            for (int i = 0; i < operator.getOperandsCount(); i++) {
                if (operator.getOperandType(i) == DataType.VERTEX) {
                    arEdgeSelector.addOperand(constructEdgeSetNode(
                            tree.getChild(i), art));
                } else if (operator.getOperandType(i) == DataType.EDGE) {
                    arEdgeSelector.addOperand(constructEdgeSetNode(
                            tree.getChild(i), art));
                } else if (operator.getOperandType(i) == DataType.NUMBER) {
                    arEdgeSelector.addOperand(constructIntegerNode(
                            tree.getChild(i)));
                } else if (operator.getOperandType(i) == DataType.LABEL) {
                    arEdgeSelector.addOperand(constructStringNode(
                            tree.getChild(i)));
                } else {
                    assert false;
                }
            }
            node = arEdgeSelector;
        } else {
            assert false;
        }
        return node;
    }
}
