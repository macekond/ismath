package cz.cvut.fel.archval.oldsource;

import com.sun.source.tree.ClassTree;
import com.sun.source.util.TreePathScanner;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.swing.JFileChooser;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.api.java.classpath.GlobalPathRegistry;
import org.netbeans.api.java.source.ClasspathInfo;
import org.netbeans.api.java.source.CompilationController;
import org.netbeans.api.java.source.CompilationInfo;
import org.netbeans.api.java.source.JavaSource;
import org.netbeans.api.java.source.JavaSource.Phase;
import org.netbeans.api.java.source.Task;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileChooserBuilder;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.Exceptions;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.WindowManager;

public final class LoadProjectAction implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

                StatusDisplayer.getDefault().setStatusText("Running compilation.");

                // initialize output window
                final InputOutput io = IOProvider.getDefault().getIO("File search", true);
                io.select();

                // start in user home directory
                File initialDirectory = new File(
                        System.getProperty("user.home")
                        + File.separator + "lib");

                FileChooserBuilder fileChooserBuilder = new FileChooserBuilder(
                        "LoadProjectAction");
                fileChooserBuilder.setTitle("Load project");
                fileChooserBuilder.setDefaultWorkingDirectory(initialDirectory);
                fileChooserBuilder.setApproveText("Load");
                fileChooserBuilder.setDirectoriesOnly(true);
                JFileChooser jfc = fileChooserBuilder.createFileChooser();

                if (jfc.showOpenDialog(WindowManager.getDefault().getMainWindow())
                        != JFileChooser.APPROVE_OPTION) {
                    return; // nothing to do
                }

                // process the selected directory
                File directory = jfc.getSelectedFile();
                io.getOut().println("Searching files in directory '"
                        + directory.getAbsolutePath() + "'...");

                // list all java files
                JavaFilesLocator jfl = new JavaFilesLocator();
                List<File> fl = jfl.getProjectJavaFiles(directory);

                List<FileObject> fos = new LinkedList<FileObject>();

                // print all found java files to the output window
                for (File file : fl) {
                    fos.add(FileUtil.toFileObject(file));
                    io.getErr().println("file://" + file.getAbsolutePath());
                }
                ClasspathInfo cpi = ClasspathInfo.create(directory);
                JavaSource js = JavaSource.create(cpi, fos);
                io.getOut().println("BOOT: " + js.getClasspathInfo().getClassPath(ClasspathInfo.PathKind.BOOT));
                io.getOut().println("COMPILE: " + js.getClasspathInfo().getClassPath(ClasspathInfo.PathKind.COMPILE));
                io.getOut().println("SOURCE: " + js.getClasspathInfo().getClassPath(ClasspathInfo.PathKind.SOURCE));
               
                GlobalPathRegistry.getDefault().register(ClassPath.SOURCE, new ClassPath[] {cpi.getClassPath(ClasspathInfo.PathKind.SOURCE)});

                try {
                    js.runWhenScanFinished(new Task<CompilationController>() {

                        @Override
                        public void run(CompilationController compilationController) throws Exception {

                            compilationController.toPhase(Phase.RESOLVED);

                            if (compilationController.getCompilationUnit() != null) {
                                io.getOut().println("Performing scan:");
                                new MemberVisitor(compilationController).scan(compilationController.getCompilationUnit(), null);
                            } else {
                                io.getOut().println("Can't open the file.");
                                StatusDisplayer.getDefault().setStatusText("Can't open the file!");
                            }

                            StatusDisplayer.getDefault().setStatusText(
                                    compilationController.getCompilationUnit().getSourceFile().getName());

                            List<? extends TypeElement> elements = compilationController.getTopLevelElements();
                            for (TypeElement typeElement : elements) {
                                io.getOut().println(typeElement.getQualifiedName());
                                io.getOut().println("testing supertype package: ");
                                String packageName = compilationController.getElements().getPackageOf(((DeclaredType) typeElement.getSuperclass()).asElement()).getQualifiedName().toString();
                                io.getOut().println(packageName);
                            }

                        }
                    }, true);



                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }


                // TODO: handle if js is null (invalid input maybe)
                io.getOut().println("Done.");

                // close output window streams
                io.getOut().close();
                io.getErr().close();
            }
        });



    }

    private static class MemberVisitor extends TreePathScanner<Void, Void> {

        private CompilationInfo info;

        public MemberVisitor(CompilationInfo info) {
            this.info = info;
        }

        @Override
        public Void visitClass(ClassTree t, Void v) {


            Element el = info.getTrees().getElement(getCurrentPath());
            if (el == null) {
                StatusDisplayer.getDefault().setStatusText("Cannot resolve class!");
            } else {

                TypeElement te = (TypeElement) el;


                InputOutput io = IOProvider.getDefault().getIO("Analysis of "
                        + info.getFileObject().getName(), true);

                io.getOut().println("kind is: " + te.getSuperclass().getKind());

                if (te.getSuperclass().getKind() == TypeKind.DECLARED) {
                    String superTypeQualifiedName = ((TypeElement) (((DeclaredType) te.getSuperclass()).asElement())).getQualifiedName().toString();
                    io.getOut().println(superTypeQualifiedName);
                }


                List enclosedElements = te.getEnclosedElements();

//                io.getOut().println("current class: " + te.getQualifiedName());
//
//                io.getOut().println("enclosing element is: " + te.getEnclosingElement().getSimpleName());
//
//                List<? extends TypeMirror> directSupertypes = info.getTypes().directSupertypes(te.asType());
//                for (TypeMirror typeMirror : directSupertypes) {
//                    io.getOut().println("nextone");
//                    io.getOut().println(((TypeElement) ((DeclaredType) typeMirror).asElement()).getQualifiedName());
//                    TypeElement superEl = (TypeElement) ((DeclaredType) typeMirror).asElement();
//                    io.getOut().println("nesting element of super is: " + superEl.getEnclosingElement().getSimpleName());
//                }





                // io.getOut().println("superclass: package: " + ((PackageElement) superEl.getEnclosingElement()).getQualifiedName() + " and name: " + superEl.getQualifiedName());

                for (int i = 0; i < enclosedElements.size(); i++) {
                    Element enclosedElement = (Element) enclosedElements.get(i);
                    if (enclosedElement.getKind() == ElementKind.CONSTRUCTOR) {
                        io.getOut().println("Constructor: "
                                + enclosedElement.getSimpleName());
                    } else if (enclosedElement.getKind() == ElementKind.METHOD) {
                        io.getOut().println("Method: "
                                + enclosedElement.getSimpleName());
                    } else if (enclosedElement.getKind() == ElementKind.FIELD) {
                        io.getOut().println("Field: "
                                + enclosedElement.getSimpleName());
                    } else {
                        io.getOut().println("Other: "
                                + enclosedElement.getSimpleName());
                    }
                }
                io.getOut().close();
            }
            return null;
        }
    }
}
