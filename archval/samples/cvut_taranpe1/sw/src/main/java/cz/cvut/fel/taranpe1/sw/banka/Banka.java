package cz.cvut.fel.taranpe1.sw.banka;

import cz.cvut.fel.taranpe1.sw.list.MyList;
import cz.cvut.fel.taranpe1.sw.list.TransactionIterator;
import cz.cvut.fel.taranpe1.sw.transaction.TransactionType;
import java.util.Observable;
import java.util.Observer;

/*******************************************************************************
 * Instance třídy Banka je Singleton, takze lze vytvorit pouze jedinou instanci.
 * Instance tridy banka si drzi vsechny Accounty v Listu.
 * Banka implementuje take pattern Fasade. Je tridou, prez kterou bude uzivatel
 * komunikovat s celym systemem, nebo alespon s jeho casti.
 * 
 *
 *********************************** ATRYBUTY **********************************
 * PRIVATE:
 * MyList<Account> list                  -> List
 * Banka instance = new Banka()          -> Singleton Banka
 * 
 * SLOZITOST ************************ METODY ***********************************
 * PUBLIC:
 *      |Banka()                                -> zakladni konstruktor
 * O(1) |Banka getBanka()                       -> vrati singleton banka
 * O(n) |Account createAccount()                -> vytvori account
 * O(n) |void LookupAccount(String number)      -> vrati objekt z List
 * 
 * ABOUT:
 * @author    Petr Tarant
 * @version   1.00.000
 */
public class Banka implements Observer {

    /***************************************************************************
     * Atributy třídy
     **************************************************************************/
    // spolecny List Accountu pro vsechny instance
    private static MyList<Account> list;
    // banka jako singleton
    private static final Banka instance = new Banka();

    /***************************************************************************
     * Konstruktory a tovární metody
     **************************************************************************/
    /***************************************************************************
     * Zakladni konstruktor pro vytvoreni Banky.
     * Vytvori list Accountu.
     */
    private Banka() {
        list = new MyList<Account>();
    }

    /***************************************************************************
     * Tovarni metoda pro ziskani instance Banka
     * @return instance vrati odkaz na Singleton
     */
    public static Banka getBanka() {
        return instance;
    }

    /***************************************************************************
     * Ostatní nesoukromé metody instancí
     **************************************************************************/
    /***************************************************************************
     * Metoda pro vytvoreni Accountu. Pokud bude mit Account cislo, jako nejaky
     * jiz existujici Account v listu, novi Account se nevytvori.
     * @return account vrati vytvoreny Account
     */
    public Account createAccount() {
        Account account = new Account();
        list.add(account);
        account.addObserver(this); // pridame Acccount jako pozorovany objekt
        return account;
    }

    /***************************************************************************
     * Metoda pro nalezeni Accountu podle cisla.
     * @param number cislo uctu, ktery chceme najit
     * @return account vrati se pozadovany account
     */
    public Account lookupAccount(String number) {
        return list.find(new Account(number));
    }

    /***************************************************************************
     * Metoda pro uzavreni uctu
     * Metoda byla pridana v ramci patternu Fasade. V zadani se nevyskytuje
     * @param number Cislo uctu ktery chceme smazat
     */
    public void closeAccount(String number) {
        lookupAccount(number).closeAccount();
    }

    /***************************************************************************
     * Metoda pro vlozeni penez
     * Metoda byla pridana v ramci patternu Fasade. V zadani se nevyskytuje
     * @param number Cislo uctu na ktery budeme vkladat
     * @param howMuch Kolik budeme vkladat
     */
    public void deposit(String number, int howMuch) {
        lookupAccount(number).deposit(howMuch);
    }

    /***************************************************************************
     * Metoda pro vyber z uctu
     * Metoda byla pridana v ramci patternu Fasade. V zadani se nevyskytuje
     * @param number Cislo uctu na ktery budeme vkladat
     * @param howMuch Kolik budeme vybirat
     */
    public void withdraw(String number, int howMuch) {
        lookupAccount(number).withdraw(howMuch);
    }

    /***************************************************************************
     * Metoda pro prevod na jiny ucet
     * Metoda byla pridana v ramci patternu Fasade. V zadani se nevyskytuje
     * @param number Cislo uctu ze ktereho budeme posilat penize
     * @param howMuch Kolik budeme prevadet
     * @param target na jaky ucet budeme posilat
     */
    public void transfer(String number, int howMuch, Account target) {
        lookupAccount(number).transfer(howMuch, target);
    }

    /***************************************************************************
     * Metoda pro vypis Banky. Vraci vypis vsech uctu
     * @return string vypis banky
     */   
    @Override
    public String toString() {
        return "Banka{" +list+ "}";
    }

    /***************************************************************************
     * Metoda ziskava informace o provedeni transakci.
     * @param o pozorovany objekt
     * @param arg zprava jim zaslana
     */  
    public void update(Observable o, Object arg) {
        if(arg instanceof String){
            System.out.println("[Recieved responce] : " + (String) arg);
        }
    }
    
    /***************************************************************************
     * Metoda vrati iterator prez vsechny transakce 
     * @param arg jaka akce se stala
     */
    public TransactionIterator iterator(String number, TransactionType type, int minAmount) {
        return lookupAccount(number).iterator(type, minAmount);
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
//         Banka instance = new Banka();
//     }
//     /** @param args Parametry příkazového řádku - nepoužívané. */
//     public static void main(String[] args)  {  test();  }
}
