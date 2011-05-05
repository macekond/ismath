package cz.cvut.fel.archval.core.api.valgen;

import cz.cvut.fel.archval.core.api.ValidationModelGeneratorIface;
import cz.cvut.fel.archval.core.api.register.AnalysesRegisterIface;
import cz.cvut.fel.archval.core.api.register.OperatorsRegisterIface;
import cz.cvut.fel.archval.core.avd.parser.ArchvalRulesetGrammarLexer;
import cz.cvut.fel.archval.core.avd.parser.ArchvalRulesetGrammarParser;
import cz.cvut.fel.archval.core.model.validation.ValidationModel;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ValidationModelGenerator implements ValidationModelGeneratorIface {

    private OperatorsRegisterIface operatorsRegister;
    private AnalysesRegisterIface analysesRegister;

    public ValidationModelGenerator(
            OperatorsRegisterIface operatorsRegister,
            AnalysesRegisterIface analysesRegister) {

        this.operatorsRegister = operatorsRegister;
        this.analysesRegister = analysesRegister;
    }

    public ValidationModel constructValidationModel(InputStream is) throws IOException, RecognitionException {
        return constructValidationModel(new ANTLRInputStream(is));
    }

    public ValidationModel constructValidationModel(String string) throws RecognitionException {
        return constructValidationModel(new ANTLRStringStream(string));
    }

    private ValidationModel constructValidationModel(CharStream charStream) throws RecognitionException {
        ArchvalRulesetGrammarLexer argl = new ArchvalRulesetGrammarLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(argl);
        ArchvalRulesetGrammarParser archvalRulesetGrammarParser = new ArchvalRulesetGrammarParser(tokens);
        ArchvalRulesetGrammarParser.validation_unit_return vur = archvalRulesetGrammarParser.validation_unit();
        Tree ct = (Tree) vur.getTree();

        // TODO: convert tree into model and return this model

        ValidationModel validationModel = new ValidationModel();
        return validationModel;
    }
}
