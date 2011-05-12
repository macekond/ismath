package cz.cvut.fel.archval.member_field_access;

/**
 * Access to class returned by some method.
 *
 */
public class MemberFieldAccess {

    private SecondClass secondClass;

    public void evaluate() {

        // this method should't have knowledge about internal structure
        // of class ThirdClass
        secondClass.thirdClass.getName();
    }

}
