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

import java.util.ArrayList;
import java.io.File;
import java.net.URL;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class CodeAnalyzerCompilerTest {

    public CodeAnalyzerCompilerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCompilationUnits method, of class CodeAnalyzerCompiler.
     */
    @Test
    public void testCompileFiles() {

        // TODO: use stronger test (test if class prints hello world - modify classpath)
        URL sourceFileUrl = CodeAnalyzerCompilerTest.class.getResource("helloworld/HelloWorld.java");
        URL resultFileUrl = CodeAnalyzerCompilerTest.class.getResource("helloworld/HelloWorld.class");
        try {

            if (resultFileUrl != null) {
                new File(resultFileUrl.getPath()).delete();
            }

            ArrayList<File> files = new ArrayList<File>();
            files.add(new File(sourceFileUrl.getPath()));

            CodeAnalyzerCompiler instance = new CodeAnalyzerCompiler();
            instance.compileFiles(files);

            resultFileUrl = CodeAnalyzerCompilerTest.class.getResource("helloworld/HelloWorld.class");
            Assert.assertTrue(new File(resultFileUrl.getPath()).exists());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}
