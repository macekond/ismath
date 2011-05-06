package cz.cvut.fel.archval.core.api.ex;

/**
 * Thrown when some operator could not be found, has different signature, etc.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class OperatorNotFoundException extends Exception {

    public OperatorNotFoundException(String string) {
        super(string);
    }
}
