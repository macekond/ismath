package cz.cvut.fel.jezdirad.sw.bank.transactions;


/**
 * Abstract class for all transfer transactions
 * @author Radek Ježdík
 */
public abstract class Transfer extends Transaction {

	private final String associatedAccountNumber;

	public Transfer(int amount, String accountNum, String associatedAccountNum) {
		super(amount, accountNum);
		associatedAccountNumber = associatedAccountNum;
	}

	/**
	 * Returns number of the associated account of this transfer transaction
	 * @return
	 */
	public String getAssociatedAccountNumber() {
		return associatedAccountNumber;
	}

}
