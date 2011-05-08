package cz.cvut.fel.archval.integration.archval;

import cz.cvut.fel.archval.core.api.ArchVal;
import cz.cvut.fel.archval.integration.register.AmbiguousOperatorsFoundException;
import cz.cvut.fel.archval.integration.register.AnalysesRegister;
import cz.cvut.fel.archval.integration.register.DuplicateAnalysisNameException;
import cz.cvut.fel.archval.integration.register.DuplicateGraphGeneratorException;
import cz.cvut.fel.archval.integration.register.GraphGeneratorsRegister;
import cz.cvut.fel.archval.integration.register.OperatorsRegister;

/**
 * Singleton instance of ArchVal.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ArchvalInstance {

    private static ArchVal instance;

    public static ArchVal getInstance() throws
            DuplicateGraphGeneratorException,
            AmbiguousOperatorsFoundException,
            DuplicateAnalysisNameException {

        if (instance == null) {
            instance = new ArchVal(
                    GraphGeneratorsRegister.getInstance(),
                    OperatorsRegister.getInstance(),
                    AnalysesRegister.getInstance());
        }

        return instance;
    }
}
