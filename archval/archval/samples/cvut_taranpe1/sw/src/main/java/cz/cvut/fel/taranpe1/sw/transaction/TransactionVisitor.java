/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.cvut.fel.taranpe1.sw.transaction;

/**
 *
 * @author Petr
 */
public interface TransactionVisitor {
    void visitDeposit(Deposit d);
    void visitWithdrawal(Withdrawal w);
    void visitInboundTransfer(Transfer t);
    void visitOutboundTransfer(Transfer t);
}
