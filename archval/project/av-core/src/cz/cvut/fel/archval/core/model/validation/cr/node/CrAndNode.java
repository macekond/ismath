package cz.cvut.fel.archval.core.model.validation.cr.node;

import cz.cvut.fel.archval.core.api.ex.RequiredGraphNotFound;
import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.report.DataResult;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;
import cz.cvut.fel.archval.core.api.types.DataType;
import cz.cvut.fel.archval.core.model.validation.cr.iface.CrBooleanNodeIface;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class CrAndNode implements CrBooleanNodeIface {

    public CrBooleanNodeIface left;
    public CrBooleanNodeIface right;

    public void setLeft(CrBooleanNodeIface left) {
        this.left = left;
    }

    public void setRight(CrBooleanNodeIface right) {
        this.right = right;
    }

    public Set<String> getRequiredGraphTypes() {
        Set<String> requiredGraphTypes = new HashSet<String>();
        requiredGraphTypes.addAll(left.getRequiredGraphTypes());
        requiredGraphTypes.addAll(right.getRequiredGraphTypes());
        return requiredGraphTypes;
    }

    public Boolean evaluate(GraphModel graphModel, ResultNode resultNode) throws RequiredGraphNotFound {
        DataResult dataResult = (DataResult) resultNode;
        DataResult leftDataResult = new DataResult();
        DataResult rightDataResult = new DataResult();
        dataResult.addChild(leftDataResult);
        dataResult.addChild(leftDataResult);
        Boolean leftResult = left.evaluate(graphModel, leftDataResult);
        Boolean rightResult = right.evaluate(graphModel, rightDataResult);
        Boolean result = leftResult && rightResult;
        dataResult.setResult(result);
        dataResult.setDataType(DataType.BOOLEAN);
        return result;
    }
}
