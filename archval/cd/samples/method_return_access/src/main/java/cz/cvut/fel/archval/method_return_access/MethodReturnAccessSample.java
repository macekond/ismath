package cz.cvut.fel.archval.method_return_access;

/**
 * Access to class returned by some method.
 *
 */
public class MethodReturnAccessSample {

    private SecondClass secondClass;

    public void evaluate() {

        // this method should't have knowledge about internal structure
        // of class ThirdClass
        secondClass.getThirdClass().getName();
    }

}
