package cz.cvut.fel.archval.core.model.validation.cr.node;

import cz.cvut.fel.archval.core.api.ex.RequiredGraphNotFound;
import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.report.DataResult;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;
import cz.cvut.fel.archval.core.api.types.DataType;
import cz.cvut.fel.archval.core.model.validation.Rule;
import cz.cvut.fel.archval.core.model.validation.cr.iface.CrBooleanNodeIface;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class CrRuleNode implements CrBooleanNodeIface {

    private Rule rule;

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public Boolean evaluate(GraphModel graphModel, ResultNode resultNode) throws RequiredGraphNotFound {
        DataResult dataResult = (DataResult) resultNode;
        DataResult childDataResult = new DataResult();
        dataResult.addChild(childDataResult);
        Boolean result = rule.evaluate(graphModel, childDataResult);
        dataResult.setResult(result);
        dataResult.setDataType(DataType.BOOLEAN);
        return result;
    }

    public Set<String> getRequiredGraphTypes() {
        return rule.getRequiredGraphTypes();
    }
}
