package cz.cvut.fel.jezdirad.sw.bank.transactions;

import cz.cvut.fel.jezdirad.sw.bank.transactions.Transaction.Type;



/**
 * Specifies types to iterate over
 * @author Radek Ježdík
 */
public enum TransactionType {

	ALL(null),
	DEPOSITS(Type.DEPOSIT),
	WITHDRAWALS(Type.WITHDRAWAL),
	INBOUNDTRANSFERS(Type.INBOUND_TRANSFER),
	OUTBOUNDTRANSFERS(Type.OUTBOUND_TRANSFER);

	/** Transaction.Type of this transaction type :) */
	private final Type type;


	private TransactionType(Type type) {
		this.type = type;
	}


	/**
	 * Returns type of the transaction
	 * @return
	 */
	public Type getType() {
		return type;
	}

}
