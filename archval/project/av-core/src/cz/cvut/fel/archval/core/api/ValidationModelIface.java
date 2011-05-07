
package cz.cvut.fel.archval.core.api;

import cz.cvut.fel.archval.core.api.ex.RequiredGraphNotFound;
import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.report.ValidationReport;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface ValidationModelIface {

    Set<String> getAllRequiredGraphTypes();

    /**
     * Validator interface implementation. This method is to be used by task
     * to validate existing GraphModel.
     *
     * @param graphModel model to be validated by this ValidationModel
     * @return ValidationReport object, which is tree of validation result for avd file tree structure
     */
    ValidationReport validate(GraphModel graphModel) throws RequiredGraphNotFound;

}
