package cz.cvut.fel.jezdirad.sw.bank.transactions;


/**
 *
 * @author Radek Ježdík
 */
public class OutboundTransfer extends Transfer {

	public OutboundTransfer(int amount, String accountNum, String associatedAccountNum) {
		super(amount, accountNum, associatedAccountNum);
	}


	@Override
	public void visit(TransactionVisitor tv) {
		tv.visitOutboundTransfer(this);
	}


	@Override
	public Type getType() {
		return Type.OUTBOUND_TRANSFER;
	}


	@Override
	public String toString() {
		return getAccountNumber() + ": transferred " + getAmmount() + " to " + getAssociatedAccountNumber();
	}

}
