package cz.cvut.fel.watzkdav.sw;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;

// typy transakcí
enum TransactionType {
	ALL,
	DEPOSITS,
	WITHDRAWALS,
	INBOUNDTRANSFERS,
	OUTBOUNDTRANSFERS,
}

class TransactionIterator implements Iterator<Transaction> {
	// byl zavolán hasNext() před next()?
	private boolean nextReady;
	// transakce, kterou vrátí následující volání next()
	private Transaction next;

	private final Iterator<Transaction> iterator;
	private final int minAmount;
	private static final Map<TransactionType,Class> typeClasses;
	private final Class typeClass;
	
	static {
		typeClasses = new HashMap<TransactionType,Class>(5);
		typeClasses.put(TransactionType.ALL, Transaction.class);
		typeClasses.put(TransactionType.DEPOSITS, Deposit.class);
		typeClasses.put(TransactionType.WITHDRAWALS, Withdrawal.class);
		typeClasses.put(TransactionType.INBOUNDTRANSFERS, InTransfer.class);
		typeClasses.put(TransactionType.OUTBOUNDTRANSFERS, OutTransfer.class);
	}

	// dostává iterátor seznamu všech transakcí, typ trans. a min. částku
	public TransactionIterator(Iterator<Transaction> iterator,
				   TransactionType type, int minAmount) {
		this.iterator = iterator;
		this.minAmount = minAmount;
		this.typeClass = typeClasses.get(type);
		this.nextReady = false;
	}

	// obsahuje seznam další prvek odpovídající kritériím?
	// pokud ano, uloží jeho ukazatel do next
	public boolean hasNext() {
		if (nextReady)
			return next != null;

		nextReady = true;

		while (iterator.hasNext()) {
			Transaction t = iterator.next();
			assert t != null;
			
			if(t.howMuch < this.minAmount)
				continue;

			if(typeClass.isInstance(t)) {
				this.next = t;
				return true;
			} else {
				this.next = null;
			}
		}
		
		return false;
	}

	// vrátí další transakci odpovídající kritériím nebo null
	public Transaction next() {
		if (!nextReady)
			hasNext();

		Transaction x = this.next;

		if(x == null)
			throw new NoSuchElementException();

		nextReady = false;
		this.next = null;

		return x;
	}

	// volitelná metoda iterátoru, zde nemá smysl
	public void remove() {
		throw new UnsupportedOperationException("remove() is not implemented in TransactionIterator");
	}
}
