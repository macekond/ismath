package cz.cvut.fel.archval.core.model.graph;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class VertexTest {

    /**
     * Test of create method, of class Vertex.
     */
    @Test(expected=IllegalArgumentException.class)
    public void vertexCantBeCreatedWithNullValues() {
        System.out.println("vertexCantBeCreatedWithNullValues");
        String name = null;
        String type = null;
        Vertex result = Vertex.create(name, type);        
    }

    /**
     * Test of accept method, of class Vertex.
     */
    @Test
    public void acceptMethodShouldNotFailForNullVisitor() {
        System.out.println("acceptMethodShouldNotFailForNullVisitors");
        String name = "name";
        String kind = "kind";
        Vertex instance = Vertex.create(name, kind);
        instance.accept(null);
    }

    /**
     * Tests if getters return expected values
     */
    @Test
    public void gettersReturnExpectedValues() {
        System.out.println("gettersReturnExpectedValues");
        String name = "name";
        String kind = "kind";
        Vertex instance = Vertex.create(name, kind);
        Assert.assertEquals(name, instance.getName());
        Assert.assertEquals(kind, instance.getKind());
    }
}
