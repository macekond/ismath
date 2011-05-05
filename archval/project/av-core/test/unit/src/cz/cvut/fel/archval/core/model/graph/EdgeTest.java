package cz.cvut.fel.archval.core.model.graph;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class EdgeTest {

    /**
     * Edge can't be created with null values.
     */
    @Test(expected = IllegalArgumentException.class)
    public void edgeCreateMethodDoesntAcceptNullValues() {
        Edge edge = Edge.create(null, null, null);
    }

    /**
     * Test of accept method, of class Edge.
     */
    @Test
    public void testAcceptNoFailForNullVisitor() {
        System.out.println("testAcceptNoFailForNullVisitor");
        Edge instance = Edge.create(
                Vertex.create("name1", "type1"),
                Vertex.create("name2", "type2"),
                "testingclassifier");
        instance.accept(null);
    }

    /**
     * Tests if getters return expected value
     */
    @Test
    public void gettersReturnExpectedValues() {
        System.out.println("gettersReturnExpectedValues");
        String headName = "name1";
        String headKind = "kind1";
        String tailName = "name2";
        String tailKind = "kind2";
        String classifier = "testingclassifier";

        Edge instance = Edge.create(
                Vertex.create(tailName, tailKind),
                Vertex.create(headName, headKind),
                classifier);
        Assert.assertEquals(headName, instance.getHead().getName());
        Assert.assertEquals(headKind, instance.getHead().getKind());
        Assert.assertEquals(tailName, instance.getTail().getName());
        Assert.assertEquals(tailKind, instance.getTail().getKind());
        Assert.assertEquals(classifier, instance.getClassifier());
    }
}
