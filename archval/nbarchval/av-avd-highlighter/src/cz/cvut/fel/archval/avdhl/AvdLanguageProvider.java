package cz.cvut.fel.archval.avdhl;

import org.netbeans.api.lexer.InputAttributes;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.LanguagePath;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.LanguageEmbedding;
import org.netbeans.spi.lexer.LanguageProvider;

/**
 *
 * @author martin
 */
@org.openide.util.lookup.ServiceProvider(service=org.netbeans.spi.lexer.LanguageProvider.class)
public class AvdLanguageProvider extends LanguageProvider {

    @Override
    public Language<?> findLanguage(String mimeType) {
        if ("text/x-avd".equals(mimeType)) {
            return new AvdLanguageHierarchy().language();
        }
        return null;
    }

    @Override
    public LanguageEmbedding<?> findLanguageEmbedding(Token<?> token, LanguagePath languagePath, InputAttributes inputAttributes) {
        return null;
    }
}
