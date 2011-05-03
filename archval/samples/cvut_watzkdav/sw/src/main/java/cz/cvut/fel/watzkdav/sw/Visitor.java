package cz.cvut.fel.watzkdav.sw;

interface TransactionVisitor {
	void visitDeposit(Deposit d);
	void visitWithdrawal(Withdrawal w);
	void visitInboundTransfer(Transfer t);
	void visitOutboundTransfer(Transfer t);
}

class TransactionPrintVisitor implements TransactionVisitor {
	public void visitDeposit(Deposit d) {
		System.out.println("Visiting deposit id="+d.id+": deposited "+d.howMuch+
				   " to account #"+d.target.getNumber());
	}

	public void visitWithdrawal(Withdrawal w) {
		System.out.println("Visiting withdrawal id="+w.id+": withdrew "+w.howMuch+
				   " from account #"+w.target.getNumber());
	}

	public void visitInboundTransfer(Transfer t) {
		System.out.println("Visiting inbound transfer id="+t.id+": transferred "+t.howMuch+
				   " from account #"+t.source.getNumber()+" to account #"+t.target.getNumber());
	}

	public void visitOutboundTransfer(Transfer t) {
		System.out.println("Visiting outbound transfer id="+t.id+": transferred "+t.howMuch+
				   " to account #"+t.target.getNumber()+" from account #"+t.source.getNumber());
	}
}
