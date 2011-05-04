package cz.cvut.fel.archval.avdhl;

import org.netbeans.api.lexer.TokenId;

/**
 *
 * @author martin
 */
public class AvdTokenId implements TokenId {

    private final String name;
    private final String primaryCategory;
    private final int id;

    public AvdTokenId(String name, String primaryCategory, int id) {
        this.name = name;
        this.primaryCategory = primaryCategory;
        this.id = id;
    }

    public String name() {
        return name;
    }

    public int ordinal() {
        return id;
    }

    public String primaryCategory() {
        return primaryCategory;
    }
}
