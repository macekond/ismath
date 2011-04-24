package cz.cvut.fel.taranpe1.sw.list;

/*******************************************************************************
 * LISTITEM
 * 
 * Instance třídy ListItem představují nejjednodussi prvky v abstraktni
 * strukture MyList.
 * Data ulozena v ListItem jdou typu <T> MyList muze byt list cehokoliv
 * 
 *********************************** ATRYBUTY **********************************
 * PUBLIC:
 * ListItem<T> next  -> ukazatel na dalsi prvek v MyList
 * ListItem<T> prev  -> ukazatel na predchozi prvek v MyList
 * T value           -> data ulozena v ListItem
 * 
 * ********************************** METODY ***********************************
 * PUBLIC:
 * ListItem()        -> zakladni konstruktor
 * ListItem(T)       -> konstruktor se zakladnim parametrem
 * // getters and setters nejdou treba protoze atributy jsou public
 * 
 * ABOUT:
 * @author    Petr Tarant
 * @version   1.00.000
 * @since     17.2.2010
 ******************************************************************************/
public class ListItem<T> {

    /***************************************************************************
     * Atributy instancí
     **************************************************************************/
    public ListItem<T> next;
    public ListItem<T> prev;
    public T value;

    /***************************************************************************
     * Konstruktory a tovární metody
     **************************************************************************/
    /***************************************************************************
     * ZAKLADNI KONSTRUKTOR
     * Vytvoreni instance ListItem. Prvek v MyList.
     * Parametry next, prev a value jsou nastaveny na null;
     */
    public ListItem() {
        this(null);
    }

    /***************************************************************************
     * KONSTRUKTOR S PARAMETREM
     * Vytvoreni instance ListItem. Prvek v MyList.
     * Parametry next a prev jsou nastaveny na null;
     * @param value hodnota ulozena v instanci ListItem.
     */
    public ListItem(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    } 
    
   

    /***************************************************************************
     * Metoda pro popis ListItem prvku
     * @return string - hodnota ListItem prvku
     */
    @Override
    public String toString() {
        return "" + value;
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
//         ListItem instance = new ListItem();
//     }
//     /** @param args Parametry příkazového řádku - nepoužívané. */
//     public static void main(String[] args)  {  test();  }
}
