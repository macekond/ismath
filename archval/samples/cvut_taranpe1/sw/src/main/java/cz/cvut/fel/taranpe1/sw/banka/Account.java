package cz.cvut.fel.taranpe1.sw.banka;

import cz.cvut.fel.taranpe1.sw.list.Iterator;
import cz.cvut.fel.taranpe1.sw.list.MyList;
import cz.cvut.fel.taranpe1.sw.list.TransactionIterator;
import cz.cvut.fel.taranpe1.sw.transaction.ITransaction;
import cz.cvut.fel.taranpe1.sw.transaction.TransactionType;
import java.util.Observable;

/*******************************************************************************
 * Instance třídy Account představují ucty jednotlivych  uzivatelu.
 * Instance Account muze byt ve trech stavech. Pro implementaci stavu je pouzit
 * State pattern. Taze cast funkcionality Accountu je presunuto do potomku 
 * AStav.
 *
 *********************************** ATRYBUTY **********************************
 * PRIVATE:
 * String number                         -> cislo uctu
 * AStav stav                            -> Stav uctu
 * 
 * SLOZITOST ************************ METODY ***********************************
 * PUBLIC:
 *      |Account()                              -> zakladni konstruktor
 * O(1) |String getNumber()                     -> vrati singleton banka
 * O(n) |AStav getStav()                        -> vrati Stav
 * O(n) |String getBalance()                    -> vrati zustatek 
 * O(n) |void deposit(int)                      -> vlozi na ucet
 * O(n) |void withdraw(int)                     -> vyber z u uctu
 * O(n) |void transfer(int, Account)            -> prevod na ucet
 * O(n) |boolean equals(Object)                 -> porovnani
 * O(n) |int hashCode()                         -> hash
 * 
 * ABOUT:
 * @author    Petr Tarant
 * @version   1.00.000
 */
public class Account extends Observable {

    /***************************************************************************
     * Atributy třídy
     **************************************************************************/
    // pocet instanci tridy Account
    private static int numberOfInstance = 0;
    /***************************************************************************
     * Atributy instancí
     **************************************************************************/
    // cislo uctu inkerementujeme static pocet instance
    private final int cislo = ++numberOfInstance;
    // string cislo uctu
    private String number = "123" + cislo + "/100";
    // stav accountu
    private AStav stav;
    // vypis vsech provedenych transakci
    private MyList<ITransaction> listTransactions = new MyList<ITransaction>();

    public MyList<ITransaction> list() {
        return listTransactions;
    }

    /***************************************************************************
     * Konstruktory a tovární metody
     **************************************************************************/
    /***************************************************************************
     * Zakladni konstruktor pro vytvorani Accountu. Defaultne se vytvori
     * MinBalanceStav.
     */
    public Account() {
        stav = AStav.getInstance();
    }

    /***************************************************************************
     * Zakladni konstruktor pro vytvorani Accountu. tento konstruktor 
     * slouzi k porovnavani Accountu v Listu
     * @param number cislo uctu, ktery chceme najit.
     */
    public Account(String number) {
        this.number = number;
    }

    /***************************************************************************
     * Přístupové metody vlastností instancí
     **************************************************************************/
    /***************************************************************************
     * Ziskani cisla uctu
     * @return number vraceni cisla uctu.
     */
    public String getNumber() {
        return number;
    }

    /***************************************************************************
     * Nastaveni stavu uctu
     * @return number vraceni cisla uctu.
     */    
    protected void setStav(AStav stav){
        this.stav = stav;
    }

    /***************************************************************************
     * Ostatní nesoukromé metody instancí
     **************************************************************************/
    /***************************************************************************
     * Nastavi ucet jako uzavreny
     */
    public void closeAccount() {
        stav = stav.setClosed();
    }

    /***************************************************************************
     * Vrati zustatek na uctu
     * @return sting hodnota zustaktku na uctu
     */
    public String getBalance() {
        return stav.money + " ";
    }

    /***************************************************************************
     * Vlozeni hodnoty na ucet
     * @param howMuch kolik chceme vlozit na ucet
     */
    public void deposit(int howMuch) {
        stav = stav.depositInt(howMuch);
        // zapiseme prepravku do listu
        listTransactions.add(stav.tran);
        // nahlaseni Bance o vykonani transakce
        notifyObservers("Deposit " + howMuch + " to account: " + number);
    }

