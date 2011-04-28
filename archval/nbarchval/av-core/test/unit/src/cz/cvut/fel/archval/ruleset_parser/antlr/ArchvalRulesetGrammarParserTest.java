package cz.cvut.fel.archval.ruleset_parser.antlr;

import antlr.ANTLRException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

/**
 * Unit test for validation ruleset parser
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArchvalRulesetGrammarParserTest {

    public ArchvalRulesetGrammarParserTest() {
    }

    @Test
    public void noFailForRightInput() {
        try {
            CharStream charStream = new ANTLRInputStream(this.getClass().getResourceAsStream("testing-valid.avd"));
            ArchvalRulesetGrammarLexer argl = new ArchvalRulesetGrammarLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream();
            tokens.setTokenSource(argl);
            ArchvalRulesetGrammarParser archvalRulesetGrammarParser = new ArchvalRulesetGrammarParser(tokens);
            archvalRulesetGrammarParser.validation_unit();
        } catch (RecognitionException ex) {
            Logger.getLogger(ArchvalRulesetGrammarParserTest.class.getName()).log(Level.SEVERE, null, ex);
            Assert.fail();
        } catch (IOException ex) {
            Logger.getLogger(ArchvalRulesetGrammarParserTest.class.getName()).log(Level.SEVERE, null, ex);
            Assert.fail();
        }
    }

    @Test(expected = RecognitionException.class)
    public void shouldThrowExceptionForInvalidInput() throws RecognitionException, IOException {
        CharStream charStream = new ANTLRInputStream(this.getClass().getResourceAsStream("testing-invalid.avd"));
        ArchvalRulesetGrammarLexer argl = new ArchvalRulesetGrammarLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(argl);
        ArchvalRulesetGrammarParser archvalRulesetGrammarParser = new ArchvalRulesetGrammarParser(tokens);
        archvalRulesetGrammarParser.validation_unit();
    }

    @Test
    public void validRulesTreeForValidInput() {
        try {
            CharStream charStream = new ANTLRInputStream(this.getClass().getResourceAsStream("testing.avd"));
            ArchvalRulesetGrammarLexer argl = new ArchvalRulesetGrammarLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream();
            tokens.setTokenSource(argl);
            ArchvalRulesetGrammarParser archvalRulesetGrammarParser = new ArchvalRulesetGrammarParser(tokens);
            ArchvalRulesetGrammarParser.validation_unit_return vur = archvalRulesetGrammarParser.validation_unit();
            Tree ct = (Tree) vur.getTree();
            Assert.assertNotNull(ct);
            Assert.assertEquals("VALIDATION_UNIT", ct.getText());
            Assert.assertEquals("ATOMIC_RULES", ct.getChild(0).getText());
            Assert.assertEquals("COMPOUND_RULES", ct.getChild(1).getText());
            Assert.assertEquals("VALIDATE_COMMANDS", ct.getChild(2).getText());
            Assert.assertEquals("ANALYZE_COMMANDS", ct.getChild(3).getText());
        } catch (RecognitionException ex) {
            Logger.getLogger(ArchvalRulesetGrammarParserTest.class.getName()).log(Level.SEVERE, null, ex);
            Assert.fail();
        } catch (IOException ex) {
            Logger.getLogger(ArchvalRulesetGrammarParserTest.class.getName()).log(Level.SEVERE, null, ex);
            Assert.fail();
        }
    }

    @Test(expected = RecognitionException.class)
    public void throwExceptionForInvalidRulesTree() throws IOException, RecognitionException {
        CharStream charStream = new ANTLRInputStream(this.getClass().getResourceAsStream("testing-invalid.avd"));
        ArchvalRulesetGrammarLexer argl = new ArchvalRulesetGrammarLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(argl);
        ArchvalRulesetGrammarParser archvalRulesetGrammarParser = new ArchvalRulesetGrammarParser(tokens);
        ArchvalRulesetGrammarParser.validation_unit_return vur = archvalRulesetGrammarParser.validation_unit();
        Tree ct = (Tree) vur.getTree();
        Assert.assertNotNull(ct);
        Assert.assertEquals("VALIDATION_UNIT", ct.getText());
        Assert.assertEquals("ATOMIC_RULES", ct.getChild(0).getText());
        Assert.assertEquals("COMPOUND_RULES", ct.getChild(1).getText());
        Assert.assertEquals("VALIDATE_COMMANDS", ct.getChild(2).getText());
        Assert.assertEquals("ANALYZE_COMMANDS", ct.getChild(3).getText());
    }
}
