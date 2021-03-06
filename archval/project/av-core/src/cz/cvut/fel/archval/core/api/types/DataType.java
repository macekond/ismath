package cz.cvut.fel.archval.core.api.types;

/**
 * Represents enumeration of all types supported by the evaluation system.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public enum DataType {

    BOOLEAN, // Object instanceof Boolean
    VERTEX_SET, // Object instanceof Set<Vertex>
    EDGE_SET, // Object instanceof Set<Edge>
    VERTEX, // Object instanceof Vertex
    EDGE, // Object instanceof Edge
    NUMBER, // Object instanceof Integer
    LABEL, // Object instanceof String
    UNKNOWN // Object is of uknonwn type (usually signifies error)
}
