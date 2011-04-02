/*
 *  The MIT License
 * 
 *  Copyright 2011 Martin Vejmelka (martin.vejmelka@fel.cvut.cz).
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package cz.cvut.fel.archval.graph;

import java.util.List;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class Vertex {

    private List<Edge> incomingEdges;
    private List<Edge> outgoingEdges;
    private String name;

    /**
     *
     * @return
     */
    public List<Edge> getIncomingEdges() {
        return incomingEdges;
    }

    /**
     *
     * @param incomingEdges
     */
    public void setIncomingEdges(List<Edge> incomingEdges) {
        this.incomingEdges = incomingEdges;
    }

    /**
     *
     * @return
     */
    public List<Edge> getOutgoingEdges() {
        return outgoingEdges;
    }

    /**
     *
     * @param outgoingEdges
     */
    public void setOutgoingEdges(List<Edge> outgoingEdges) {
        this.outgoingEdges = outgoingEdges;
    }

    /**
     * Returns name of this vertex element.
     * @return name of this vertex element
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of this vertex element.
     * @param name the name of graph element (e. g. class name, method name, etc.)
     */
    public void setName(String name) {
        this.name = name;
    }
}
