package cz.cvut.fel.archval.core.api.ex.valgen;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ValidationModelGenerationException extends Exception {

    /**
     * Creates a new instance of <code>ValidationModelGenerationException</code> without detail message.
     */
    public ValidationModelGenerationException() {
    }

    /**
     * Constructs an instance of <code>ValidationModelGenerationException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public ValidationModelGenerationException(String msg) {
        super(msg);
    }
}
