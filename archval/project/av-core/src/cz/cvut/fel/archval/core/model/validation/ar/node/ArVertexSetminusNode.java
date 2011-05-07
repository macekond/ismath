package cz.cvut.fel.archval.core.model.validation.ar.node;

import cz.cvut.fel.archval.core.api.model.graph.Edge;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.graph.Vertex;
import cz.cvut.fel.archval.core.api.model.report.DataResult;
import cz.cvut.fel.archval.core.api.model.report.ResultNode;
import cz.cvut.fel.archval.core.api.types.DataType;
import cz.cvut.fel.archval.core.model.validation.ar.iface.ArVertexSetNodeIface;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArVertexSetminusNode implements ArVertexSetNodeIface {

    private ArVertexSetNodeIface left;
    private ArVertexSetNodeIface right;

    public ArVertexSetNodeIface getLeft() {
        return left;
    }

    public void setLeft(ArVertexSetNodeIface left) {
        this.left = left;
    }

    public ArVertexSetNodeIface getRight() {
        return right;
    }

    public void setRight(ArVertexSetNodeIface right) {
        this.right = right;
    }

    public Set<Vertex> evaluate(Graph graph, Vertex vertex, ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        DataResult leftResult = new DataResult();
        DataResult rightResult = new DataResult();
        dataResult.addChild(leftResult);
        dataResult.addChild(rightResult);
        HashSet<Vertex> hashSet = new HashSet<Vertex>();
        hashSet.addAll(left.evaluate(graph, vertex, leftResult));
        hashSet.removeAll(right.evaluate(graph, vertex, rightResult));
        dataResult.setResult(hashSet);
        dataResult.setDataType(DataType.VERTEX_SET);
        return hashSet;
    }

    public Set<Vertex> evaluate(Graph graph, Edge edge, ResultNode resultNode) {
        DataResult dataResult = (DataResult) resultNode;
        DataResult leftResult = new DataResult();
        DataResult rightResult = new DataResult();
        dataResult.addChild(leftResult);
        dataResult.addChild(rightResult);
        HashSet<Vertex> hashSet = new HashSet<Vertex>();
        hashSet.addAll(left.evaluate(graph, edge, leftResult));
        hashSet.removeAll(right.evaluate(graph, edge, rightResult));
        dataResult.setResult(hashSet);
        dataResult.setDataType(DataType.VERTEX_SET);
        return hashSet;
    }
}
