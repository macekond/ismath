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
public class Transfer implements ITransaction{
        // list vsech vklaud na vsechny ucty
    private static MyList<ITransaction> list = new MyList<ITransaction>();

    public MyList<ITransaction> getList(){
        return list;
    }
    
    // typ provedene transakce
    private TransactionType type;
    // transakcni castka, hodnota se kterou se pracovalo
    private int amount;

    public Transfer(){
        this(TransactionType.INBOUNDTRANSFERS);
    }
    
    public Transfer(TransactionType type){
        this.type = type;
    }
    public Transfer(int amount, TransactionType type) {
        this.amount = amount;
        this.type = type;
    }
    

    public void visitTransactions(TransactionVisitor visitor) {
        if(type.equals(TransactionType.INBOUNDTRANSFERS)){
            visitor.visitInboundTransfer(this);
        }else{
            visitor.visitOutboundTransfer(this);
        }
    }

    public int getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Transfer{" + "type=" + type + ", amount=" + amount + '}';
    }
    

}
