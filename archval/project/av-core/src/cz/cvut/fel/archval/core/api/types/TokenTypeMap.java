package cz.cvut.fel.archval.core.api.types;

import cz.cvut.fel.archval.core.avd.parser.TokenList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/**
 * Singleton class used to map token types to DataType enum.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class TokenTypeMap {

    private static TokenTypeMap instance;
    HashMap<String, DataType> types = new HashMap<String, DataType>();

    private TokenTypeMap() {
        types.put("Vertex", DataType.VERTEX);
        types.put("Edge", DataType.EDGE);
        types.put("Number", DataType.NUMBER);
        types.put("Label", DataType.LABEL);
        types.put("True", DataType.BOOLEAN);
        types.put("False", DataType.BOOLEAN);
    }

    /**
     * Singleton implementation.
     *
     * @return instance of TokenTypeMap class
     */
    public static TokenTypeMap getInstance() {
        if (instance == null) {
            instance = new TokenTypeMap();
        }
        return instance;
    }

    /**
     * Returns DataType represented by number or DataType.UNKNOWN if it can't be
     * mapped.
     *
     * @param tokenNumber number of the token in *.toknes file produced by antlr
     * @return DataType enum memeber
     * @throws FileNotFoundException if *.tokens file couldn't be found
     * @throws IOException if *.tokens file couldn't be read
     */
    public DataType getTokenDataType(Integer tokenNumber) throws
            FileNotFoundException, IOException {

        TokenList tokenList = TokenList.getInstance();
        return getTokenDataType(tokenList.getTokenName(tokenNumber));
    }

    /**
     * Returns DataType represented by string or DataType.UNKNOWN if it can't be
     * mapped.
     *
     * @param tokenName name of the token
     * @return DataType enum memeber
     * @throws FileNotFoundException if *.tokens file couldn't be found
     * @throws IOException if *.tokens file couldn't be read
     */
    public DataType getTokenDataType(String tokenName) {
        if (types.containsKey(tokenName)) {
            return types.get(tokenName);
        }
        return DataType.UNKNOWN;
    }
}
