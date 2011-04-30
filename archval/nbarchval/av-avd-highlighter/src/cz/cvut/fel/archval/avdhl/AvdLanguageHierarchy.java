package cz.cvut.fel.archval.avdhl;

import cz.cvut.fel.archval.avdhl.utils.ANTLRTokenReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.api.lexer.Language;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author martin
 */
class AvdLanguageHierarchy extends LanguageHierarchy<AvdTokenId> {

    private static List<AvdTokenId> tokens;
    private static Map<Integer, AvdTokenId> idToToken;
    private static final Language<AvdTokenId> language = new AvdLanguageHierarchy().language();

    @Override
    protected Collection<AvdTokenId> createTokenIds() {
        if (tokens == null) {
            init();
        }
        return tokens;
    }

    @Override
    protected Lexer<AvdTokenId> createLexer(LexerRestartInfo<AvdTokenId> info) {
        return new AvdEditorLexer(info);
    }

    @Override
    protected String mimeType() {
        return "text/x-avd";
    }

    public static Language<AvdTokenId> getLanguage() {
        return language;
    }

    /**
     * Initializes the list of tokens with IDs generated from the ANTLR
     * token file.
     */
    private static void init() {
        ANTLRTokenReader reader = new ANTLRTokenReader();
        tokens = reader.readTokenFile();
        idToToken = new HashMap<Integer, AvdTokenId>();
        for (AvdTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    /**
     * Returns an actual CMinusTokenId from an id. This essentially allows
     * the syntax highlighter to decide the color of specific words.
     * @param id
     * @return
     */
    static synchronized AvdTokenId getToken(int id) {
        if (idToToken == null) {
            init();
        }
        return idToToken.get(id);
    }
}
