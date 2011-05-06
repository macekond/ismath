package cz.cvut.fel.archval.core.api.validator;

import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.report.ValidationReport;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface Validator {

    ValidationReport validate(GraphModel graphModel);

}
