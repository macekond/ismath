package cz.cvut.fel.taranpe1.task1;

/*******************************************************************************
 * Zadani: 
 * Napi�te t��du homework.Homework1, kter� m� n�sleduj�c� ve�ejn� metody: 
 * boolean f(), boolean g() a int h(). f vrac� true, g vrac� false a h vrac� 
 * kolikr�t byla na dan� instanci zavol�na (tzn. p�i prvn�m vol�n� vr�t� 1, 
 * p�i druh�m 2 atd.).
 *
 * @author    Petr Tarant
 * @version   1.00.000
 */
public class Homework1 {

    /***************************************************************************
     * Atributy instanc�
     **************************************************************************/
    // pocitadlo, kolik se zavolala metoda h()
    private int count;
    /***************************************************************************
     * Konstruktory a tov�rn� metody
     **************************************************************************/
    /***************************************************************************
     * Vytvoreni instance Homework1
     */
    public Homework1() {
        this.count = 0;
    }
    /***************************************************************************
     * Ostatn� nesoukrom� metody instanc�
     **************************************************************************/
    public boolean f(){
        return true;
    }
    
    public boolean g(){
        return false;
    }
    
    public int h(){
        System.out.println("Volani cislo:" + (++count));
        return count;
    }
    /***************************************************************************
     * Testovac� metody a t��dy
     **************************************************************************/

     /************************************************************************
      * Testovac� metoda.
      */
//     public static void test()
//     {
//         Homework1 instance = new Homework1();
//         Homework1 instance2 = new Homework1();
//         instance.f();
//         instance.g();
//         instance.h();
//         instance.h();
//         System.out.println("Instance 2");
//         instance2.h();
//     }
//     /** @param args Parametry p��kazov�ho ��dku - nepou��van�. */
//     public static void main(String[] args)  {  test();  }
}
