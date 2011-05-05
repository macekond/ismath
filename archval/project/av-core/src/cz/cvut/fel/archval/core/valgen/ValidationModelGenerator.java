package cz.cvut.fel.archval.core.valgen;

import cz.cvut.fel.archval.core.api.ValidationModelGeneratorIface;
import cz.cvut.fel.archval.core.api.analysis.AnalysisIface;
import cz.cvut.fel.archval.core.api.register.AnalysesRegisterIface;
import cz.cvut.fel.archval.core.api.register.OperatorsRegisterIface;
import cz.cvut.fel.archval.core.api.ex.valgen.ValidationModelGenerationException;
import cz.cvut.fel.archval.core.avd.parser.ArchvalRulesetGrammarLexer;
import cz.cvut.fel.archval.core.avd.parser.ArchvalRulesetGrammarParser;
import cz.cvut.fel.archval.core.api.model.validation.ValidationModel;
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

    public ValidationModel constructValidationModel(InputStream is) throws IOException, RecognitionException, ValidationModelGenerationException {
        return constructValidationModel(new ANTLRInputStream(is));
    }

    public ValidationModel constructValidationModel(String string) throws RecognitionException, ValidationModelGenerationException {
        return constructValidationModel(new ANTLRStringStream(string));
    }

    protected ValidationModel constructValidationModel(CharStream charStream) throws RecognitionException, ValidationModelGenerationException {

        Tree avdTree = getTreeForCharStream(charStream);

        ValidationModel validationModel = new ValidationModel();

        // TODO: process first three sections:
        // ATOMIC_RULES
        // COMPOUND_RULES
        // VALIDATE_COMMANDS

        /*
         * Processing analysis commands
         */
        addAnalysesToModel(avdTree.getChild(3), validationModel);

        return validationModel;
    }

    protected Tree getTreeForCharStream(CharStream charStream) throws RecognitionException {

        ArchvalRulesetGrammarLexer argl = new ArchvalRulesetGrammarLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(argl);

        ArchvalRulesetGrammarParser archvalRulesetGrammarParser =
                new ArchvalRulesetGrammarParser(tokens);

        ArchvalRulesetGrammarParser.validation_unit_return validationUnitElement =
                archvalRulesetGrammarParser.validation_unit();
        return (Tree) validationUnitElement.getTree();
    }

    protected ValidationModel addAnalysesToModel(Tree analyzeCommandsTree, ValidationModel validationModel) throws ValidationModelGenerationException {
        for (int i = 0; i < analyzeCommandsTree.getChildCount(); i++) {
            Tree analysisTree = analyzeCommandsTree.getChild(i);
            String text = analyzeCommandsTree.getChild(i).getText();
            AnalysisIface analysis = analysesRegister.getAnalysisByName(text);
            if (analysis == null) {
                throw new ValidationModelGenerationException(
                        "Analysis with " + analysis + " specified on line "
                        + analysisTree.getLine() + " and position "
                        + analysisTree.getCharPositionInLine() + " was not found.");
            }
            validationModel.addAnalysis(analysis);
        }
        return validationModel;
    }
}
