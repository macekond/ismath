package cz.cvut.fel.archval.integration.action;

import cz.cvut.fel.archval.core.api.ArchVal;
import cz.cvut.fel.archval.core.api.ValidationModelIface;
import cz.cvut.fel.archval.core.api.ValidationTaskIface;
import cz.cvut.fel.archval.core.api.ex.GraphGeneratorNotFoundException;
import cz.cvut.fel.archval.core.api.ex.OperatorMismatchException;
import cz.cvut.fel.archval.core.api.ex.OperatorNotFoundException;
import cz.cvut.fel.archval.core.api.ex.ValidationModelGenerationException;
import cz.cvut.fel.archval.core.api.model.graph.GraphModel;
import cz.cvut.fel.archval.core.api.model.report.AtomicRuleResult;
import cz.cvut.fel.archval.core.api.model.report.CompoundRuleResult;
import cz.cvut.fel.archval.core.api.model.report.RuleResult;
import cz.cvut.fel.archval.core.api.model.report.ValidationReport;
import cz.cvut.fel.archval.integration.archval.ArchvalInstance;
import cz.cvut.fel.archval.integration.avd.AvdCookie;
import cz.cvut.fel.archval.integration.register.AmbiguousOperatorsFoundException;
import cz.cvut.fel.archval.integration.register.DuplicateAnalysisNameException;
import cz.cvut.fel.archval.integration.register.DuplicateGraphGeneratorException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileUtil;
import org.openide.util.Exceptions;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;

/**
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class ValidationTask extends Thread {

    private AvdCookie avdCookie;
    private ProgressHandle ph = ProgressHandleFactory.createHandle("ArchVal");

    public ValidationTask(AvdCookie avdCookie) {
        super();
        this.avdCookie = avdCookie;
    }

    @Override
    public void run() {

        Project mainProject = OpenProjects.getDefault().getMainProject();
        if (mainProject == null) {
            StatusDisplayer.getDefault().setStatusText("There is no main "
                    + "project selected.");
            return;
        }
        String projectTypeString = mainProject.getClass().getSimpleName();
        if (!projectTypeString.equals("NbMavenProjectImpl")) {
            StatusDisplayer.getDefault().setStatusText("Selected project is"
                    + "not valid maven project. Only maven projects are "
                    + "supported.");
            return;
        }

        final InputOutput io = IOProvider.getDefault().getIO("ArchVal", true);
        io.select();

        // validation process start
        ph.start();
        try {
            ArchVal archval = ArchvalInstance.getInstance();

            StatusDisplayer.getDefault().setStatusText(
                    "Starting validation action.");

            StatusDisplayer.getDefault().setStatusText(
                    "Generating validation model.");
            ValidationModelIface validationModel =
                    avdCookie.getValidationModel();

            File projectDirectory =
                    FileUtil.toFile(mainProject.getProjectDirectory());

            StatusDisplayer.getDefault().setStatusText(
                    "Generating graph model.");
            GraphModel graphModel =
                    archval.getGraphModelGenerator().generateModel(
                    validationModel.getAllRequiredGraphTypes(),
                    projectDirectory);

            // perform validation
            ValidationTaskIface task = archval.createValidationTask(graphModel,
                    validationModel);

            StatusDisplayer.getDefault().setStatusText(
                    "Performing validation.");
            task.runSynchronous();

            // processing result tree
            ValidationReport validationReport = task.getReport();
            if (validationReport == null) {
                io.getOut().println("Unknown error.");
            } else {
                io.select();
                io.getOut().println("Validation results:");
                io.getOut().println("-------------------");
                List<RuleResult> rulesResults = validationReport.getRuleResultList();
                for (RuleResult ruleResult : rulesResults) {
                    io.getOut().print("Rule name: ");
                    io.getOut().println(ruleResult.getRuleName());
                    if (ruleResult instanceof AtomicRuleResult) {
                        AtomicRuleResult arr = (AtomicRuleResult) ruleResult;
                        io.getOut().println("Rule type: atomic rule");
                        String stringRuleResult = (arr.getResult()) ? "OK" : "Violation found.";
                        io.getOut().println("Rule result: " + stringRuleResult);

                        // TODO: process the tree here
                    } else if (ruleResult instanceof CompoundRuleResult) {
                        CompoundRuleResult crr = (CompoundRuleResult) ruleResult;
                        // TODO: process compound rule result here
                    }

                    // TODO: for each rule print some tree of results
                }
            }
            StatusDisplayer.getDefault().setStatusText("Done.");

        } catch (UnsupportedOperationException ex) {
            Exceptions.printStackTrace(ex);
        } catch (GraphGeneratorNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (RecognitionException ex) {
            Exceptions.printStackTrace(ex);
        } catch (DuplicateGraphGeneratorException ex) {
            Exceptions.printStackTrace(ex);
        } catch (AmbiguousOperatorsFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (DuplicateAnalysisNameException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        } catch (ValidationModelGenerationException ex) {
            Exceptions.printStackTrace(ex);
        } catch (OperatorNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (OperatorMismatchException ex) {
            Exceptions.printStackTrace(ex);
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        } finally {
            ph.finish();
        }
    }
}
