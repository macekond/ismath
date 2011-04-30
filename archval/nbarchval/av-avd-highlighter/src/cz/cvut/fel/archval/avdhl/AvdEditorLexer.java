package cz.cvut.fel.archval.avdhl;

import cz.cvut.fel.archval.avdhl.utils.AntlrCharStream;
import cz.cvut.fel.archval.ruleset_parser.antlr.ArchvalRulesetGrammarLexer;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author martin
 */
class AvdEditorLexer implements Lexer<AvdTokenId> {

    private LexerRestartInfo<AvdTokenId> info;
    private ArchvalRulesetGrammarLexer lexer;

    public AvdEditorLexer(LexerRestartInfo<AvdTokenId> info) {
        this.info = info;
        AntlrCharStream charStream = new AntlrCharStream(info.input(), "AvdEditor", false);
        lexer = new ArchvalRulesetGrammarLexer(charStream);
    }

    @Override
    public Token<AvdTokenId> nextToken() {
        org.antlr.runtime.Token token = lexer.nextToken();
        Token<AvdTokenId> createdToken = null;
        if (token.getType() != -1) {
            AvdTokenId tokenId = AvdLanguageHierarchy.getToken(token.getType());
            createdToken = info.tokenFactory().createToken(tokenId);
        } else if (info.input().readLength() > 0) {
            AvdTokenId tokenId = AvdLanguageHierarchy.getToken(ArchvalRulesetGrammarLexer.WS);
            createdToken = info.tokenFactory().createToken(tokenId);
        }
        return createdToken;
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
    }
}
