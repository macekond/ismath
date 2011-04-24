/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fel.taranpe1.sw.transaction;

import cz.cvut.fel.taranpe1.sw.list.TransactionIterator;

/**
 *
 * @author Petr
 */
public class Visitor implements TransactionVisitor {

    public void visitDeposit(Deposit d) {
        System.out.println("\nAll Deposits in Bank:");
        TransactionIterator itr = (TransactionIterator) d.getList().first();
        for (; itr.isValid(); itr.next()) {
            System.out.print(itr.retrieve() + ", ");
        }
    }

    public void visitWithdrawal(Withdrawal w) {
        System.out.println("\nAll WithDrawal in Bank:");
        TransactionIterator itr = (TransactionIterator) w.getList().first();
        for (; itr.isValid(); itr.next()) {
            System.out.print(itr.retrieve() + ", ");
        }
    }

    public void visitInboundTransfer(Transfer t) {
        System.out.println("\nAll InboundTransfer in Bank:");
        TransactionIterator itr = (TransactionIterator) t.getList().first();
        for (; itr.isValid(); itr.next()) {
            ITransaction trans = (ITransaction) itr.retrieve();
            if (trans.getType().equals(TransactionType.INBOUNDTRANSFERS)) {
                System.out.print(itr.retrieve() + ", ");
            }
        }
    }

    public void visitOutboundTransfer(Transfer t) {
        System.out.println("\nAll OutboundTransfer in Bank:");
        TransactionIterator itr = (TransactionIterator) t.getList().first();
        for (; itr.isValid(); itr.next()) {
            ITransaction trans = (ITransaction) itr.retrieve();
            if (trans.getType().equals(TransactionType.OUTBOUNDTRANSFERS)) {
                System.out.print(itr.retrieve() + ", ");
            }
        }
    }
}