    /***************************************************************************
     * Vyber penez z uctu
     * @param howMuch kolik chceme vybrat z uctu
     */
    public void withdraw(int howMuch) {
        stav = stav.withdrawInt(howMuch);
        // zapiseme prepravku do listu
        listTransactions.add(stav.tran);
        // nahlaseni Bance o vykonani transakce
        notifyObservers("Withdraw " + howMuch + " from account: " + number);
    }

    /***************************************************************************
     * Prevede penize na ucet
     * @param howMuch kolik chceme preves z uctu
     * @param account na jaky ucet chceme prevest
     */
    public void transfer(int howMuch, Account account) {
        stav = stav.transferInt(howMuch, account);
        // zapiseme prepravku do listu
        listTransactions.add(stav.tran);
        // nahlaseni Bance o vykonani transakce
        notifyObservers("Transfer " + howMuch + " from account: " + number + " to account: " + account.getNumber());
    }

    /***************************************************************************
     * Metoda pro vypis Accountu.
     * @return string vypis banky
     */
    @Override
    public String toString() {
        return "Account{" + "cislo=" + cislo + ", number=" + number + ", stav=" + stav + "}";
    }

    /***************************************************************************
     * Metoda pro porovnani dvou Accountu - porovnavame podle cisla accountu
     * @param obj
     * @return true - pokud se rovnaji, false- pokud se nerovnani
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if ((this.number == null) ? (other.number != null) : !this.number.equals(other.number)) {
            return false;
        }
        return true;
    }

    /***************************************************************************
     * Vytvoreni hashcisla pro danny account
     * @return hash vrati hash k danemu accountu
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.cislo;
        hash = 29 * hash + (this.number != null ? this.number.hashCode() : 0);
        return hash;
    }

    /***************************************************************************
     * Metoda pro ohlaseni transakce.
     * @param arg jaka akce se stala
     */
    @Override
    public void notifyObservers(Object arg) {
        super.setChanged();
        super.notifyObservers(arg);
    }

    /***************************************************************************
     * Metoda vrati iterator prez vsechny transakce toho typu, ktery byl
     * nadefinovan. Pokud je typ ALL vrati se ukazatel pres cely list.
     * @param arg jaka akce se stala
     */
    public TransactionIterator iterator(TransactionType type, int minAmount) {
        if (type.equals(TransactionType.DEPOSITS)) {
            return createList(TransactionType.DEPOSITS, minAmount);
        } else if (type.equals(TransactionType.WITHDRAWALS)) {
            return createList(TransactionType.WITHDRAWALS, minAmount);
        } else if (type.equals(TransactionType.INBOUNDTRANSFERS)) {
            return createList(TransactionType.INBOUNDTRANSFERS, minAmount);
        } else if (type.equals(TransactionType.OUTBOUNDTRANSFERS)) {
            return createList(TransactionType.OUTBOUNDTRANSFERS, minAmount);
        }
        return (TransactionIterator) listTransactions.first();
    }

    /***************************************************************************
     * Soukromé a pomocné metody instancí
     **************************************************************************/
    /***************************************************************************
     * Metoda pro vytvaveni sublistu podle podminek v parametrech.
     * @param type typ transakce
     * @param minAmount minimalni castka transakce
     * @return TransactionIterator ukazatel na prvni prvek v subListu
     */
    private TransactionIterator createList(TransactionType type, int minAmount) {
        MyList<ITransaction> tmp = new MyList<ITransaction>();
        Iterator iterator = listTransactions.first();
        for (; iterator.isValid() && iterator.retrieve() != null; iterator.next()) {
            ITransaction t = (ITransaction) iterator.retrieve();
            if ((t.getType().equals(type)) && t.getAmount() >= minAmount) {
                tmp.add(t);
            }
        }
        return (TransactionIterator) tmp.first();
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
//         Account instance = new Account();
//     }
//     /** @param args Parametry příkazového řádku - nepoužívané. */
//     public static void main(String[] args)  {  test();  }
}
