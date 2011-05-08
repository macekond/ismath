package cz.cvut.fel.archval.integration.register;

import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.register.OperatorsRegisterIface;
import java.util.Collection;
import java.util.HashMap;
import org.openide.util.Lookup;

/**
 * OperatorsRegisterIface implementation. Implemented as a singleton.
 * 
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class OperatorsRegister implements OperatorsRegisterIface {

    private HashMap<String, OperatorIface> operatorMap;
    private static OperatorsRegister instance;

    private OperatorsRegister() throws AmbiguousOperatorsFoundException {
        operatorMap = new HashMap<String, OperatorIface>();
        Collection<? extends OperatorIface> allOperators = Lookup.getDefault().lookupAll(OperatorIface.class);
        for (OperatorIface op : allOperators) {
            if (operatorMap.containsKey(op.getName())) {
                throw new AmbiguousOperatorsFoundException("Two operators with"
                        + "the same (" + op.getName() + ") name are loaded. "
                        + "Can't continue.");
            }
            operatorMap.put(op.getName(), op);
        }
    }

    public static OperatorsRegister getInstance() throws AmbiguousOperatorsFoundException {
        if (instance == null) {
            instance = new OperatorsRegister();
        }
        return instance;
    }

    public OperatorIface getOperatorByName(String name) {
        return operatorMap.get(name);
    }
}
