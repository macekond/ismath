package cz.cvut.fel.archval.core.api.ex;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class GraphGeneratorNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>GraphGeneratorNotFoundException</code> without detail message.
     */
    public GraphGeneratorNotFoundException() {
    }


    /**
     * Constructs an instance of <code>GraphGeneratorNotFoundException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public GraphGeneratorNotFoundException(String msg) {
        super(msg);
    }
}
