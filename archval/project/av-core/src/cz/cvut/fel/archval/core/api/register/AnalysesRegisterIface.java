package cz.cvut.fel.archval.core.api.register;

import cz.cvut.fel.archval.core.api.analysis.AnalysisIface;
import java.util.List;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface AnalysesRegisterIface {

    public List<AnalysisIface> getAnalysesList();

    /**
     * Returns analysis class by it's name. If multiple implementors are found
     * only first is returned. If no instance is found, nul is returned.
     *
     * @param name name of the analysis to be found
     * @return instance implementing AnalysisIface which matches the name
     */
    public AnalysisIface getAnalysisByName(String name);
}
