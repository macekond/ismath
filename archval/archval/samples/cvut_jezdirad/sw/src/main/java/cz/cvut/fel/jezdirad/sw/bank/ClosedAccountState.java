package cz.cvut.fel.jezdirad.sw.bank;


/**
 * Closed account state, no operations are allowed
 * @author Radek Ježdík
 */
class ClosedAccountState extends AccountState {

	private final String ERROR_MSG = "Account is closed";


	public ClosedAccountState(int balance) {
		super(balance);
	}


	@Override
	void deposit(int howMuch) throws AccountException {
		throw new AccountException(ERROR_MSG);
	}


	@Override
	void withdraw(int howMuch) throws AccountException {
		throw new AccountException(ERROR_MSG);
	}


	@Override
	void transfer(int howMuch, Account from, Account target) throws AccountException {
		throw new AccountException(ERROR_MSG);
	}


	@Override
	void receive(int howMuch, Account from) throws AccountException {
		throw new AccountException(ERROR_MSG);
	}

}
