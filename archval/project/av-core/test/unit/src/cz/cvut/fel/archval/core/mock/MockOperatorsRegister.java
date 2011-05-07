package cz.cvut.fel.archval.core.mock;

import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.operator.OperatorIface;
import cz.cvut.fel.archval.core.api.register.OperatorsRegisterIface;
import cz.cvut.fel.archval.core.api.types.DataType;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class MockOperatorsRegister implements OperatorsRegisterIface {

    private HashMap<String, OperatorIface> operators;

    public MockOperatorsRegister() {
    }

    public OperatorIface getOperatorByName(String name) {
        return new OperatorIface() {

            @Override
            public String getName() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public int getOperandsCount() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public DataType getOperandType(int index) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public DataType getReturnType() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public Object execute(Graph graph, List<Object> operands) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
    }
    
}
