/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.cvut.fel.taranpe1.sw.banka;
/*******************************************************************************
 * ACCOUNTEXCEPTION
 * 
 * Instance třídy AccountException predavaji hlaseni o chybach tride Exception
 * Trida je pro zachytavani vyjimek v programu.
 * 
 * ********************************** METODY ***********************************
 * PUBLIC:
 * AccountException(Throwable)        -> konstruktor pro pripad
 * AccountException(Throwable)        -> konstruktor pro zpravy
 * // getters and setters nejsou treba
 * // konstruktory jsou pretezovane podle parametru
 * 
 * ABOUT:
 * @author    Petr Tarant
 * @version   1.00.000
 * @since     4.4.2010
 ******************************************************************************/
public class AccountException  extends RuntimeException {

    /***************************************************************************
     * Konstruktory a tovární metody
     **************************************************************************/
    /***************************************************************************
     * KONSTRUKTOR
     * Pri vlozeni pripadu ze zavola tento konstruktor
     * @param cause parametrem je pripad, ktery se stal
     */
    public AccountException(Throwable cause) {
        super(cause);
    }

    /***************************************************************************
     * KONSTRUKTOR
     * Pri vlozeni spravy se zavola tento konstruktor
     * @param message zprava poslana uzivateli
     */
    public AccountException(String message) {
        super(message);
    }
}
