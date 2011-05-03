package cz.cvut.fel.taranpe1.sw.banka;

import cz.cvut.fel.taranpe1.sw.transaction.Deposit;
import cz.cvut.fel.taranpe1.sw.transaction.ITransaction;
import cz.cvut.fel.taranpe1.sw.transaction.TransactionType;

/*******************************************************************************
 * Instance třídy MinBalanceStav reprezentuje minimalni Stav Accountu, kde je 
 * povoleno pouze vkaldani na ucet
 *
 * @author    Petr Tarant
 * @version   1.00.000
 */
public class MinBalanceStav extends AStav {

    /***************************************************************************
     * Konstruktory a tovární metody
     **************************************************************************/
    /***************************************************************************
     * Zakladni konstruktor
     * Odeslani parametru predkovi
     * @param money pocet penez na uctu.
     */
    public MinBalanceStav(int money, ITransaction tran) {
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
        Deposit d = d = new Deposit(howMuch, TransactionType.DEPOSITS);
        // Deposit pridame do listu vsech deposit
        d.getList().add(d);
        if ((howMuch + this.money) > MIN_BALANCE) {
            return new NormalStav(this.money + howMuch, d);
        } else {
            return new MinBalanceStav(this.money, d);
        }
    }

    /***************************************************************************
     * Vyber penez z uctu
     * Vyber penez neni v tomto stavu mozny
     * @param howMuch pokil penez chceme vybrat
     * @throws v minBalance stavu leze vybirat peníze
     */
    public AStav withdrawInt(int howMuch) {
        throw new AccountException("S minimálním zůstatkem nelze vybírat peníze");
    }

    /***************************************************************************
     * Prevod penez z uctu
     * Prevod penez neni v tomto stavu mozny
     * @param howMuch pokil penez chceme poslat
     * @param account na jaky account chceme penize poslat
     * @throws v minBalance stavu leze posilat peníze
     */
    public AStav transferInt(int howMuch, Account account) {
        throw new AccountException("S minimálním zůstatkem nelze posílat peníze");
    }

    /***************************************************************************
     * Metoda pro vypis Stavu
     * @return string vypis banky
     */
    @Override
    public String toString() {
        return "MINBALANCE, zustatek=" + money;
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
//         MinZustatek instance = new MinZustatek();
//     }
//     /** @param args Parametry příkazového řádku - nepoužívané. */
//     public static void main(String[] args)  {  test();  }
}
