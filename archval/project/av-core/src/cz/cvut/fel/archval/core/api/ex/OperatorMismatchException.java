package cz.cvut.fel.archval.core.api.ex;

/**
 * Thrown when invalid operator is found in the AVD specification.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class OperatorMismatchException extends Exception {

    public OperatorMismatchException(String string) {
        super(string);
    }

}
