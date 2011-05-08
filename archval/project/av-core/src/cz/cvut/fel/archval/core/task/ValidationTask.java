package cz.cvut.fel.archval.core.task;

import cz.cvut.fel.archval.core.api.ValidationCompletedListener;
import cz.cvut.fel.archval.core.api.ValidationTaskIface;
import cz.cvut.fel.archval.core.api.ex.RequiredGraphNotFound;
import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.report.ValidationReport;
import cz.cvut.fel.archval.core.model.validation.ValidationModel;
import java.util.LinkedList;
import java.util.List;

/**
 * Manages validation process.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ValidationTask implements ValidationTaskIface {

    private boolean taskRunning = false;
    private boolean validationPerformed;
    private GraphModel graphModel;
    private ValidationModel validationModel;
    private ValidationReport validationReport;
    private List<ValidationCompletedListener> validationCompletedListeners;
    private Exception caughtException;

    public ValidationTask(GraphModel graphModel, ValidationModel validationModel) {
        this.graphModel = graphModel;
        this.validationModel = validationModel;
        validationCompletedListeners = new LinkedList<ValidationCompletedListener>();
        caughtException = null;
        validationPerformed = false;
    }

    public void runSynchronous() {
        try {
            validationModel.validate(graphModel);
        } catch (RequiredGraphNotFound ex) {
            caughtException = ex;
        }
        validationPerformed = true;
    }

    public synchronized void runAsynchronous() {
        if (taskRunning == true) {
            throw new IllegalStateException("It's illegal to run one validation"
                    + " task more then once.");
        }
        taskRunning = true;
        new Thread(new Runnable() {

            public void run() {
                runSynchronous();
                fireValidationCompletedEvent();
            }
        }).start();
    }

    public void registerValidationCompletedListener(ValidationCompletedListener validationCompletedListener) {
        validationCompletedListeners.add(validationCompletedListener);
    }

    public ValidationReport getReport() {
        if (validationPerformed == false) {
            throw new IllegalStateException("You can't call this method before"
                    + " one of run* methods.");
        }
        return validationReport;
    }

    private void fireValidationCompletedEvent() {
        for (ValidationCompletedListener validationCompletedListener : validationCompletedListeners) {
            validationCompletedListener.validationCompleted(caughtException);
        }
    }
}
