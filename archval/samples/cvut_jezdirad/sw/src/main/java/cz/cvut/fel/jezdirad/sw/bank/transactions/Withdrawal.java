package cz.cvut.fel.jezdirad.sw.bank.transactions;


/**
 * 
 * @author Radek Ježdík
 */
public class Withdrawal extends Transaction {

	public Withdrawal(int amount, String accountNum) {
		super(amount, accountNum);
	}


	@Override
	public void visit(TransactionVisitor tv) {
		tv.visitWithdrawal(this);
	}


	@Override
	public Type getType() {
		return Type.WITHDRAWAL;
	}


	@Override
	public String toString() {
		return getAccountNumber() + ": withdrew " + getAmmount();
	}

}
