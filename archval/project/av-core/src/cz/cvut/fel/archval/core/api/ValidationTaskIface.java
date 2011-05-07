package cz.cvut.fel.archval.core.api;

import cz.cvut.fel.archval.core.api.model.report.ValidationReport;

/**
 * ValidationTask interface.
 * 
 * This object is returned by ArchVal factory and can be used to launch
 * and control validation process.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface ValidationTaskIface {

    /**
     * Start validation task synchronously. This will cause caller wait till the
     * validation process is completed.
     */
    public void runSynchronous();

    /**
     * Run validation task in separate thread. This method returns immediately.
     * Caller may in advance register listener using
     * registerValidationCompletedListener method in order to be notified when
     * the validation is completed. After validation caller may get validation
     * report by call to getReport() method.
     */
    public void runAsynchronous();

    /**
     * Allows caller to register listener to be run when the validation proces
     * finishes.
     *
     * @param validationCompletedListener
     */
    public void registerValidationCompletedListener(
            ValidationCompletedListener validationCompletedListener);

    /**
     * Returns validation report after previous call to either runSynchronous()
     * or runAsynchronous method. If this is called without aforementioned
     * methods call, throws IllegalStateException. If previous call was run
     * asynchronous and some error occurred during validation, this method
     * returns null.
     *
     * @return ValidationReport object of previous validation
     * @throws IllegalStateException if this was called without previous call to
     * one of run* methods
     */
    public ValidationReport getReport() throws IllegalStateException;
}
