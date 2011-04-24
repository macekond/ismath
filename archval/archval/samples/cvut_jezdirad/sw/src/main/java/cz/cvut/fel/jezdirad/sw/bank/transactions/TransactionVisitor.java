
package cz.cvut.fel.jezdirad.sw.bank.transactions;


/**
 * Visitor for transactions
 * @author Radek Ježdík
 */
public interface TransactionVisitor {

	void visitDeposit(Deposit d);


	void visitWithdrawal(Withdrawal w);


	void visitInboundTransfer(Transfer t);


	void visitOutboundTransfer(Transfer t);

}
