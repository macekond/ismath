package cz.cvut.fel.taranpe1.sw.list;

/*******************************************************************************
 * MYLIST
 * 
 * Instance třídy MyList predstavuje abstraktni datovou strukturu.
 * Jediny prvek, ktery se da do Listu ulozit je ListItem. Ukazovatko do 
 * Listu je ListIterator.
 * Chyby se siriv MyListException.
 * Uzivatel uklada do listu objekty typu T, ktere se obali do ListItem se 
 * kterymi pracujeme.
 * Data ulozena v ListItem jdou typu <T> MyList muze byt list cehokoliv
 * 
 *         -------- NEXT -----------
 *        |   ___            ___    |
 *         ->| H |- NEXT -> | I |---
 *         --|___|<- PREV - |___|<>-
 *        |                         |
 *         -------- PREV -----------
 * INVARIANT: next.prev = prev.next = this      
 * 
 *********************************** ATRYBUTY **********************************
 * PRIVATE:
 * ListItem<T> head  -> Hlava Listu
 * int size          -> velikost pole
 * 
 * SLOZITOST ************************ METODY ***********************************
 * PUBLIC:
 *      |MyList()                               -> zakladni konstruktor
 * O(1) |getSize()                              -> ziskani velikosti Listu
 * O(1) |boolean isEmpty()                      -> je pole prazdne?
 * O(1) |void add(T)                            -> vlozeni objektu
 * O(1) |void insertAfter(ListIterator<T>, T)   -> vlozti za ukazatel
 * O(1) |void clear()                           -> smazat List
 * O(n) |T find(String x)                       -> nalezeni prvku v List
 * O(n) |String toString()                      -> vypis Listu
 * 
 * ABOUT:
 * @author    Petr Tarant
 * @version   1.00.000
 * @since     17.2.2011
 ******************************************************************************/
public class MyList<T>{

    /***************************************************************************
     * Atributy instancí
     **************************************************************************/
    // hlava listu - ukazuje na prvni prvek a odkazuje se na nej posledni prvek
    private ListItem head = new ListItem();
    // velikost Listu
    private int size;

    /***************************************************************************
     * Konstruktory a tovární metody
     **************************************************************************/
    /***************************************************************************
     * KONSTRUKTOR
     * Konstruktor pro vytvoreni instance MyList. Prazdny list obsahuje pouze
     * objekt head, ktery parametry next a prev odkazuje sam na sebe.
     * Velikost listu je pouze s prvekm Head 0.
     */
    public MyList() {
        this.head.next = head;
        this.head.prev = head;
        size = 0;
    }

    /***************************************************************************
     * Přístupové metody vlastností instancí
     **************************************************************************/
    /***************************************************************************
     * Getter pro sizskani velikosti pole
     * @return size velikost pole
     */
    public int getSize() {
        return size;
    }

    /***************************************************************************
     * Ostatní nesoukromé metody instancí
     **************************************************************************/
    /***************************************************************************
     * Metoda pro zjisteni, zda je pole prazdne
     * @return true pokus je pole prazdne, false pokud obsahuje prvek
     */
    public boolean isEmpty() {
        return head.next == head;
    }
    
    /***************************************************************************
     * Metoda vrati ukazatel na nulty prvek
     * @return iterator na prvni prvek
     */
    public  Iterator zeroth() {
        return new TransactionIterator(head);
    }
    
    /***************************************************************************
     * Metoda vrati ukazatel na prvni prvek
     * @return iterator na prvni prvek
     */
    public  Iterator first() {
        return new TransactionIterator(head.next);
    }     

    /***************************************************************************
     * Metoda pro pridani prvku. Prvek je pridan na konec Listu
     * @param x prvek typu T, ktery chceme vlozit do List
     */
    public void add(T x) {
        insertAfter(head.prev, x);
    }

    /***************************************************************************
     * Metoda pro pridani prvku za ukazatel. Ukazatel ukazuje pred prvek
     * @param iterator Ukazatel pred prvek
     * @param x prvek typu T, ktery chceme vlozit do List
     */
    public void insertAfter(ListItem<T> iterator, T x) {
        // obaleni x do ListItem
        ListItem<T> item = new ListItem<T>(x);

        //nastaveni vazeb novemu prvku
        item.next = iterator.next;
        item.prev = iterator;

        //zmena stavajicich vazeb na novy item
        iterator.next.prev = item;
        iterator.next = item;

        // Navyseni velikosti Listu
        size++;
    }

    /***************************************************************************
     * Metoda pro smazani Listu. Zmenime ukazatele prvku head sam na sebe,
     * tim smazeme vazby z ostatnich prvku a ty se smazou.
     */
    public void clear() {
        head.next = head;
        head.prev = head;
    }

    /***************************************************************************
     * Metoda pro nalezeni prvku v listu
     * @param x prvek ktery hledame
     * @return nalezeny prvek, nebo null kdyz nic nenajdeme;
     */    
    public T find(T x) {
        ListItem<T> itr = head.next;
        for (; itr != head; itr = itr.next) {
            if(itr.value.equals(x)){
                return itr.value;
            }
        }
        if (itr == head){
            System.out.println("Account neexistuje");
        }
        return itr.value;
    }

    /***************************************************************************
     * Metoda pro vypis Listu
     * @return s vypis pole.
     */
    @Override
    public String toString() {
        String s = "";
        if (isEmpty()) {
            System.out.println("Banka neobsahuje zadne ucty");
        }
        for (ListItem<T> node = head.next; node != head; node = node.next) {
            s += node.value + " ";
        }
        return "[ " + s + "]";
    }
    /***************************************************************************
     * Testovací metody a třídy
     **************************************************************************/
    /************************************************************************
     * Testovací metoda.
     */
//    public static void test(){
//        MyList instance = new MyList();
//    }
//
//    /** @param args Parametry příkazového řádku - nepoužívané. */
//    public static void main(String[] args){
//        test();
//    }
}
