/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.cvut.fel.archanalyzer.gui;

import cz.cvut.fel.archanalyzer.parser.Node;
import java.util.Vector;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author martin
 */
public class ASTTreeModel implements TreeModel {

    private Node root;
    private Vector<TreeModelListener> treeModelListeners = new Vector<TreeModelListener>();

    public ASTTreeModel(Node root) {
        this.root = root;
    }

    @Override
    public Object getRoot() {
        return root;
    }

    @Override
    public Object getChild(Object parent, int index) {
        return ((Node) parent).jjtGetChild(index);
    }

    @Override
    public int getChildCount(Object parent) {
        return ((Node) parent).jjtGetNumChildren();
    }

    @Override
    public boolean isLeaf(Object node) {
        return ((Node) node).jjtGetNumChildren() == 0;
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        // not used by this model
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        for (int i = 0; i < getChildCount(parent); i++) {
            Node node = ((Node) parent).jjtGetChild(i);
            if (node == child) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        treeModelListeners.addElement(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        treeModelListeners.removeElement(l);
    }

}
