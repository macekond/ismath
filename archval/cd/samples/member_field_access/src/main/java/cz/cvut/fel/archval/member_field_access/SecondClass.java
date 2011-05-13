/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fel.archval.member_field_access;

/**
 *
 * @author martin
 */
public class SecondClass {

    public ThirdClass thirdClass;

    public ThirdClass getThirdClass() {
        return thirdClass;
    }

    public void setThirdClass(ThirdClass thirdClass) {
        this.thirdClass = thirdClass;
    }
}
