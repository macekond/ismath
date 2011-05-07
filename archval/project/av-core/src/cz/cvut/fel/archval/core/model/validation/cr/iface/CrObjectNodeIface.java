package cz.cvut.fel.archval.core.model.validation.cr.iface;

import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface CrObjectNodeIface {

    public Object evaluate(GraphModel graphModel);

    public Set<String> getRequiredGraphTypes();
}
