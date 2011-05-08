package cz.cvut.fel.archval.integration.register;

import cz.cvut.fel.archval.core.api.analysis.AnalysisIface;
import cz.cvut.fel.archval.core.api.register.AnalysesRegisterIface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.openide.util.Lookup;

/**
 * AnalysesRegisterIface implementation.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class AnalysesRegister implements AnalysesRegisterIface {

    private HashMap<String, AnalysisIface> analysesMap;
    private static AnalysesRegister instance;

    private AnalysesRegister() throws DuplicateAnalysisNameException {
        analysesMap = new HashMap<String, AnalysisIface>();
        Collection<? extends AnalysisIface> analyses =
                Lookup.getDefault().lookupAll(AnalysisIface.class);
        for (AnalysisIface analysis : analyses) {
            if (analysesMap.containsKey(analysis.getAnalysisName())) {
                throw new DuplicateAnalysisNameException("Two analysis with "
                        + "same name (" + analysis.getAnalysisName()
                        + ") found in the system. Can't "
                        + "continue.");
            }
            analysesMap.put(analysis.getAnalysisName(), analysis);
        }

    }

    public static AnalysesRegister getInstance() throws DuplicateAnalysisNameException {
        if (instance == null) {
            instance = new AnalysesRegister();
        }
        return instance;
    }

    public List<AnalysisIface> getAnalysesList() {
        return new ArrayList<AnalysisIface>(analysesMap.values());
    }

    public AnalysisIface getAnalysisByName(String name) {
        return analysesMap.get(name);
    }
}
