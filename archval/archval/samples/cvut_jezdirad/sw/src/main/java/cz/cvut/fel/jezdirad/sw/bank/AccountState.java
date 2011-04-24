package cz.cvut.fel.jezdirad.sw.bank;


/**
 * Abstract account state class
 * @author Radek Ježdík
 */
abstract class AccountState {

	/** Account balance (remaining money) */
	private int balance;


	public AccountState(int balance) {
		this.balance = balance;
	}


	/**
	 * Adds money to the account balance
	 * @param ammount ammount of money to add to the balance
	 */
	protected void increaseBalance(int ammount) {
		balance += ammount;
	}


	/**
	 * Removes money from the account balance
	 * @param ammount ammount of money to remove from the balance
	 * @throws AccountException if balance would be smaller than minimum account balance after the operation
	 */
	protected void decreaseBalance(int ammount) throws AccountException {
		if(balance - ammount < Account.MIN_BALANCE) {
			throw new AccountException("Attempt to go under minimum account balance (balance: " + getBalance() + ", tried to take: " + ammount + ")");
		}
		balance -= ammount;
	}


	public final int getBalance() {
		return balance;
	}


	/**
	 * Deposits money to the account
	 * @param howMuch ammount of money
	 * @throws AccountException
	 */
	abstract void deposit(int howMuch) throws AccountException;


	/**
	 * Withdraws money from the account
	 * @param howMuch ammount of money
	 * @throws AccountException
	 */
	abstract void withdraw(int howMuch) throws AccountException;


	/**
	 * Transfers money to another account
	 * @param howMuch ammount of money
	 * @param from account which to transfer money from
	 * @param target target account
	 * @throws AccountException
	 */
	abstract void transfer(int howMuch, Account from, Account target) throws AccountException;


	/**
	 * Receives money from another account
	 * @param howMuch ammount of money
	 * @param from account which to sent the money
	 * @throws AccountException
	 */
	abstract void receive(int howMuch, Account from) throws AccountException;

}
