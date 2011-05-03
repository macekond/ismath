package cz.cvut.fel.jezdirad.sw.bank;

import cz.cvut.fel.jezdirad.sw.bank.transactions.Deposit;
import cz.cvut.fel.jezdirad.sw.bank.transactions.InboundTransfer;
import cz.cvut.fel.jezdirad.sw.bank.transactions.OutboundTransfer;
import cz.cvut.fel.jezdirad.sw.bank.transactions.Transaction;
import cz.cvut.fel.jezdirad.sw.bank.transactions.TransactionType;
import cz.cvut.fel.jezdirad.sw.bank.transactions.TransactionVisitor;
import cz.cvut.fel.jezdirad.sw.bank.transactions.Withdrawal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;


/**
 * Account class
 * @author Radek Ježdík
 */
public class Account extends Observable {

	/** Minimal balance of the account for all outbound transactions */
	static final int MIN_BALANCE = 1000;

	/** Account number */
	private final String number;

	/** Account state */
	private AccountState account;

	/** List of transactions made on this account */
	private final List<Transaction> transactions = new ArrayList<Transaction>();


	/**
	 * Creates new account
	 * @param number account number
	 */
	protected Account(String number) {
		this.number = number;
		this.account = new BelowMinAccountState(0);
	}


	/**
	 * Adds money to account
	 * @param howMuch how much money to deposit
	 * @throws AccountException if transaction fails
	 */
	public void deposit(int howMuch) throws AccountException {
		if(howMuch <= 0) {
			throw new IllegalArgumentException("Ammount of money cannot be zero or less");
		}
		try {
			account.deposit(howMuch);

			Transaction t = new Deposit(howMuch, getNumber());
			newTransaction(t);
		} catch(AccountException e) {
			throw new AccountException(number + ": " + e.getMessage());
		}
	}


	/**
	 * Withdraws money from account
	 * @param howMuch how much money to withdraw
	 * @throws AccountException if transaction fails
	 */
	public void withdraw(int howMuch) throws AccountException {
		if(howMuch <= 0) {
			throw new IllegalArgumentException("Ammount of money cannot be zero or less");
		}
		try {
			account.withdraw(howMuch);

			Transaction t = new Withdrawal(howMuch, getNumber());
			newTransaction(t);
		} catch(AccountException e) {
			throw new AccountException(number + ": " + e.getMessage());
		}
	}


	/**
	 * Transfers money from one account to another
	 * @param howMuch how much money to transfer
	 * @param target target account to tranfer the money
	 * @throws AccountException if transaction fails
	 */
	public void transfer(int howMuch, Account target) throws AccountException {
		if(this == target || this.getNumber().equals(target.getNumber())) {
			throw new AccountException("Transferring money from the same account as the target account");
		}
		if(howMuch <= 0) {
			throw new IllegalArgumentException("Ammount of money cannot be zero or less");
		}
		try {
			account.transfer(howMuch, this, target);

			Transaction t = new OutboundTransfer(howMuch, getNumber(), target.getNumber());
			newTransaction(t);
		} catch(AccountException e) {
			throw new AccountException(number + ": " + e.getMessage());
		}
	}


	/**
	 * Receives money from another account
	 * @param howMuch money received
	 * @param from account which sent the money
	 * @throws AccountException if transaction fails
	 */
	protected void receive(int howMuch, Account from) throws AccountException {
		try {
			account.receive(howMuch, from);

			Transaction t = new InboundTransfer(howMuch, getNumber(), from.getNumber());
			newTransaction(t);
		} catch(AccountException e) {
			throw new AccountException(number + ": " + e.getMessage());
		}
	}


	/**
	 * Notifies all observers with new transaction, adds it to the list of transactions, and checks account state
	 * @param transaction transaction which was made
	 */
	private void newTransaction(Transaction transaction) {
		transactions.add(transaction);

		checkState();
		setChanged();	// the Observable method
		notifyObservers(transaction);
	}


	/**
	 * Checks account balance. Changes account state if certain conditions are met
	 */
	private void checkState() {
		assert !(account instanceof ClosedAccountState);

		int balance = account.getBalance();
		if(balance >= MIN_BALANCE && !(account instanceof NormalAccountState)) {
			account = new NormalAccountState(balance);
		}
	}


	/**
	 * Returns account number
	 * @return
	 */
	public String getNumber() {
		return number;
	}


	/**
	 * Returns remaining money (balance)
	 * @return
	 */
	public int getBalance() {
		return account.getBalance();
	}


	/**
	 * Closes the account disabling all operations
	 */
	public void closeAccount() {
		account = new ClosedAccountState(account.getBalance());
	}


	/**
	 * Visits all transactions made
	 * @param tv visitor
	 */
	public void visitTransactions(TransactionVisitor tv) {
		TransactionIterator iterator = iterator(TransactionType.ALL, 0);
		while(iterator.hasNext()) {
			iterator.next().visit(tv);
		}
	}


	/**
	 * Returns iterator over transactions which were made and which meet the criteria
	 * @param type type of transaction to iterate over
	 * @param minAmount minimum amount of money of
	 * @return
	 */
	public TransactionIterator iterator(TransactionType type, int minAmount) {
		return new TransactionIterator(type, minAmount);
	}


	@Override
	public String toString() {
		return "Account(num=" + number + ",balance=" + account.getBalance() + ")";
	}


	/**
	 * TransactionIterator iterates over selected transactions of the account
	 */
	public class TransactionIterator implements Iterator<Transaction> {

		/** the type of transactions to iterate over */
		private final TransactionType transactionType;

		/** the minimum money ammount of transactions to iterate over */
		private final int minAmount;

		/** index of next transaction to return */
		private int index = 0;


		private TransactionIterator(TransactionType transactionType, int minAmount) {
			this.transactionType = transactionType;
			this.minAmount = minAmount;
		}


		/**
		 * Returns true if there is another transaction which meets the criteria
		 * @return
		 */
		public boolean hasNext() {
			for(; index < transactions.size(); index++) {
				Transaction tr = transactions.get(index);
				if(tr.getAmmount() < minAmount) {
					continue;
				}
				if(transactionType == TransactionType.ALL || tr.getType() == transactionType.getType()) {
					return true;
				}
			}
			return false;
		}


		/**
		 * Returns next transaction, returns null when none has left
		 * @return
		 */
		public Transaction next() {
			return (index < transactions.size() ? transactions.get(index++) : null);
		}


		/**
		 * Removal not allowed
		 */
		public void remove() {
			throw new UnsupportedOperationException("Removal not allowed.");
		}

	}

}
