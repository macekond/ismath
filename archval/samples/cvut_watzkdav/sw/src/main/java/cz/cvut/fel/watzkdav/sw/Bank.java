package cz.cvut.fel.watzkdav.sw;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class Bank {
	public static final int MIN_AMOUNT = 1000;
	private static final Bank bank = new Bank();
	private int nextAccountNumber;
	private long nextTransactionId;
	private List<Account> accounts;

	// private protože singleton; provádí incializaci
	private Bank() {
		nextAccountNumber = 0;
		nextTransactionId = 0L;
		accounts = new ArrayList<Account>();
	}

	// vrátí pointer na Bank, pokaždé stejný
	public final static Bank getBank() {
		return bank;
	}

	// vrátí ID další transakce
	synchronized public long getTransactionId() {
		return nextTransactionId++;
	}

	// vytvoří a vrátí nový účet
	public Account createAccount() {
		Account account = new Account(nextAccountNumber++);
		accounts.add(account);

		return account;
	}

	// vyhledá a vrátí účet dle jeho čísla
	public Account lookupAccount(String number) throws AccountException {
		Iterator<Account> it = accounts.iterator();

		while (it.hasNext()) {
			Account account = it.next();

			if (account.getNumber().equals(number))
				return account;
		}

		throw new AccountException("Account #"+number+" doesn't exist!");
	}

	//vloží peníze na účet
	public void deposit(Account account, int howMuch) {
		if (account != null)
			account.deposit(howMuch);
	}

	//vybere peníze u účtu
	public void withdraw(Account account, int howMuch) {
		if (account != null)
			account.withdraw(howMuch);
	}

	//převede peníze na jiný účet
	public void transfer(Account source, Account target, int howMuch) {
		if (source != null)
			source.transfer(howMuch, target);
	}
}
