package cz.cvut.fel.archval.core.task;

import cz.cvut.fel.archval.core.api.ValidationCompletedListener;
import cz.cvut.fel.archval.core.api.ValidationTaskIface;
import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.report.ValidationReport;
import cz.cvut.fel.archval.core.model.validation.ValidationModel;

/**
 * Manages validation process.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ValidationTask implements ValidationTaskIface {

    public ValidationTask(GraphModel graphModel, ValidationModel validationModel) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void runSynchronous() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void runAsynchronous() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void registerValidationCompletedListener(ValidationCompletedListener validationCompletedListener) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ValidationReport getReport() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
