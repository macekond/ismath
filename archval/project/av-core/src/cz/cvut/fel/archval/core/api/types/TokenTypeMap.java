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

    // TODO: add all DataType types!
    private TokenTypeMap() {
        types.put("Vertex", DataType.VERTEX);
        types.put("Edge", DataType.EDGE);
        types.put("Number", DataType.NUMBER);
        types.put("Label", DataType.LABEL);
    }

    public static TokenTypeMap getInstance() {
        if (instance == null) {
            instance = new TokenTypeMap();
        }
        return instance;
    }

    public DataType getTokenDataType(Integer tokenNumber) throws
            FileNotFoundException, IOException {

        TokenList tokenList = TokenList.getInstance();
        return getTokenDataType(tokenList.getTokenName(tokenNumber));
    }

    public DataType getTokenDataType(String tokenName) {
        if (types.containsKey(tokenName)) {
            return types.get(tokenName);
        }
        return DataType.UNKNOWN;
    }
}
