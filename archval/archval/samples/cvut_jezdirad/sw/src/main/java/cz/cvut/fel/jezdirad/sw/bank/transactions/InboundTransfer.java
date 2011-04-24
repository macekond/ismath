package cz.cvut.fel.jezdirad.sw.bank.transactions;


/**
 *
 * @author Radek Ježdík
 */
public class InboundTransfer extends Transfer {

	public InboundTransfer(int amount, String accountNum, String associatedAccountNum) {
		super(amount, accountNum, associatedAccountNum);
	}


	@Override
	public void visit(TransactionVisitor tv) {
		tv.visitInboundTransfer(this);
	}


	@Override
	public Type getType() {
		return Type.INBOUND_TRANSFER;
	}


	@Override
	public String toString() {
		return getAccountNumber() + ": received " + getAmmount() + " from " + getAssociatedAccountNumber();
	}

}
