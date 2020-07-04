package ModernTests;

import com.applitools.eyes.selenium.fluent.Target;
import org.testng.annotations.*;


public class ModernTestsV1 extends BaseTest {

    @Test(priority = 0, testName = "Task 1 – Cross-Device Elements Test")
    @Parameters({"URL"})
    public void testCrossDeviceElements(String url) {
        setEyesTestName("Task 1");
        driver = eyes.open(driver);
        driver.get(url);
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test"));
    }

}
