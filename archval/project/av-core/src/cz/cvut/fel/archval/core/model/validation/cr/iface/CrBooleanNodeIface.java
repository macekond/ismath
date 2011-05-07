package cz.cvut.fel.archval.core.model.validation.cr.iface;

import cz.cvut.fel.archval.core.api.ex.RequiredGraphNotFound;
import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface CrBooleanNodeIface extends CrObjectNodeIface {

    public Boolean evaluate(GraphModel graphModel, ResultNode resultNode) throws RequiredGraphNotFound;
}
