package cz.cvut.fel.jezdirad.sw.bank.transactions;

import java.util.Date;


/**
 * Abstract superclass of all transaction classes
 * @author Radek Ježdík
 */
public abstract class Transaction {

	public enum Type {

		DEPOSIT,
		WITHDRAWAL,
		OUTBOUND_TRANSFER,
		INBOUND_TRANSFER

	}

	/** ammount of money of this transaction */
	private final int ammount;

	/** date and time when the transaction was made */
	private final Date dateTime;

	/** account number */
	private final String accountNumber;


	public Transaction(int ammount, String accountNum) {
		this.ammount = ammount;
		this.dateTime = new Date();
		this.accountNumber = accountNum;
	}


	/**
	 * Returns ammount of money of this transaction
	 * @return
	 */
	public int getAmmount() {
		return ammount;
	}


	/**
	 * Returns date and time when the transaction was made
	 * @return
	 */
	public Date getDateTime() {
		return new Date(dateTime.getTime());
	}


	/**
	 * Returns account number where transaction was made
	 * @return
	 */
	public String getAccountNumber() {
		return accountNumber;
	}


	/**
	 * Visit method for TransactionVisitior
	 * @param tv
	 */
	abstract public void visit(TransactionVisitor tv);


	/**
	 * Returns type of the transaction
	 * @return
	 */
	abstract public Type getType();

}
