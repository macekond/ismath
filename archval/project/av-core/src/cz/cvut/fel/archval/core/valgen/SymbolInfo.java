
package cz.cvut.fel.archval.core.valgen;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class SymbolInfo {

    private SymbolKind variableKind;
    private int definitionLine;
    private int definitionColumn;

    public int getDefinitionColumn() {
        return definitionColumn;
    }

    public void setDefinitionColumn(int definitionColumn) {
        this.definitionColumn = definitionColumn;
    }

    public int getDefinitionLine() {
        return definitionLine;
    }

    public void setDefinitionLine(int definitionLine) {
        this.definitionLine = definitionLine;
    }

    public SymbolKind getVariableKind() {
        return variableKind;
    }

    public void setVariableKind(SymbolKind variableKind) {
        this.variableKind = variableKind;
    }
}
