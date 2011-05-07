package cz.cvut.fel.archval.core.api.model.validation.cr.node;

import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.validation.cr.iface.CrBooleanNodeIface;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class CrOrNode implements CrBooleanNodeIface {

    public CrBooleanNodeIface left;
    public CrBooleanNodeIface right;

    public void setLeft(CrBooleanNodeIface left) {
        this.left = left;
    }

    public void setRight(CrBooleanNodeIface right) {
        this.right = right;
    }

    public Boolean evaluate(GraphModel graphModel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
