package cz.cvut.fel.archval.core.valgen;

import java.util.HashMap;

/**
 * Symbol table holding information about symbols used in the avd file.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class SymbolTable {

    private HashMap<String, SymbolInfo> symbols;

    /**
     * Returns true if symbol is already in the table.
     *
     * @param symbolName
     * @return
     */
    public boolean symbolExists(String symbolName) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * Adds new symbol to the table. If the table already contains symbol with
     * this name, exception is thrown.
     *
     * @param symbolName name of the symbol to be added to the table
     * @param symbolInfo symbol information (type, position)
     */
    public void addSymbol(String symbolName, SymbolInfo symbolInfo) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * Returns symbol information for name specified as parameter. If the symbol
     * is not found, null is returned.
     *
     * @param symbolName name of the symbol to be found
     * @return symbol information object or null if symbol was not found
     */
    public SymbolInfo getSymbolInfo(String symbolName) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

}
