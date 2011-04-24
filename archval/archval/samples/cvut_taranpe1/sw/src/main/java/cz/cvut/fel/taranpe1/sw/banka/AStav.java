package cz.cvut.fel.taranpe1.sw.banka;

import cz.cvut.fel.taranpe1.sw.transaction.Deposit;
import cz.cvut.fel.taranpe1.sw.transaction.ITransaction;
import cz.cvut.fel.taranpe1.sw.transaction.TransactionType;


/*******************************************************************************
 * Instance třídy Abstraktni tridy AStav definuji zakladni vlastnosi Stavu
 *
 * ABOUT:
 * @author    Petr Tarant
 * @version   1.00.000
 */
public abstract class AStav {

    /***************************************************************************
     * Atributy třídy
     **************************************************************************/
    // minimalni hodnota na uctu
    public static final int MIN_BALANCE = 1000;
    /***************************************************************************
     * Atributy instancí
     **************************************************************************/
    // castka na uctu
    protected int money;
    // typ transakce
    protected ITransaction tran;
    
    /***************************************************************************
     * Konstruktory a tovární metody
     **************************************************************************/
    /***************************************************************************
     * Parametricky konstruktor
     * @param money polik penez je na uctu.
     */
    protected AStav(int money, ITransaction tran) {
        this.money = money;
        this.tran = tran;
    }

    /***************************************************************************
     * Tovarni metoda
     * @param money kolik penez je na uctu.
     * @return podle stav, podle poctu penez.
     */
    public static AStav getInstance() {
        Deposit d = new Deposit(MIN_BALANCE, TransactionType.DEPOSITS);
        d.getList().add(d);
        return new MinBalanceStav(MIN_BALANCE, d);
    }

    /***************************************************************************
     * Ostatní nesoukromé metody instancí
     **************************************************************************/
    /***************************************************************************
     * Zjisteni, zda je operace mozna
     * @param howMuch kolik chceme ubrat z uctu
     */
    protected boolean isPossible(int howMuch) {
        return (money - howMuch) > MIN_BALANCE ? true : false;
    }

    /***************************************************************************
     * Nasavi stav ucu na uzavreno
     * @return AStav uzavreny stav uctu
     */
    public AStav setClosed() {
        return new ClosedStav(this.money);
    }

    /***************************************************************************
     * Abstraktní metody
     **************************************************************************/
    // vlozeni penez na ucet
    abstract AStav depositInt(int howMuch);

    // vybere penize z uctu
    abstract AStav withdrawInt(int howMuch);

    // prevede penize z uctu na ucet
    abstract AStav transferInt(int howMuch, Account account);

    // vypis stavu
    @Override
    abstract public String toString();
    
    
}
