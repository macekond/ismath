package cz.cvut.fel.archval.integration.register;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class DuplicateGraphGeneratorException extends Exception {

    /**
     * Creates a new instance of <code>DuplicateGraphGeneratorException</code> without detail message.
     */
    public DuplicateGraphGeneratorException() {
    }


    /**
     * Constructs an instance of <code>DuplicateGraphGeneratorException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public DuplicateGraphGeneratorException(String msg) {
        super(msg);
    }
}
