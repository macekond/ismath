package cz.cvut.fel.archval.core.api.model.validation.cr.node;

import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.validation.cr.iface.CrBooleanNodeIface;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class CrNotNode implements CrBooleanNodeIface {

    public CrBooleanNodeIface operand;

    public void setOperand(CrBooleanNodeIface operand) {
        this.operand = operand;
    }

    public Boolean evaluate(GraphModel graphModel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
