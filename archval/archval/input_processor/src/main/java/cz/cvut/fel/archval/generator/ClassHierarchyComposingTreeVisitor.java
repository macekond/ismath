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
package cz.cvut.fel.archval.generator;

import com.sun.source.tree.ClassTree;
import com.sun.source.tree.VariableTree;
import com.sun.source.util.TreePathScanner;
import com.sun.source.util.Trees;
import cz.cvut.fel.archval.graph.ClassHierarchyGraph;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ClassHierarchyComposingTreeVisitor extends TreePathScanner<Object, Trees> {

    private ClassHierarchyGraph chg;

    /**
     * Creates ClassHierarchyComposintTreeVisitor instance
     */
    public ClassHierarchyComposingTreeVisitor() {
        chg = new ClassHierarchyGraph();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object visitClass(ClassTree node, Trees p) {

        System.out.println("node name: " + node.getSimpleName());
        System.out.println("kind is: ");
        System.out.println(node.getExtendsClause().getKind());

        return super.visitClass(node, p);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object visitVariable(VariableTree vt, Trees p) {

        Element el = (VariableElement) p.getElement(getCurrentPath());

        if (el.asType().getKind() == TypeKind.DECLARED) {
            System.out.println(((TypeElement) ((DeclaredType) el.asType()).asElement()).getQualifiedName());
        }

        return super.visitVariable(vt, p);
    }

    ClassHierarchyGraph getResultingGraph() {
        return chg;
    }
}
