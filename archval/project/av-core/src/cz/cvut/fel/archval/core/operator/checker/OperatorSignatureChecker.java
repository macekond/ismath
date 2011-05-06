package cz.cvut.fel.archval.core.operator.checker;

import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import cz.cvut.fel.archval.core.api.types.TokenTypeMap;
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

        // TODO: untested code!! requires review and unit tests

        // check operator name
        String operatorName = operatorTree.getText();
        // OperatorIface selectedOperator = operatorsRegister.getOperatorByName(operatorName);
        if (expectedOperator == null) {
            throw new OperatorMismatchException("Operator with name "
                    + operatorName + " was not found. (Line: "
                    + operatorTree.getLine() + ", column: "
                    + +operatorTree.getCharPositionInLine() + ")");
        }

        // check parameters count
        int paramsCount = operatorTree.getChildCount();
        if (expectedOperator.getOperandsCount() != paramsCount) {
            throw new OperatorMismatchException("Invalid operator operands"
                    + "count. Found operator with same name, but with "
                    + "differend paramater count. (Line: "
                    + operatorTree.getLine() + ", column: "
                    + +operatorTree.getCharPositionInLine() + ")");
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

            if (operandType != expectedOperator.getOperandType(i)) {
                throw new OperatorMismatchException("Unexpected parameter "
                        + "type. Expected "
                        + expectedOperator.getOperandType(i).toString()
                        + "value. (Line: " + operandTree.getLine()
                        + ", column: " + operandTree.getCharPositionInLine()
                        + ")");
            }
        }
    }
}
