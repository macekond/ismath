package cz.cvut.fel.archval.core.model.validation.cr.node;

import cz.cvut.fel.archval.core.api.ex.RequiredGraphNotFound;
import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.report.DataResult;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;
import cz.cvut.fel.archval.core.api.types.DataType;
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

    public Set<String> getRequiredGraphTypes() {
        return operand.getRequiredGraphTypes();
    }

    public Boolean evaluate(GraphModel graphModel, ResultNode resultNode) throws RequiredGraphNotFound {
        DataResult dataResult = (DataResult) resultNode;
        DataResult childDataResult = new DataResult();
        dataResult.addChild(childDataResult);
        Boolean result = !operand.evaluate(graphModel, childDataResult);
        dataResult.setResult(result);
        dataResult.setDataType(DataType.BOOLEAN);
        return result;
    }
}
