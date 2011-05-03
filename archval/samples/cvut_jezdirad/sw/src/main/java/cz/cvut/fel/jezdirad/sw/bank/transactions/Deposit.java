package cz.cvut.fel.jezdirad.sw.bank.transactions;


/**
 *
 * @author Radek Ježdík
 */
public class Deposit extends Transaction {

	public Deposit(int amount, String accountNum) {
		super(amount, accountNum);
	}


	@Override
	public void visit(TransactionVisitor tv) {
		tv.visitDeposit(this);
	}


	@Override
	public Type getType() {
		return Type.DEPOSIT;
	}


	@Override
	public String toString() {
		return getAccountNumber() + ": deposited " + getAmmount();
	}

}
