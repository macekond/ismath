package cz.cvut.fel.taranpe1.sw.list;

/*******************************************************************************
 * ITERATOR
 * 
 * Interface Iterator definuje, jake tridy se smi povazovat za Iterator.
 * Jedna se o implementaci Iterator patternu
 * 
 * ABOUT:
 * @author    Petr Tarant
 * @version   1.00.000
 * @since     3.4.2011
 ******************************************************************************/
public interface Iterator {
    // test nulovosti prvku
    public boolean isValid();
    // vrati hodnotu aktualniho prvku
    public Object retrieve();
    // existence dalsiho prvku
    public boolean hasNext();
    // skok na dalsi prvek   
    public void next();
}
