package cz.cvut.fel.archval.core.valgen.symbol;

import java.util.HashMap;

/**
 * Symbol table holding information about symbols used in the avd file.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class RuleNameSymbolTable {

    private HashMap<String, RuleNameSymbolInfo> symbols;

    public RuleNameSymbolTable() {
        symbols = new HashMap<String, RuleNameSymbolInfo>();
    }

    /**
     * Returns true if symbol is already in the table.
     *
     * @param symbolName
     * @return
     */
    public boolean symbolExists(String symbolName) {
        return symbols.containsKey(symbolName);
    }

    /**
     * Adds new symbol to the table. If the table already contains symbol with
     * this name, nothing is added.
     *
     * @param symbolName name of the symbol to be added to the table
     * @param symbolInfo symbol information (type, position)
     */
    public void addSymbol(String symbolName, RuleNameSymbolInfo symbolInfo) {
        if (symbolExists(symbolName)) {
            return;
        }
        symbols.put(symbolName, symbolInfo);
    }

    /**
     * Returns symbol information for name specified as parameter. If the symbol
     * is not found, null is returned.
     *
     * @param symbolName name of the symbol to be found
     * @return symbol information object or null if symbol was not found
     */
    public RuleNameSymbolInfo getSymbolInfo(String symbolName) {
        return symbols.get(symbolName);
    }
}
