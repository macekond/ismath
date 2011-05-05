package cz.cvut.fel.archval.global;

import junit.framework.Test;
import org.netbeans.jellytools.JellyTestCase;
import org.netbeans.jellytools.MainWindowOperator;
import org.netbeans.junit.NbModuleSuite;
import org.netbeans.junit.NbModuleSuite.Configuration;

/**
 * Global simple overall test (just tests if the aplication starts up).
 *
 * @author Martin Vejmelka (martin.vejmelka@fel.cvut.cz)
 */
public class GlobalTest extends JellyTestCase {

    public GlobalTest(String name) {
        super(name);
    }

    /**
     * Creates suite from particular test cases.
     */
    public static Test suite() {
        Configuration testConfig = NbModuleSuite.createConfiguration(GlobalTest.class);
        testConfig.addTest("testBareRun");
        testConfig.clusters(".*").enableModules(".*");
        testConfig.gui(true);
        return NbModuleSuite.create(testConfig);
    }

    /**
     * Called before every test case.
     */
    public void setUp() {
        System.out.println("Test: " + getName());
    }

    /*
     * Just start application and maximize its window.
     */
    public void testBareRun() {
        MainWindowOperator.getDefault().maximize();
    }
}
