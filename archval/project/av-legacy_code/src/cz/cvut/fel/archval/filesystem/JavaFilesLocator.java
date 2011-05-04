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
package cz.cvut.fel.archval.filesystem;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Searches all *.java files in directory specified as an argument.
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 * 
 */
public class JavaFilesLocator {

    private List<File> javaFiles;

    /**
     * Constructor for JavaFilesLocator class.
     */
    public JavaFilesLocator() {
        javaFiles = new ArrayList<File>();
    }

    /**
     * Returns all files ending with <code>*.java</code> extensions in List of File objects.
     *
     * @param projectDirectory directory which will be recursively searched for <code>*.java</code> files
     * @return List of File objects
     */
    public List<File> getProjectJavaFiles(String projectDirectory) {
        File dirFile = new File(projectDirectory);
        return getProjectJavaFiles(dirFile);        
    }

    /**
     * Returns all files ending with <code>*.java</code> extension in List
     *
     * @param file File object determinig directory to be searched
     * @return List of File objects
     */
    public List<File> getProjectJavaFiles(File file) {
        javaFiles.clear();
        list(file);
        return javaFiles;
    }

    private void list(File file) {
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            for (File child : children) {
                if (child.getName().endsWith(".java")) {
                    javaFiles.add(child);
                }
                list(child);
            }
        }
    }
}