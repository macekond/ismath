/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.cvut.fel.archanalyzer.parser;

/**
 *
 * @author martin
 */
public class JJTreeIterator {

    public void iterate(Node n, int level) {
            ((SimpleNode) n).dump("");
        /*
        System.out.println("Level: " + level++ + " Node: " + n.toString());
        for (int i = 0; i < n.jjtGetNumChildren(); i++) {
            iterate(n.jjtGetChild(i), level);
        } */
    }

}
