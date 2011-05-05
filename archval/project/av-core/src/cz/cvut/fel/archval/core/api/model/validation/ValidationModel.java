package cz.cvut.fel.archval.core.api.model.validation;

import cz.cvut.fel.archval.core.api.analysis.AnalysisIface;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ValidationModel {

    private List<AnalysisIface> analyses;

    public ValidationModel() {
        analyses = new LinkedList<AnalysisIface>();
    }

    public void addAnalysis(AnalysisIface analysis) {
        analyses.add(analysis);
    }
}
