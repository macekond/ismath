///*
// *  The MIT License
// *
// *  Copyright 2011 martin.
// *
// *  Permission is hereby granted, free of charge, to any person obtaining a copy
// *  of this software and associated documentation files (the "Software"), to deal
// *  in the Software without restriction, including without limitation the rights
// *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// *  copies of the Software, and to permit persons to whom the Software is
// *  furnished to do so, subject to the following conditions:
// *
// *  The above copyright notice and this permission notice shall be included in
// *  all copies or substantial portions of the Software.
// *
// *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// *  THE SOFTWARE.
// */
//package cz.cvut.fel.archval.legacy.action;
//
//import cz.cvut.fel.archval.filesystem.JavaFilesLocator;
//import java.awt.EventQueue;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//import java.util.LinkedList;
//import java.util.List;
//import javax.swing.JFileChooser;
//import org.netbeans.api.java.source.ClasspathInfo;
//import org.netbeans.api.java.source.JavaSource;
//import org.openide.filesystems.FileChooserBuilder;
//import org.openide.filesystems.FileObject;
//import org.openide.filesystems.FileUtil;
//import org.openide.windows.IOProvider;
//import org.openide.windows.InputOutput;
//import org.openide.windows.WindowManager;
//
//public final class LoadProjectAction implements ActionListener {
//
//    public void actionPerformed(ActionEvent e) {
//        EventQueue.invokeLater(new Runnable() {
//
//            @Override
//            public void run() {
//
//                // initialize output window
//                InputOutput io = IOProvider.getDefault().getIO("File search", true);
//                io.select();
//
//                // start in user home directory
//                File initialDirectory = new File(
//                        System.getProperty("user.home")
//                        + File.separator + "lib");
//
//                FileChooserBuilder fileChooserBuilder = new FileChooserBuilder(
//                        "LoadProjectAction");
//                fileChooserBuilder.setTitle("Load project");
//                fileChooserBuilder.setDefaultWorkingDirectory(initialDirectory);
//                fileChooserBuilder.setApproveText("Load");
//                fileChooserBuilder.setDirectoriesOnly(true);
//                JFileChooser jfc = fileChooserBuilder.createFileChooser();
//
//                if (jfc.showOpenDialog(WindowManager.getDefault().getMainWindow())
//                        != JFileChooser.APPROVE_OPTION) {
//                    return; // nothing to do
//                }
//
//                // process the selected directory
//                File directory = jfc.getSelectedFile();
//                io.getOut().println("Searching files in directory '"
//                        + directory.getAbsolutePath() + "'...");
//
//                // list all java files
//                JavaFilesLocator jfl = new JavaFilesLocator();
//                List<File> fl = jfl.getProjectJavaFiles(directory);
//
//                // convert files to FileObjects
//                List<FileObject> fos = new LinkedList<FileObject>();
//
//                // print all found java files to the output window
//                for (File file : fl) {
//                    fos.add(FileUtil.toFileObject(file));
//                }
//                JavaSource js = JavaSource.create(ClasspathInfo.create(directory), fos);
//                io.getOut().println("java source object is: " + js);
//
//                // close output window streams
//                io.getOut().close();
//                io.getErr().close();
//            }
//        });
//
//    }
//}
