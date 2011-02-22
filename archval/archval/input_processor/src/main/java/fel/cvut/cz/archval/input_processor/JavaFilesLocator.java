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
