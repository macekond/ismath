package cz.cvut.fel.archval.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import org.netbeans.api.java.source.JavaSource;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileObject;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;

public final class ValidateAction implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        StatusDisplayer.getDefault().setStatusText("Starting validation action.");

        final InputOutput io = IOProvider.getDefault().getIO("File search", true);
        io.select();

        Project mainProject = OpenProjects.getDefault().getMainProject();

        if (mainProject == null) {

            io.select();
            io.getOut().println("There is no main project selected.");
            return;
        }
        ProjectInformation projectInformation = ProjectUtils.getInformation(mainProject);
        String projectName = projectInformation.getName();
        String typeString = mainProject.getClass().getName();

        io.getOut().println("The class name for the project is: " + typeString);
        io.getOut().println("Name of the project is: " + projectName);

        Enumeration<? extends FileObject> children = mainProject.getProjectDirectory().getChildren(true);
        for (Enumeration<? extends FileObject> en = children; en.hasMoreElements();) {

            FileObject fo = en.nextElement();
            io.getOut().print("file: " + fo.getName());
            if (fo.isData()) {
                io.getOut().print("    - data objects");
            } else if (fo.isFolder()) {
                io.getOut().print("    - is directory");
            }
            io.getOut().print("mime: " + fo.getMIMEType());
            io.getOut().println(", extension: " + fo.getExt());

            io.getOut().println("getting JavaSource object for " + fo.getName() + " file");

            JavaSource js = JavaSource.forFileObject(fo);
            if (js == null) {
                io.getOut().println("no java source associated");
                io.getOut().println();
            }
            io.getOut().println("found java source");
        }

        StatusDisplayer.getDefault().setStatusText("Done.");
    }
}
