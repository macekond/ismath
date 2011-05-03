package cz.cvut.fel.watzkdav.sw;

abstract class Transaction {
	public final long id;
	public final int howMuch;
	public final Account target;
	
	public Transaction(Account target, int howMuch) {
		this.id = Bank.getBank().getTransactionId();
		this.howMuch = howMuch;
		this.target = target;
	}
	
	abstract public void accept(TransactionVisitor visitor);
}

class Deposit extends Transaction {
	public Deposit(Account target, int howMuch) {
		super(target, howMuch);
	}
	
	public void accept(TransactionVisitor visitor) {
		visitor.visitDeposit(this);
	}
}

class Withdrawal extends Transaction {
	public Withdrawal(Account target, int howMuch) {
		super(target, howMuch);
	}
	
	public void accept(TransactionVisitor visitor) {
		visitor.visitWithdrawal(this);
	}
}

abstract class Transfer extends Transaction {
	Account source;
	
	public Transfer(Account source, Account target, int howMuch) {
		super(target, howMuch);
		this.source = source;
	}
}

class InTransfer extends Transfer {
	public InTransfer(Account source, Account target, int howMuch) {
		super(source, target, howMuch);
	}
	
	public void accept(TransactionVisitor visitor) {
		visitor.visitInboundTransfer(this);
	}
}

class OutTransfer extends Transfer {
	public OutTransfer(Account source, Account target, int howMuch) {
		super(source, target, howMuch);
	}
	
	public void accept(TransactionVisitor visitor) {
		visitor.visitOutboundTransfer(this);
	}
}
