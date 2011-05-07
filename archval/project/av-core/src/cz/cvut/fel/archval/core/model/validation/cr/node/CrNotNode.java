package cz.cvut.fel.archval.core.model.validation.cr.node;

import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.model.validation.cr.iface.CrBooleanNodeIface;
import java.util.Set;

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
        return !operand.evaluate(graphModel);
    }

    public Set<String> getRequiredGraphTypes() {
        return operand.getRequiredGraphTypes();
    }
}
