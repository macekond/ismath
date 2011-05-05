package cz.cvut.fel.archval.integration.register;

import cz.cvut.fel.archval.core.api.analysis.AnalysisIface;
import cz.cvut.fel.archval.core.api.register.AnalysesRegisterIface;
import java.util.List;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class AnalysesRegister implements AnalysesRegisterIface {

    @Override
    public List<AnalysisIface> getAnalysesList() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public AnalysisIface getAnalysisByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
