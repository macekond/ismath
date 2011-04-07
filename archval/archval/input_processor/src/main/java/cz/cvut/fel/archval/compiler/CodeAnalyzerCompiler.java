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
package cz.cvut.fel.archval.compiler;

import cz.cvut.fel.archval.compiler.ex.UserProcessingCodeException;
import cz.cvut.fel.archval.compiler.ex.FailedToCompileFilesException;
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
 * Compiles files supplied by parameter.
 *
 * This class is important entry point. In this class multiple annotation
 * processors can be plugged into compiler. Within these processors, various
 * static analysis tasks can be performed.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class CodeAnalyzerCompiler {

    private JavaCompiler compiler;
    private StandardJavaFileManager fileManager;
    private List<AbstractProcessor> processors;

    /**
     * Constructs CodeAnalyzerCompiler class instance
     */
    public CodeAnalyzerCompiler() {
        compiler = ToolProvider.getSystemJavaCompiler();
        fileManager = compiler.getStandardFileManager(null, null, null);
        processors = new LinkedList<AbstractProcessor>();
    }

    /**
     * Adds annotation processor to the compiler.
     *
     * @param processor AbstractProcessor subclass to be used as processor
     */
    public void addProcessor(AbstractProcessor processor) {
        processors.add(processor);
    }

    /**
     * Compiles files supplied as parameter
     *
     * @param files contains all files which are part of some project and are to be compiled
     * @return true if all tasks have been successfully compiled, false otherwise
     */
    public void compileFiles(Iterable<File> files) throws FailedToCompileFilesException, UserProcessingCodeException {

        // constructing compilation task
        Iterable<? extends JavaFileObject> compilationUnits1 = fileManager.getJavaFileObjectsFromFiles(files);
        CompilationTask task = compiler.getTask(null, fileManager, null, null, null, compilationUnits1);

        // plugging custom annotation processor into compiler
        if (processors.size() > 0) {
            task.setProcessors(processors);
        }

        // invoking compilation
        try {
            if (task.call() != true) {
                // TODO: add more information about error to the exception data
                // TODO: make access to compiler output object and write
                // compiler output to the console
                throw new FailedToCompileFilesException(
                        "Some error occurred when compiling files");
            }
        } catch (RuntimeException e) {
            UserProcessingCodeException userProcessingCodeException =
                    new UserProcessingCodeException();
            userProcessingCodeException.setUserCodeException(e.getCause());
            throw userProcessingCodeException;
        }
    }
}
