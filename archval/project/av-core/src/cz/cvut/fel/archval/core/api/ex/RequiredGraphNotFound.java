package cz.cvut.fel.archval.core.api.ex;

/**
 * Thrown when graph of required type is not found.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class RequiredGraphNotFound extends Exception {

    /**
     * Creates a new instance of <code>RequiredGraphNotFound</code> without detail message.
     */
    public RequiredGraphNotFound() {
    }


    /**
     * Constructs an instance of <code>RequiredGraphNotFound</code> with the specified detail message.
     * @param msg the detail message.
     */
    public RequiredGraphNotFound(String msg) {
        super(msg);
    }
}
