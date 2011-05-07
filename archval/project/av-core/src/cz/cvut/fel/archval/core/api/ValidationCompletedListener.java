package cz.cvut.fel.archval.core.api;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface ValidationCompletedListener {

    /**
     * This method is called when ValidationTasks finishes processing
     * when run in asynchronous mode.
     *
     * @param ex null if the validation process completed successfully,
     * some exception instance otherwise
     */
    public void validationCompleted(Exception ex);
}
