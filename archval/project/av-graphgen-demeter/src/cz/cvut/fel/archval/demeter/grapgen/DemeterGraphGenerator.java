package cz.cvut.fel.archval.demeter.grapgen;

import cz.cvut.fel.archval.core.api.graphgen.GraphGeneratorIface;
import cz.cvut.fel.archval.core.api.model.graph.Graph;
import java.io.File;

/**
 * Graph which generates graph suitable for LoD analysis based on specified
 * project directory. The project directory may contain some prebuilt (or 
 * hand generated) version of the graph, which can be directly used.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class DemeterGraphGenerator implements GraphGeneratorIface {

    public String getGraphType() {
        return "demeter_graph";
    }

    public Graph getGraph(File projectDirectory) {
        // TODO: implement real or bogus demeter graph generator
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
