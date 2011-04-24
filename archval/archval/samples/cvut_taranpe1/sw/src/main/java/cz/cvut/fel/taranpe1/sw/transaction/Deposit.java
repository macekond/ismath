/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fel.taranpe1.sw.transaction;

import cz.cvut.fel.taranpe1.sw.list.MyList;

/**
 *
 * @author Petr
 */
public class Deposit implements ITransaction {
    
    // list vsech vklaud na vsechny ucty
    private static MyList<ITransaction> list = new MyList<ITransaction>();

    public MyList<ITransaction> getList(){
        return list;
    }
    
    // typ provedene transakce
    private TransactionType type;
    // transakcni castka, hodnota se kterou se pracovalo
    private int amount;
    
    public Deposit(){}

    public Deposit(int amount, TransactionType type) {
        this.amount = amount;
        this.type = type;
    }

    public void visitTransactions(TransactionVisitor visitor) {
        visitor.visitDeposit(this);
    }

    public int getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Deposit{" + "type=" + type + ", amount=" + amount + '}';
    }
    
    
}
