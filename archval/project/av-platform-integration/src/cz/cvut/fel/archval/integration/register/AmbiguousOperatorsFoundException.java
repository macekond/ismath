package cz.cvut.fel.archval.integration.register;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class AmbiguousOperatorsFoundException extends Exception {

    /**
     * Creates a new instance of <code>AmbiguousOperatorsFoundException</code> without detail message.
     */
    public AmbiguousOperatorsFoundException() {
    }


    /**
     * Constructs an instance of <code>AmbiguousOperatorsFoundException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public AmbiguousOperatorsFoundException(String msg) {
        super(msg);
    }
}
