package cz.cvut.fel.archval.avdhl.utils;

import cz.cvut.fel.archval.avdhl.AvdTokenId;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.openide.util.Exceptions;

/**
 *
 * @author James Reid
 */
public class ANTLRTokenReader {

    private HashMap<String, String> tokenTypes = new HashMap<String, String>();
    private ArrayList<AvdTokenId> tokens = new ArrayList<AvdTokenId>();

    public ANTLRTokenReader() {
        init();
    }

    /**
     * Initializes the map to include any keywords in the Hop Programming language.
     */
    private void init() {

        tokenTypes.put("COMPOUND_RULE_KW", "keyword");
        tokenTypes.put("ANALYZE_KW", "keyword");
        tokenTypes.put("ATOMIC_RULE_KW", "keyword");
        tokenTypes.put("VALIDATE_KW", "keyword");

        tokenTypes.put("VertexSet", "setid");
        tokenTypes.put("EdgeSet", "setid");
        tokenTypes.put("Vertex", "elemid");
        tokenTypes.put("Edge", "elemid");

        tokenTypes.put("RBRACE", "separator");
        tokenTypes.put("LBRACE", "separator");
        tokenTypes.put("LPAREN", "separator");
        tokenTypes.put("RPARENCOLON", "separator");
        tokenTypes.put("SEMICOLON", "separator");
        tokenTypes.put("COMMA", "separator");

        tokenTypes.put("NOT", "oper");
        tokenTypes.put("AND", "oper");
        tokenTypes.put("UNION", "oper");
        tokenTypes.put("INTERSECT", "oper");
        tokenTypes.put("IN", "oper");
        tokenTypes.put("ALL", "oper");
        tokenTypes.put("OR", "oper");
        tokenTypes.put("EXISTS", "oper");
        tokenTypes.put("SETMINUS", "oper");

        tokenTypes.put("Number", "number");
        tokenTypes.put("False", "boolvalue");
        tokenTypes.put("True", "boolvalue");
        tokenTypes.put("Name", "identifier");
        tokenTypes.put("Label", "string");
    }

    /**
     * Reads the token file from the ANTLR parser and generates
     * appropriate tokens.
     *
     * @return
     */
    public List<AvdTokenId> readTokenFile() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inp = classLoader.getResourceAsStream(
                "cz/cvut/fel/archval/avdhl/utils/ArchvalRulesetGrammar.tokens");
        if (inp == null) {
            throw new IllegalStateException("Important file with antlr tokens"
                    + "was not found. Please fix the problem by adding "
                    + "cz/cvut/fel/archval/avdhl/utils/"
                    + "ArchvalRulesetGrammar.tokens file to the right directory"
                    + " (or fix broken symbolic link).");
        }
        BufferedReader input = new BufferedReader(new InputStreamReader(inp));
        readTokenFile(input);
        return tokens;
    }

    /**
     * Reads in the token file.
     *
     * @param buff
     */
    private void readTokenFile(BufferedReader buff) {
        String line = null;
        try {
            while ((line = buff.readLine()) != null) {
                String[] splLine = line.split("=");
                String name = splLine[0];
                int tok = Integer.parseInt(splLine[1].trim());
                AvdTokenId id;
                String tokenCategory = tokenTypes.get(name);
                if (tokenCategory != null) {
                    //if the value exists, put it in the correct category
                    id = new AvdTokenId(name, tokenCategory, tok);
                } else {
                    //if we don't recognize the token, consider it to a separator
                    id = new AvdTokenId(name, "separator", tok);
                }
                //add it into the vector of tokens
                tokens.add(id);
            }
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
