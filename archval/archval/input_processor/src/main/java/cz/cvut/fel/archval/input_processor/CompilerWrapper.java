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
package cz.cvut.fel.archval.input_processor;

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
public class CompilerWrapper {

    private JavaCompiler compiler;
    private StandardJavaFileManager fileManager;

    public CompilerWrapper() {
        compiler = ToolProvider.getSystemJavaCompiler();
        fileManager = compiler.getStandardFileManager(null, null, null);

    }

    public void compileFiles(Iterable<File> files) {

        // constructing compilation task
        Iterable<? extends JavaFileObject> compilationUnits1 = fileManager.getJavaFileObjectsFromFiles(files);
        CompilationTask task = compiler.getTask(null, fileManager, null, null, null, compilationUnits1);

        // plugging custom annotation processor into compiler
        List<AbstractProcessor> processors = new LinkedList<AbstractProcessor>();
        processors.add(new CodeAnalyzerProcessor());
        task.setProcessors(processors);

        // invoking compilation
        try {
            boolean taskResult = task.call();
            // TODO: if taskResult is false, some files weren't compiled successfully
        } catch (Exception e) {
            // TODO: handle some fatal error in user code in compiler plugins
        }

    }
}
