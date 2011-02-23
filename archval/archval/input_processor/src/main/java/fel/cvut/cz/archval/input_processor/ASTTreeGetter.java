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
package fel.cvut.cz.archval.input_processor;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.processing.AbstractProcessor;
import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 *
 * Compiles files supplied by parameter
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ASTTreeGetter {
    
    /*
    private Trees trees;

    @Override
    public void init(ProcessingEnvironment pe) {
        super.init(pe);
        trees = Trees.instance(pe);
    }
*/
    public void compileSourceFiles(Iterable<File> files) {

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> compilationUnits1 = fileManager.getJavaFileObjectsFromFiles(files);
        CompilationTask task = compiler.getTask(null, fileManager, null, null, null, compilationUnits1);
        List<AbstractProcessor> processors = new LinkedList<AbstractProcessor>();
        processors.add(new CodeAnalyzerProcessor());
        task.setProcessors(processors);
        task.call();

        // TODO: handle exceptions
        // TODO: obtain resulting AST from CodeAnalyzerProcessor
    }
}
