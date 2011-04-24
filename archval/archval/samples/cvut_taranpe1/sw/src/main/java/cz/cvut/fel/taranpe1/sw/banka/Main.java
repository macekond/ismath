package cz.cvut.fel.taranpe1.sw.banka;

import cz.cvut.fel.taranpe1.sw.list.TransactionIterator;
import cz.cvut.fel.taranpe1.sw.transaction.Deposit;
import cz.cvut.fel.taranpe1.sw.transaction.TransactionType;
import cz.cvut.fel.taranpe1.sw.transaction.Transfer;
import cz.cvut.fel.taranpe1.sw.transaction.Visitor;
import cz.cvut.fel.taranpe1.sw.transaction.Withdrawal;

/*******************************************************************************
 * Instance třídy Main představují testovaci tridu
 *
 * @author    Petr
 * @version   1.00.000
 */
public class Main {

    public Main() {
    }

    /*******************************************************************************
     * Testovací metody a třídy
     ******************************************************************************/
    /***************************************************************************
     * Testovací metoda.
     */
    public static void test() {
        Banka bank = Banka.getBanka();
        for (int i = 1; i <= 10; i++) {
            bank.createAccount();
        }
        bank.deposit("123" + 1 + "/100", 100);
        bank.transfer("123" + 1 + "/100", 10, bank.lookupAccount("123" + 2 + "/100"));
        bank.deposit("123" + 1 + "/100", 1000);
        bank.closeAccount("123" + 1 + "/100");
        bank.deposit("123" + 10 + "/100", 10000);
        bank.withdraw("123" + 10 + "/100", 400);
        System.out.println(bank);
        System.out.println("\nDEPOSIT TRANSACTIONS on " + "123" + 1 + "/100 :");
        TransactionIterator itr = bank.iterator("123" + 1 + "/100", TransactionType.DEPOSITS, 0);
        for (; itr.isValid(); itr.next()) {
            System.out.print(itr.retrieve() + " ");
        }
        System.out.println("\n\nWITHDRAWAL TRANSACTIONS on " + "123" + 1 + "/100 :");
        itr = bank.iterator("123" + 1 + "/100", TransactionType.WITHDRAWALS, 0);
        for (; itr.isValid(); itr.next()) {
            System.out.print(itr.retrieve() + " ");
        }
        System.out.println("\n\nINBOUND TRANSACTIONS on " + "123" + 1 + "/100 :");
        itr = bank.iterator("123" + 1 + "/100", TransactionType.INBOUNDTRANSFERS, 0);
        for (; itr.isValid(); itr.next()) {
            System.out.print(itr.retrieve() + " ");
        }
        System.out.println("\n\nOUTBOUND TRANSACTIONS on " + "123" + 1 + "/100 :");
        itr = bank.iterator("123" + 1 + "/100", TransactionType.OUTBOUNDTRANSFERS, 0);
        for (; itr.isValid(); itr.next()) {
            System.out.print(itr.retrieve() + " ");
        }
        System.out.println("\n\n///////////////////VISITOR//////////////////////");
        Visitor visitor = new Visitor();
        Deposit deposit = new Deposit();
        deposit.visitTransactions(visitor);
        Withdrawal withdrawal = new Withdrawal();
        withdrawal.visitTransactions(visitor);
        Transfer transfer = new Transfer(TransactionType.INBOUNDTRANSFERS);
        transfer.visitTransactions(visitor);
        transfer = new Transfer(TransactionType.OUTBOUNDTRANSFERS);
        transfer.visitTransactions(visitor);
    }

    /** @param args Parametry příkazového řádku - nepoužívané. */
    public static void main(String[] args) {
        test();
    }
}
