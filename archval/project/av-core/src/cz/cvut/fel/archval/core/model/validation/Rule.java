package cz.cvut.fel.archval.core.model.validation;

import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import java.util.Set;

/**
 * Abstract class for both atomic and compound rules.
 * 
 * This class can be used to store both atomic and compound rules in one data
 * structure because of polymorphism.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public abstract class Rule {

    public abstract boolean evaluate(GraphModel graphModel);

    public abstract Set<String> getRequiredGraphTypes();
}
