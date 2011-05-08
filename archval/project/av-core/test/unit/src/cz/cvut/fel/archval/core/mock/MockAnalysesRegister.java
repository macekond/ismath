package cz.cvut.fel.archval.core.mock;

import cz.cvut.fel.archval.core.api.analysis.AnalysisIface;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import cz.cvut.fel.archval.core.api.model.report.AnalysisResult;
import cz.cvut.fel.archval.core.api.register.AnalysesRegisterIface;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Mock register. Contains some bogus AnalysesIface implementations.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class MockAnalysesRegister implements AnalysesRegisterIface {

    private HashMap<String, AnalysisIface> analyses;

    public MockAnalysesRegister() {
        analyses = new HashMap<String, AnalysisIface>();

        AnalysisIface ai = new AnalysisIface() {

            public String getRequiredGraphType() {
                return "mygraph";
            }

            public String getAnalysisName() {
                return "bogusName";
            }

            @Override
            public AnalysisResult evaluate(Graph graph) {
                return new AnalysisResult();
            }
        };

        analyses.put("analysis1", ai);
        analyses.put("analysis3", ai);
    }

    public List<AnalysisIface> getAnalysesList() {
        return new LinkedList<AnalysisIface>();
    }

    public AnalysisIface getAnalysisByName(String name) {
        return analyses.get(name);
    }
}
