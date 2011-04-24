/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fel.taranpe1.sw.list;

/**
 *
 * @author Petr
 */
public class TransactionIterator<T> implements Iterator {

    ListItem<T> current;

    public TransactionIterator(ListItem<T> current) {
        this.current = current;
    }

    public boolean isValid() {
        return current.value != null;
    }

    public T retrieve() {
        return isValid() ? current.value : null;
    }

    public boolean hasNext() {
        return current.next != null ? true : false;
    }

    public void next() {
        if(isValid()){
            current = current.next;
        }
    }

    @Override
    public String toString() {
        return current + "";
    }
    
}
