package cz.cvut.fel.archval.integration.register;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class DuplicateAnalysisNameException extends Exception {

    /**
     * Creates a new instance of <code>DuplicateAnalysisNameException</code> without detail message.
     */
    public DuplicateAnalysisNameException() {
    }


    /**
     * Constructs an instance of <code>DuplicateAnalysisNameException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public DuplicateAnalysisNameException(String msg) {
        super(msg);
    }
}
