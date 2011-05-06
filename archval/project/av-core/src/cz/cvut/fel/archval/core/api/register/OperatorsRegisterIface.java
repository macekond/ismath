package cz.cvut.fel.archval.core.api.register;

import cz.cvut.fel.archval.core.api.operator.OperatorIface;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface OperatorsRegisterIface {

    public OperatorIface getOperatorByName(String name);

}
