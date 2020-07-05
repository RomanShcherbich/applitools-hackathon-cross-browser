package ModernTests;

import com.applitools.eyes.selenium.fluent.Target;
import org.openqa.selenium.By;
import org.testng.annotations.*;


public class ModernTestsV1 extends BaseTest {

    @Test(priority = 0, testName = "Task 1 – Cross-Device Elements Test")
    @Parameters({"URL"})
    public void testCrossDeviceElements(String url) {
        initiateEyesTask("Task 1", url);
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test"));
    }

    @Test(priority = 1, testName = "Task 2 – Shopping Experience Test")
    @Parameters({"URL"})
    public void testShoppingExperienceTest(String url) {
        initiateEyesTask("Task 2", url);
        click(By.id("SPAN____208"));
        click(By.id("SPAN__checkmark__107"));
        click(By.id("filterBtn"));
        eyes.check(Target.window().fully().withName("Filter Results"));
    }

    @Test(priority = 2, testName = "Task 3 – Product Details test")
    @Parameters({"URL"})
    public void testProductDetailsTest(String url) {
        initiateEyesTask("Task 3", url);
        click(By.id("product_1"));
        eyes.check(Target.window().fully().withName("Product Details test"));
    }

}
