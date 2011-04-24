package cz.cvut.fel.taranpe1.sw.banka;

import cz.cvut.fel.taranpe1.sw.transaction.Deposit;
import cz.cvut.fel.taranpe1.sw.transaction.ITransaction;
import cz.cvut.fel.taranpe1.sw.transaction.TransactionType;
import cz.cvut.fel.taranpe1.sw.transaction.Transfer;
import cz.cvut.fel.taranpe1.sw.transaction.Withdrawal;

/*******************************************************************************
 * Instance třídy NormalStav reprezentuje normalni Stav Accountu, kdy jsou 
 * povoleny vsechny akce s uctem
 *
 * @author    Petr Tarant
 * @version   1.00.000
 */
public class NormalStav extends AStav {

    /***************************************************************************
     * Konstruktory a tovární metody
     **************************************************************************/
    /***************************************************************************
     * Zakladni konstruktor
     * Odeslani parametru predkovi
     * @param money pocet penez na uctu.
     */
    public NormalStav(int money, ITransaction tran) {
        super(money, tran);
    }

    /***************************************************************************
     * Ostatní nesoukromé metody instancí
     **************************************************************************/
    /***************************************************************************
     * Pridani penez na ucet
     * @param howMuch pokil penez chceme vlozit
     */
    public AStav depositInt(int howMuch) {
        Deposit d = new Deposit(howMuch, TransactionType.DEPOSITS);
        // Deposit ulozime do listu vsech deposit
        d.getList().add(d);
        return new NormalStav(this.money + howMuch, d);
    }

    /***************************************************************************
     * Vyber penez z uctu
     * @param howMuch pokil penez chceme vybrat
     */
    public AStav withdrawInt(int howMuch) {
        // vytvorime vyber
        Withdrawal w = new Withdrawal(howMuch, TransactionType.WITHDRAWALS);
        // Withdrawal ulozime do listu vsech withdrawal
        w.getList().add(w);
        if (isPossible(howMuch)) {
            return new NormalStav(this.money - howMuch, w);
        } else {
            return new MinBalanceStav(this.money - howMuch, w);
        }
    }

    /***************************************************************************
     * Prevod penez z uctu
     * @param howMuch pokil penez chceme poslat
     * @param account na jaky account chceme penize poslat
     */
    public AStav transferInt(int howMuch, Account account) {
        Transfer tOut = new Transfer(howMuch, TransactionType.OUTBOUNDTRANSFERS);
        Transfer tIn = new Transfer(howMuch, TransactionType.INBOUNDTRANSFERS);
        // Transfer ulozime do listu vsech transakci
        tOut.getList().add(tOut);
        tIn.getList().add(tIn);
        // nastavime prichozi transakci na druhem uctu
        account.setStav(new NormalStav(money + howMuch, tIn)); 
        if (isPossible(howMuch)) {
            return new NormalStav(this.money - howMuch, tOut);
        } else {
            return new MinBalanceStav(this.money - howMuch, tOut);
        }
    }

    /***************************************************************************
     * Metoda pro vypis Stavu
     * @return string vypis banky
     */
    @Override
    public String toString() {
        return "NORMAL, zustatek=" + money;
    }
    /***************************************************************************
     * Testovací metody a třídy
     **************************************************************************/
//
//     /************************************************************************
//      * Testovací metoda.
//      */
//     public static void test()
//     {
//         Normal instance = new Normal();
//     }
//     /** @param args Parametry příkazového řádku - nepoužívané. */
//     public static void main(String[] args)  {  test();  }
}
