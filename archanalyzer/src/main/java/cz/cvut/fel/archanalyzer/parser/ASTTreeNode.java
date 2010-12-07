/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fel.archanalyzer.parser;

/**
 *
 * @author martin
 */
public class ASTTreeNode extends SimpleNode {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ASTTreeNode(int i) {
        super(i);
        name = "";
    }

    @Override
    public String toString() {
        return super.toString() + " (" + name + ")";
    }

}
