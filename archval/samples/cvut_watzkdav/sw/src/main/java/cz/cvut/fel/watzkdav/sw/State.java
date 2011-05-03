package cz.cvut.fel.watzkdav.sw;

// abstraktní základ stavů
abstract class State {
	public boolean isNormal() { return false; }
	public boolean isLow()    { return false; }
	public boolean isClosed() { return false; }

	public void checkStatusChange(Account account) {}
}

// normální stav
class StateNormal extends State {
	@Override
	public boolean isNormal() { return true; }

	// je-li zůstatek < 1000, tak se někde musela stát chyba
	@Override
	public void checkStatusChange(Account account) throws AccountException {
		if (account.getBalance() < Bank.MIN_AMOUNT) {
			throw new AccountException("This is a bug as the account balance should never be less than 1000!");
		}
	}
}

// stav pod minimálním zůstatkem
class StateLow extends State {
	@Override
	public boolean isLow()    { return true; }

	// je-li zůstatek >= 1000, nastaví normální stav
	@Override
	public void checkStatusChange(Account account) {
		if (account.getBalance() >= Bank.MIN_AMOUNT) {
			account.setState(new StateNormal());
		}
	}
}

// uzavřený stav
class StateClosed extends State {
	@Override
	public boolean isClosed() { return true; }
}
