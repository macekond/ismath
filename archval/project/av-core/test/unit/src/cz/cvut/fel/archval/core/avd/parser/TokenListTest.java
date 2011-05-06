package cz.cvut.fel.archval.core.avd.parser;

import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for simple class reading list of tokens from file.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class TokenListTest {

    /**
     * Test of readTokenList method, of class TokenList.
     */
    @Test
    public void testTokenListProvidesValidValues() throws Exception {
        System.out.println("readTokenList");
        TokenList instance = TokenList.getInstance();

        // fixed existing set
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(17, "COMPOUND_RULE_KW");
        hashmap.put(4, "VALIDATION_UNIT");
        hashmap.put(7, "VALIDATE_COMMANDS");
        hashmap.put(25, "VertexSet");
        hashmap.put(15, "RBRACE");
        hashmap.put(5, "ATOMIC_RULES");
        hashmap.put(9, "RULE_EXPRESSION");
        hashmap.put(33, "False");
        hashmap.put(14, "LBRACE");
        hashmap.put(19, "ANALYZE_KW");
        hashmap.put(16, "SEMICOLON");
        hashmap.put(10, "ATOMIC_RULE_KW");
        hashmap.put(31, "NOT");
        hashmap.put(30, "AND");
        hashmap.put(37, "UNION");
        hashmap.put(12, "LPAREN");
        hashmap.put(28, "COLON");
        hashmap.put(36, "INTERSECT");
        hashmap.put(13, "RPAREN");
        hashmap.put(39, "WS");
        hashmap.put(6, "COMPOUND_RULES");
        hashmap.put(24, "IN");
        hashmap.put(34, "Number");
        hashmap.put(27, "EdgeSet");
        hashmap.put(20, "COMMA");
        hashmap.put(26, "Edge");
        hashmap.put(23, "Vertex");
        hashmap.put(21, "ALL");
        hashmap.put(29, "OR");
        hashmap.put(8, "ANALYZE_COMMANDS");
        hashmap.put(18, "VALIDATE_KW");
        hashmap.put(11, "Name");
        hashmap.put(22, "EXISTS");
        hashmap.put(32, "True");
        hashmap.put(38, "SETMINUS");
        hashmap.put(35, "Label");

        for (Integer integer : hashmap.keySet()) {
            Assert.assertEquals(hashmap.get(integer), instance.getTokenName(integer));
        }

        Assert.assertNull(instance.getTokenName(-1));

        // NOTE: this test can break when antlr parser is updated, then it's
        // necessary to update hashmap variable as well
    }
}
