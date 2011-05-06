package cz.cvut.fel.archval.core.api.model.validation.cr.iface;

import cz.cvut.fel.archval.core.api.model.graph.GraphModel;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface CrObjectNodeIface {

    public Object evaluate(GraphModel graphModel);

}
