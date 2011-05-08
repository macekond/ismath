package cz.cvut.fel.archval.integration.action;

import cz.cvut.fel.archval.core.api.ValidationModelIface;
import cz.cvut.fel.archval.integration.avd.AvdCookie;
import cz.cvut.fel.archval.integration.register.AmbiguousOperatorsFoundException;
import cz.cvut.fel.archval.integration.register.DuplicateGraphGeneratorException;
import cz.cvut.fel.archval.integration.register.GraphGeneratorsRegister;
import cz.cvut.fel.archval.integration.register.OperatorsRegister;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import org.netbeans.api.java.source.JavaSource;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileObject;
import org.openide.util.Exceptions;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;

public final class ValidateMainProject implements ActionListener {

    private final AvdCookie avdCookie;

    public ValidateMainProject(AvdCookie context) {
        this.avdCookie = context;
    }

    public void actionPerformed(ActionEvent ev) {
        OperatorsRegister instance;
        try {
            instance = OperatorsRegister.getInstance();
        } catch (AmbiguousOperatorsFoundException ex) {
            System.out.println("Exception here!!!");
            Exceptions.printStackTrace(ex);
            System.out.println("Exthere!");
        }
        
        Set<String> avaliableGeneratorTypes = new HashSet<String>();
        try {
            avaliableGeneratorTypes = GraphGeneratorsRegister.getInstance().getAvaliableGeneratorTypes();
        } catch (DuplicateGraphGeneratorException ex) {
            Exceptions.printStackTrace(ex);
        }
        for (String string : avaliableGeneratorTypes) {
            System.out.println("graph type: " + string);
        }

        ValidationModelIface validationModel = avdCookie.getValidationModel();

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
