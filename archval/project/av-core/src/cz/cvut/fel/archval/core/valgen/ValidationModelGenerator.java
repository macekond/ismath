package cz.cvut.fel.archval.core.valgen;

import cz.cvut.fel.archval.core.api.ValidationModelGeneratorIface;
import cz.cvut.fel.archval.core.api.analysis.AnalysisIface;
import cz.cvut.fel.archval.core.api.ex.OperatorNotFoundException;
import cz.cvut.fel.archval.core.api.register.AnalysesRegisterIface;
import cz.cvut.fel.archval.core.api.register.OperatorsRegisterIface;
import cz.cvut.fel.archval.core.api.ex.ValidationModelGenerationException;
import cz.cvut.fel.archval.core.api.model.validation.Rule;
import cz.cvut.fel.archval.core.avd.parser.ArchvalRulesetGrammarLexer;
import cz.cvut.fel.archval.core.avd.parser.ArchvalRulesetGrammarParser;
import cz.cvut.fel.archval.core.api.model.validation.ValidationModel;
import cz.cvut.fel.archval.core.operator.checker.OperatorMismatchException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

/**
 * Generates ValidationMOdel based on operators and analyses from available
 * registers and avd file supplied as stream or string.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ValidationModelGenerator implements ValidationModelGeneratorIface {

    private OperatorsRegisterIface operatorsRegister;
    private AnalysesRegisterIface analysesRegister;
    private AtomicRuleGenerator atomicRuleGenerator;
    private CompoundRuleGenerator compoundRuleGenerator;

    public ValidationModelGenerator(
            OperatorsRegisterIface operatorsRegister,
            AnalysesRegisterIface analysesRegister) {

        this.operatorsRegister = operatorsRegister;
        this.analysesRegister = analysesRegister;

        atomicRuleGenerator = new AtomicRuleGenerator(operatorsRegister);
        compoundRuleGenerator = new CompoundRuleGenerator(operatorsRegister);
    }

    public ValidationModel constructValidationModel(InputStream is) throws
            IOException, RecognitionException,
            ValidationModelGenerationException, OperatorNotFoundException, OperatorMismatchException {

        if (is == null) {
            throw new IllegalArgumentException("Input parameter is not "
                    + "supposed to be null.");
        }
        return constructValidationModel(new ANTLRInputStream(is));
    }

    public ValidationModel constructValidationModel(String string) throws
            IOException, RecognitionException,
            ValidationModelGenerationException, OperatorNotFoundException, OperatorMismatchException {

        if (string == null) {
            throw new IllegalArgumentException("Input parameter string is not "
                    + "supposed to be null.");
        }
        return constructValidationModel(new ANTLRStringStream(string));
    }

    protected ValidationModel constructValidationModel(CharStream charStream)
            throws RecognitionException, ValidationModelGenerationException, IOException, OperatorNotFoundException, OperatorMismatchException {

        Tree avdTree = getTreeForCharStream(charStream);
        RuleNameSymbolTable ruleNamesSymbolTable = new RuleNameSymbolTable();
        ValidationModel validationModel = new ValidationModel();

        /*
         * Initial avd file names check
         */

        // check atomic rule names for uniqueness
        Tree atomicRulesTree = avdTree.getChild(0);
        for (int i = 0; i < atomicRulesTree.getChildCount(); i++) {

            checkUniqenessAndAddSymbol(ruleNamesSymbolTable,
                    atomicRulesTree.getChild(i),
                    RuleNameSymbolKind.ATOMIC_RULE_NAME);
        }

        // check compound rule names for uniqeness
        Tree compoundRulesTree = avdTree.getChild(1);
        for (int i = 0; i < compoundRulesTree.getChildCount(); i++) {

            checkUniqenessAndAddSymbol(ruleNamesSymbolTable,
                    compoundRulesTree.getChild(i),
                    RuleNameSymbolKind.COMPOUND_RULE_NAME);
        }

        // check that all required validation rules are defined
        Tree validationsTree = avdTree.getChild(2);
        for (int i = 0; i < validationsTree.getChildCount(); i++) {

            checkRuleIsDefined(ruleNamesSymbolTable,
                    validationsTree.getChild(i));
        }

        // check that required analyses exist and add them to the model
        Tree analysesTree = avdTree.getChild(3);
        addAnalysesToModel(analysesTree, validationModel);

        /*
         * Construct the model
         */
        HashMap<String, Rule> definedRules = new HashMap<String, Rule>();

        // generate atomic rules
        for (int i = 0; i < atomicRulesTree.getChildCount(); i++) {
            Tree atomicRuleTree = atomicRulesTree.getChild(i);
            definedRules.put(atomicRuleTree.getText(),
                    atomicRuleGenerator.constructAtomicRule(atomicRuleTree));

        }

        // generate compound rules
        for (int i = 0; i < compoundRulesTree.getChildCount(); i++) {
            Tree compoundRuleTree = atomicRulesTree.getChild(i);
            definedRules.put(compoundRuleTree.getText(),
                    compoundRuleGenerator.constructCompoundRule(
                    compoundRuleTree, definedRules));
        }

        // add required rules to model (others are discarded or referred by
        // subnodes)
        for (int i = 0; i < validationsTree.getChildCount(); i++) {
            String ruleName = validationsTree.getChild(i).getText();
            if (definedRules.containsKey(ruleName)) {
                throw new ValidationModelGenerationException("Object "
                        + "representation for rule '" + ruleName + "' could not"
                        + "be found. Unknown error.");
            }
            validationModel.addRequiredRule(definedRules.get(ruleName));
        }

        return validationModel;
    }

    protected void checkUniqenessAndAddSymbol(
            RuleNameSymbolTable ruleNameSymbolTable, Tree symbolTree,
            RuleNameSymbolKind kind) throws ValidationModelGenerationException {

        String name = symbolTree.getText();

        if (ruleNameSymbolTable.symbolExists(name)) {

            RuleNameSymbolInfo symbolInfo =
                    ruleNameSymbolTable.getSymbolInfo(name);

            throw new ValidationModelGenerationException("Validation name "
                    + name + " already defined. Previous definition found "
                    + "on line " + symbolInfo.getDefinitionLine() + ", "
                    + "column " + symbolInfo.getDefinitionColumn());
        }

        RuleNameSymbolInfo symbolInfo = new RuleNameSymbolInfo();
        symbolInfo.setDefinitionLine(symbolTree.getLine());
        symbolInfo.setDefinitionColumn(symbolTree.getCharPositionInLine());
        symbolInfo.setVariableKind(kind);
        ruleNameSymbolTable.addSymbol(name, symbolInfo);
    }

    protected Tree getTreeForCharStream(CharStream charStream) throws
            RecognitionException {

        ArchvalRulesetGrammarLexer argl =
                new ArchvalRulesetGrammarLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(argl);

        ArchvalRulesetGrammarParser archvalRulesetGrammarParser =
                new ArchvalRulesetGrammarParser(tokens);

        ArchvalRulesetGrammarParser.validation_unit_return validationUnit =
                archvalRulesetGrammarParser.validation_unit();

        return (Tree) validationUnit.getTree();
    }

    protected ValidationModel addAnalysesToModel(Tree analyzeCommandsTree,
            ValidationModel validationModel) throws
            ValidationModelGenerationException {

        for (int i = 0; i < analyzeCommandsTree.getChildCount(); i++) {
            Tree analysisTree = analyzeCommandsTree.getChild(i);
            String text = analyzeCommandsTree.getChild(i).getText();
            AnalysisIface analysis = analysesRegister.getAnalysisByName(text);

            if (analysis == null) {
                throw new ValidationModelGenerationException(
                        "Analysis with " + analysis + " specified on line "
                        + analysisTree.getLine() + " and position "
                        + analysisTree.getCharPositionInLine()
                        + " was not found.");
            }
            validationModel.addRequiredAnalysis(analysis);
        }
        return validationModel;
    }

    protected void checkRuleIsDefined(RuleNameSymbolTable ruleNamesSymbolTable,
            Tree child) throws ValidationModelGenerationException {

        if (!ruleNamesSymbolTable.symbolExists(child.getText())) {

            throw new ValidationModelGenerationException("The validation rule "
                    + "specified as an argument to validate command on line "
                    + child.getLine() + " in column "
                    + child.getCharPositionInLine() + " is not defined.");
        }
    }
}
