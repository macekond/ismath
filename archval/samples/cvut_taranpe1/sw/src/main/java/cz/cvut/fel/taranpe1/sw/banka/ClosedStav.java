package cz.cvut.fel.taranpe1.sw.banka;

/*******************************************************************************
 * Instance třídy ClosedStav reprezentuje uzavreny Stav Accountu, vsechny akce
 * jsou zakazany
 *
 * @author    Petr Tarant
 * @version   1.00.000
 */
public class ClosedStav extends AStav {

    /***************************************************************************
     * Konstruktory a tovární metody
     **************************************************************************/
    /***************************************************************************
     * Zakladni konstruktor
     * Odeslani parametru predkovi
     * @param money pocet penez na uctu.
     */
    public ClosedStav(int money) {
        super(money, null);
    }

    /***************************************************************************
     * Ostatní nesoukromé metody instancí
     **************************************************************************/
    /***************************************************************************
     * Pridani penez na ucet
     * Na zablokovanem ucte nelze nic vkladat
     * @param howMuch pokil penez chceme vlozit
     * @throws nelze ukladat penize
     */    
    public AStav depositInt(int howMuch) {
        throw new AccountException("V uzavrenem stavu nelze ukladat penize");
    }

    /***************************************************************************
     * Vyber penez z uctu
     * Na zablokovanem ucte nelze nic vybirat
     * @param howMuch pokil penez chceme vybrat
     * @throws nelze vybirat penize
     */    
    public AStav withdrawInt(int howMuch) {
        throw new AccountException("V uzavrenem stavu nelze vybírat peníze");
    }

    /***************************************************************************
     * Prevod penez z uctu
     * Na zablokovanem ucte nelze nic prevadet
     * @param howMuch pokil penez chceme poslat
     * @param account na jaky account chceme penize poslat
     * @throws nelze prevadet penize
     */     
    public AStav transferInt(int howMuch, Account account) {
        throw new AccountException("V uzavrenem stavu nelze převádět peníze");
    }
    
    /***************************************************************************
     * Metoda pro vypis Stavu
     * @return string vypis banky
     */       
    @Override
    public String toString() {
        return "CLOSED, zustatek="+money;
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
//         Closed instance = new Closed();
//     }
//     /** @param args Parametry příkazového řádku - nepoužívané. */
//     public static void main(String[] args)  {  test();  }
}
