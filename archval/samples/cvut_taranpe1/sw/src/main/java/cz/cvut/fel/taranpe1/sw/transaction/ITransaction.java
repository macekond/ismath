/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fel.taranpe1.sw.transaction;


/**
 *
 * @author Petr
 */
public interface ITransaction {

    public void visitTransactions(TransactionVisitor visitor);

    public int getAmount();

    public TransactionType getType();
    
}
