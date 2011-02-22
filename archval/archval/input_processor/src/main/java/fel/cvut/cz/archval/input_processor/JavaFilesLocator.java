/*
 *  The MIT License
 *
 *  Copyright 2011 Martin Vejmelka <martin.vejmelka@fel.cvut.cz>.
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

    public JavaFilesLocator() {
        javaFiles = new ArrayList<File>();
    }

    public List<File> getProjectJavaFiles(String directory) {
        javaFiles.clear();
        File dirFile = new File(directory);
        list(dirFile);
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