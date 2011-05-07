package cz.cvut.fel.archval.core.api.register;

import cz.cvut.fel.archval.core.api.analysis.AnalysisIface;
import java.util.List;

/**
 * Important integration interface. Represents list of object implementing
 * AnalysisInterface in the system.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface AnalysesRegisterIface {

    /**
     * Returns list of all available analysis in the system.
     *
     * @return List object containing all analysis available in the system, if no analysis is found, empty list is returned
     */
    public List<AnalysisIface> getAnalysesList();

    /**
     * Returns analysis class by it's name. If multiple implementors are found
     * only first is returned. If no instance is found, null is returned.
     *
     * @param name name of the analysis to be found
     * @return instance implementing AnalysisIface which matches the name
     */
    public AnalysisIface getAnalysisByName(String name);
}
