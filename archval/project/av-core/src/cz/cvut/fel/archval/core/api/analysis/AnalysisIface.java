package cz.cvut.fel.archval.core.api.analysis;

import cz.cvut.fel.archval.core.api.model.report.AnalysisResult;

/**
 * Analysis interface to be implemented by analysis provider.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public interface AnalysisIface {

    public String getAnalysisName();

    public String getRequiredGraphType();

    public AnalysisResult evaluate();
}
