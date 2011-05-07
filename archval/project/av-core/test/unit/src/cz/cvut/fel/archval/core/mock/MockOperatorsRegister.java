package cz.cvut.fel.archval.core.mock;

import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.register.OperatorsRegisterIface;
import cz.cvut.fel.archval.core.mock.operator.EmptyOperator;
import cz.cvut.fel.archval.core.mock.operator.GOperator;
import cz.cvut.fel.archval.core.mock.operator.HasMoreThenOperator;
import cz.cvut.fel.archval.core.mock.operator.SelectorOperator;
import java.util.HashMap;

/**
 * Bogus operators register used for unit testing.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class MockOperatorsRegister implements OperatorsRegisterIface {

    private HashMap<String, OperatorIface> operators;

    public MockOperatorsRegister() {
        operators = new HashMap<String, OperatorIface>();

        HasMoreThenOperator hasMoreThenOperator = new HasMoreThenOperator();
        SelectorOperator selectorOperator = new SelectorOperator();
        EmptyOperator emptyOperator = new EmptyOperator();
        GOperator gOperator = new GOperator();
        operators.put(hasMoreThenOperator.getName(), hasMoreThenOperator);
        operators.put(selectorOperator.getName(), selectorOperator);
        operators.put(emptyOperator.getName(), emptyOperator);
        operators.put(gOperator.getName(), gOperator);
    }

    public OperatorIface getOperatorByName(String name) {
        return operators.get(name);
    }
}
