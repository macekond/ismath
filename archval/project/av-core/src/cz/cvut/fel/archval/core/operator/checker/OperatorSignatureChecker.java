package cz.cvut.fel.archval.core.operator.checker;

import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import cz.cvut.fel.archval.core.api.types.TokenTypeMap;
import cz.cvut.fel.archval.core.avd.parser.TokenList;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.antlr.runtime.tree.Tree;

/**
 * Singleton class providing simple method for checking if operator represented 
 * by antlr tree matches supplied OperatorInterface and if it can be safely
 * used.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class OperatorSignatureChecker {

    private static OperatorSignatureChecker instance;

    private OperatorSignatureChecker() {
    }

    public static OperatorSignatureChecker getInstance() {
        if (instance == null) {
            instance = new OperatorSignatureChecker();
        }
        return instance;
    }

    /**
     * Checks if the operator represented by antlr tree matches expected
     * operator.
     *
     * Expected operator may be null. In such case OperatorMismatchException is
     * thrown as if there was no match.
     *
     * @param expectedOperator operator to be validated, null value is perfectly acceptable
     * @param operatorTree antlr tree to be matched as operator
     * @throws OperatorMismatchException thrown when operator represented by the tree doesnt' match the expected operator or if the expected operator is null
     */
    public void validateOperator(
            OperatorIface expectedOperator, Tree operatorTree,
            DataType expectedReturnType) throws
            OperatorMismatchException, FileNotFoundException, IOException {

        // check that expected operator is not null
        String operatorName = operatorTree.getText();
        if (expectedOperator == null) {
            throw new OperatorMismatchException("Operator with name "
                    + operatorName + " was not found. (Line: "
                    + operatorTree.getLine() + ", column: "
                    + operatorTree.getCharPositionInLine() + ")");
        }

        // check that operator name match
        if (!expectedOperator.getName().equals(operatorName)) {
            throw new OperatorMismatchException("Invalid operator name."
                    + "Expected operator name was: '"
                    + expectedOperator.getName() + "', but '" + operatorName
                    + "' was found. (Line: "
                    + operatorTree.getLine() + ", column: "
                    + operatorTree.getCharPositionInLine() + ")");
        }

        // check parameters count
        int paramsCount = operatorTree.getChildCount();
        if (expectedOperator.getOperandsCount() != paramsCount) {
            throw new OperatorMismatchException("Invalid operator operands"
                    + "count. Found operator with same name, but with "
                    + "differend paramater count. (Line: "
                    + operatorTree.getLine() + ", column: "
                    + operatorTree.getCharPositionInLine() + ")");
        }

        if (expectedOperator.getReturnType() != expectedReturnType) {
            throw new OperatorMismatchException("Invalid operator return "
                    + "value. (Line: " + operatorTree.getLine()
                    + ", column: " + operatorTree.getCharPositionInLine()
                    + ")");
        }

        // check operand types
        for (int i = 0; i < paramsCount; i++) {
            Tree operandTree = operatorTree.getChild(i);
            TokenTypeMap ttm = TokenTypeMap.getInstance();
            DataType operandType = ttm.getTokenDataType(operandTree.getType());
            String tokenType = TokenList.getInstance().getTokenName(
                    operandTree.getType());

            if (operandType != DataType.UNKNOWN) {
                if (operandType != expectedOperator.getOperandType(i)) {
                    throwUnexpectedOperatorException(operandTree, expectedOperator.getOperandType(i));
                }
                continue;
            }

            // data type is unknown
            if (expectedOperator.getOperandType(i) == DataType.BOOLEAN) {
                if (tokenType.equals("Name")) {
                    continue;
                }
                throwUnexpectedOperatorException(operandTree, expectedOperator.getOperandType(i));
            }

            if (expectedOperator.getOperandType(i) == DataType.VERTEX_SET
                    || expectedOperator.getOperandType(i) == DataType.EDGE_SET) {
                if (tokenType.equals("UNION")
                        || tokenType.equals("INTERSECT")
                        || tokenType.equals("SETMINUS")
                        || tokenType.equals("Name")) {
                    continue;
                }
                throwUnexpectedOperatorException(operandTree, expectedOperator.getOperandType(i));
            }
        }

    }

    protected void throwUnexpectedOperatorException(Tree operandTree, DataType expectedType)
            throws OperatorMismatchException {
        throw new OperatorMismatchException("Unexpected parameter "
                + "type. Expected "
                + expectedType.toString()
                + "value. (Line: " + operandTree.getLine()
                + ", column: " + operandTree.getCharPositionInLine()
                + ")");
    }
}
