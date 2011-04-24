package cz.cvut.fel.jezdirad.sw.bank;


/**
 * Below minimum balance account state, only deposit and receive is allowed
 * @author Radek Ježdík
 */
class BelowMinAccountState extends AccountState {

	public BelowMinAccountState(int balance) {
		super(balance);
	}


	@Override
	void deposit(int howMuch) {
		increaseBalance(howMuch);
	}


	@Override
	void withdraw(int howMuch) throws AccountException {
		throw new AccountException("Account is below minimum");
	}


	@Override
	void transfer(int howMuch, Account from, Account target) throws AccountException {
		throw new AccountException("Account is below minimum");
	}


	@Override
	void receive(int howMuch, Account from) throws AccountException {
		increaseBalance(howMuch);
	}

}
