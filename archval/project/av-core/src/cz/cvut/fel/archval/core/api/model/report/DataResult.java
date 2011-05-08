package cz.cvut.fel.archval.core.api.model.report;

import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.LinkedList;
import java.util.List;

/**
 * Class representing data result of evaluation tree.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class DataResult extends ResultNode {

    private Object result;
    private DataType dataType;
    private List<ResultNode> children;

    public DataResult() {
        children = new LinkedList<ResultNode>();
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public int getChildrenCount() {
        return children.size();
    }

    public void addChild(ResultNode resultNode) {
        children.add(resultNode);
    }

    public ResultNode getChild(int index) {
        return children.get(index);
    }
}
