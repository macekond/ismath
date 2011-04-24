package cz.cvut.fel.jezdirad.sw.bank;

import java.util.HashMap;
import java.util.Map;


/**
 * Bank class
 * @author Radek Ježdík
 */
public class Bank {

	/** Singleton instance */
	private static Bank instance;

	/** Stores all accounts created (account number as a key) */
	private Map<String, Account> accounts = new HashMap<String, Account>();


	/** Private constructor */
	private Bank() {
		// private constructor
	}


	/**
	 * Returns Bank instance (Singleton)
	 * @return
	 */
	public static Bank getBank() {
		if(instance == null) {
			synchronized(Bank.class) {
				if(instance == null) {
					instance = new Bank();
				}
			}
		}
		return instance;
	}


	/**
	 * Creates a new bank account
	 * @return
	 */
	public Account createAccount() {
		String number = generateAccountNumber();

		Account account = new Account(number);
		accounts.put(number, account);

		return account;
	}


	/**
	 * Generates new account number
	 * @return
	 */
	private String generateAccountNumber() {
		String num = "000000";
		String count = (accounts.size() + 1) + "";
		if(count.length() > 6) {
			throw new IllegalStateException("Maximum number of accounts was reached");
		}
		num = num.substring(0, num.length() - count.length()) + count;
		return num;
	}


	/**
	 * Searches for account by its number, returns null if not found
	 * @param number
	 * @return
	 */
	public Account lookupAccount(String number) {
		return accounts.get(number);
	}


	/**
	 * Searches for account by its number, throws exception if not found
	 * @param number
	 * @return
	 * @throws Exception thrown if account does not exist
	 */
	private Account lookupAccountWithException(String number) throws Exception {
		Account ac = lookupAccount(number);
		if(ac == null) {
			throw new Exception("Account " + number + " doesn't exist");
		}

		return ac;
	}


	/**********************************************************/
	/********************* FACADE METHODS *********************/
	/*

	 */
	/**
	 * Deposits money to account of <i>number</i> account number
	 * @param account account number
	 * @param howMuch ammount of money to deposit
	 * @throws Exception when account not found
	 * @throws AccountException if transaction fails
	 */
	public void deposit(String account, int howMuch) throws Exception, AccountException {
		Account ac = lookupAccountWithException(account);
		ac.deposit(howMuch);
	}


	/**
	 * Withdraws money from account of <i>number</i> account number
	 * @param account account number
	 * @param howMuch ammount of money to withdraw
	 * @throws Exception when account not found
	 * @throws AccountException if transaction fails
	 */
	public void withdraw(String account, int howMuch) throws Exception, AccountException {
		Account ac = lookupAccountWithException(account);
		ac.withdraw(howMuch);
	}


	/**
	 * Transfers money from <i>number</i> account number to <i>to</i> account number
	 * @param from account number which transfer the money from
	 * @param to account number which transfer the money to
	 * @param howMuch ammount of money to transfer
	 * @throws Exception when account not found
	 * @throws AccountException if transaction fails
	 */
	public void transfer(String from, String to, int howMuch) throws Exception, AccountException {
		Account ac1 = lookupAccountWithException(from);
		Account ac2 = lookupAccountWithException(to);
		ac1.transfer(howMuch, ac2);
	}


	/**
	 * Closes the account
	 * @param account account number
	 * @throws Exception when account not found
	 */
	public void closeAccount(String account) throws Exception {
		Account ac = lookupAccountWithException(account);
		ac.closeAccount();
	}


	/**
	 * Returns account balance
	 * @param account account number
	 * @return
	 * @throws Exception when account not found
	 */
	public int getAccountBalance(String account) throws Exception {
		Account ac = lookupAccountWithException(account);
		return ac.getBalance();
	}

}
