package cz.cvut.fel.archval.hidden_violation;

/**
 * Access to class returned by some method.
 *
 */
public class HiddenViolation {

    private SecondClass secondClass;

    public HiddenViolation returnThis() {
        return this;
    }

    public void evaluate() {
        // hidden LoD violation
        HiddenViolation a = returnThis();

        a.returnThis().returnThis(); // this is still OK

        // this is still ok
        SecondClass sc = a.returnThis().secondClass;

        // let other method process third class - OK
        process(sc.getThirdClass());

        sc.getThirdClass().getName(); // Violation
    }

    public void process(ThirdClass tc) {

    }
}
