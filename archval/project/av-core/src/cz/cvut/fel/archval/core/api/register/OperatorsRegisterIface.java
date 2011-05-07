package cz.cvut.fel.archval.core.api.register;

import cz.cvut.fel.archval.core.api.operator.OperatorIface;

/**
 * Important integration interface. Represents list of object implementing
 * OperatorIface interface in the system.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface OperatorsRegisterIface {

    public OperatorIface getOperatorByName(String name);
}
