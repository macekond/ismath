package cz.cvut.fel.archval.core.actions;

import junit.framework.Test;
import org.netbeans.jellytools.JellyTestCase;
import org.netbeans.jellytools.MainWindowOperator;
import org.netbeans.jellytools.TopComponentOperator;
import org.netbeans.jellytools.actions.Action;
import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JSliderOperator;
import org.netbeans.junit.NbModuleSuite;
import org.netbeans.junit.NbModuleSuite.Configuration;

/**
 *
 * @author martin
 */
public class OverallTest extends JellyTestCase {

    public OverallTest(String name) {
        super(name);
    }

    /** Creates suite from particular test cases. You can define order of testcases here. */
    public static Test suite() {

        Configuration testConfig = NbModuleSuite.createConfiguration(OverallTest.class);
        testConfig.addTest("testBrushSize", "testPainting", "testClear", "testColorChooser");
        testConfig.clusters(".*").enableModules(".*");
        testConfig.gui(true);

        return NbModuleSuite.create(testConfig);

    }

    /** Called before every test case. */
    public void setUp() {
        System.out.println("########  " + getName() + "  #######");
    }

    // Add test methods here, they have to start with 'test' name:
    /** Test brush size setting. */
    public void testBrushSize() {
        new Action("File|New Canvas", null).perform();
        JSliderOperator slider = new JSliderOperator(MainWindowOperator.getDefault());
        slider.scrollToMaximum();
        slider.scrollToMinimum();
        slider.scrollToMaximum();
    }

    /** Test painting. */
    public void testPainting() {
        TopComponentOperator tcOper = new TopComponentOperator("Image");
        tcOper.clickMouse(tcOper.getCenterX(), tcOper.getCenterY(), 1);
        tcOper.dragNDrop(tcOper.getCenterX(), tcOper.getCenterY(), tcOper.getWidth() - 1, tcOper.getHeight() - 1);
        tcOper.dragNDrop(tcOper.getWidth() - 1, tcOper.getHeight() - 1, 0, tcOper.getHeight() - 1);
        tcOper.dragNDrop(0, tcOper.getHeight() - 1, tcOper.getCenterX(), tcOper.getCenterY());
    }

    /** Test clear button. */
    public void testClear() {
        new JButtonOperator(new TopComponentOperator("Image"), "Clear").push();
    }

    public void testColorChooser() {
        fail("Not yet implemented.");
    }
}
