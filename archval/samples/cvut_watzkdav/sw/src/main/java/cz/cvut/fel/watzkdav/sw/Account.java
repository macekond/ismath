package cz.cvut.fel.watzkdav.sw;

import java.util.Arrays;
import java.util.Observable;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class AccountException extends RuntimeException {
	private final Transaction failedTransaction;

	public AccountException(Transaction failedTransaction, String message) {
		super(message);
		this.failedTransaction = failedTransaction;
	}

	public AccountException(String message) {
		this(null, message);
	}

	// může být null, pokud výjimka nesouvisí s transakcí
	public Transaction getFailedTransaction() {
		return failedTransaction;
	}
}

class Account extends Observable {
	private final String number;
	private int balance;
	private State state;
	// seznam transakcí
	private final List<Transaction> transactions;

	// n je číslo účtu
	public Account(Integer n) {
		number = n.toString();
		balance = 0;
		// výchozí stav je pod minimální částkou (0 < Bank.MIN_AMOUNT)
		state = new StateLow();

		transactions = new ArrayList<Transaction>();
	}

	// vrátí číslo účtu
	public String getNumber() {
		return number;
	}

	// vrátí zůstatek na účtu jako Integer
	public int getBalance() {
		return balance;
	}

	// vrátí stav
	public State getState() {
		return state;
	}

	// nastavý daný stav
	public void setState(State newState) {
		state = newState;
	}

	// přidá transakci do seznamu, zkontroluje změnu stavu a rozešle události
	private void checkStatusChange(Transaction transaction) {
		transactions.add(transaction);
		state.checkStatusChange(this);
		notifyObservers(transaction);
	}

	// vloží peníze na účet
	synchronized public void deposit(int howMuch) throws AccountException {
		final String message = "Cannot deposit " + howMuch +
			" into account #" + getNumber() + ": ";

		Deposit deposit = new Deposit(this, howMuch);

		if (state.isClosed())
			throw new AccountException(deposit, message + "closed account");
		
		if (howMuch <= 0)
			throw new AccountException(deposit, message + "won't deposit <= 0");

		balance += howMuch;
		setChanged();

		checkStatusChange(deposit);
	}

	// vybere peníze z účtu
	synchronized public void withdraw(int howMuch) throws AccountException {
		final String message = "Cannot withdraw " + howMuch +
			" from account no. " + getNumber() + ": ";

		Withdrawal withdrawal = new Withdrawal(this, howMuch);

		if (!state.isNormal())
			throw new AccountException(withdrawal, message + "account not in normal state");
		
		if (howMuch <= 0)
			throw new AccountException(withdrawal, message + "won't withdraw <= 0");
		
		if ((balance-howMuch) < Bank.MIN_AMOUNT)
			throw new AccountException(withdrawal, message + "withdrawal would make the balance < " + Bank.MIN_AMOUNT);

		balance -= howMuch;
		setChanged();

		checkStatusChange(withdrawal);
	}

	// převede peníze na jiný účet
	synchronized public void transfer(int howMuch, Account target) throws AccountException {
		final String message = "Cannot transfer " + howMuch +
			" from account #" + getNumber() + " to #" +
			target.getNumber() + ": ";

		Transfer transfer = new OutTransfer(this, target, howMuch);

		if (target == null)
			throw new AccountException(transfer, message + "null target");
		
		if (howMuch <= 0)
			throw new AccountException(transfer, message + "won't transfer <= 0");
		
		if (!state.isNormal())
			throw new AccountException(transfer, message + "account not in normal state");

		if (target.getState().isClosed())
			throw new AccountException(transfer, message + "target account closed");
		
		if ((getBalance()-howMuch) < Bank.MIN_AMOUNT)
			throw new AccountException(transfer, message + "transfer would make the balance of target < " + Bank.MIN_AMOUNT);

		balance -= howMuch;
		setChanged();

		target.transferFrom(this, howMuch);

		checkStatusChange(transfer);
	}

	// pro interní použití z transfer() na cílový účet; nepotřebuje kontroly
	private void transferFrom(Account source, int howMuch) {
		balance += howMuch;
		setChanged();

		Transfer transfer = new InTransfer(source, this, howMuch);
		checkStatusChange(transfer);
	}

	// uzavře účet
	synchronized public void closeAccount() {
		if (!state.isClosed())
			setState(new StateClosed());
	}

	// navštíví všechny transakce daným visitorem
	public void visitTransactions(TransactionVisitor visitor) {
		String header = "======== ACCOUNT NUMBER "+getNumber()+" ========";
		System.out.println(header);

		if (!transactions.isEmpty()) {
			Iterator<Transaction> it = transactions.iterator();

			while (it.hasNext()) {
				it.next().accept(visitor);
			}
		}

		char[] footer = new char[header.length()];
		Arrays.fill(footer, '=');
		System.out.println(new String(footer));
	}

	// vrátí iterátor podle zadaných kritérií (typ transakce a minimální částka)
	public TransactionIterator iterator(TransactionType type, int minAmount) {
		return new TransactionIterator(transactions.iterator(), type, minAmount);
	}
}
