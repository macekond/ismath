package cz.cvut.fel.archval.core.api.register;

import cz.cvut.fel.archval.core.api.operator.OperatorIface;

/**
 * Important integration interface. Represents list of object implementing
 * OperatorIface interface in the system.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface OperatorsRegisterIface {

    /**
     * Returns OperatorIface instance by supplied name.
     * @param name name of the operator to be found
     * @return OperatorIface instance or null if no such operator is found
     */
    public OperatorIface getOperatorByName(String name);
}
