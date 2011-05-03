package cz.cvut.fel.jezdirad.sw.bank;


/**
 * Normal account state, all operations are allowed
 * @author Radek Ježdík
 */
class NormalAccountState extends AccountState {

	public NormalAccountState(int balance) {
		super(balance);
	}


	@Override
	void deposit(int howMuch) {
		increaseBalance(howMuch);
	}


	@Override
	void withdraw(int howMuch) throws AccountException {
		decreaseBalance(howMuch);
	}


	@Override
	void transfer(int howMuch, Account from, Account target) throws AccountException {
		decreaseBalance(howMuch);
		try {
			target.receive(howMuch, from);
		} catch(AccountException e) {
			increaseBalance(howMuch);
			throw e;
		}
	}


	@Override
	void receive(int howMuch, Account from) {
		increaseBalance(howMuch);
	}

}
