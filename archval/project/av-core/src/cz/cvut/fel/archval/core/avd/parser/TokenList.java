package cz.cvut.fel.archval.core.avd.parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Reads token table from *.token file produced by ANTLR. Provides translation
 * function, which returns token name for number.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class TokenList {

    private HashMap<Integer, String> tokens;
    private static TokenList instance;

    private TokenList() {
        tokens = null;
    }

    /**
     * Singleton implementation.
     *
     * @return instance of TokenList class
     */
    public static TokenList getInstance() {
        if (instance == null) {
            instance = new TokenList();
        }
        return instance;        
    }

    /**
     * Returns string name of the token (e.g. 'Label' or 'Name') which belongs to specified number.
     *
     * @param tokenId id of the token (produced for example by antlr generated parser)
     * @return name of the token identified by specified id or null if no such token was found
     * @throws FileNotFoundException if the file with the tokens couldn't be found
     * @throws IOException if there was error reading the file
     */
    public String getTokenName(Integer tokenId) throws FileNotFoundException, IOException {
        if (tokens == null) {
            tokens = new HashMap<Integer, String>();
            readTokenList();
        }
        return tokens.get(tokenId);
    }

    private void readTokenList() throws FileNotFoundException, IOException {
        InputStream is =
                TokenList.class.getResourceAsStream(
                "ArchvalRulesetGrammar.tokens");
        if (is == null) {
            throw new FileNotFoundException("Token file not found!");
        }
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(is));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            String[] splLine = line.split("=");
            if (splLine.length != 2) {
                continue;
            }
            Integer tokenId;
            try {
                tokenId = Integer.parseInt(splLine[1]);
            } catch (NumberFormatException numberFormatException) {
                continue;
            }
            tokens.put(tokenId, splLine[0]);
        }
    }
}
