package ModernTests;

import Utils.PropertyUtils;
import com.applitools.eyes.*;
import com.applitools.eyes.selenium.*;
import com.applitools.eyes.visualgrid.model.*;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


@Log4j2
public class BaseTest {

    protected static WebDriver driver;
    protected static Eyes eyes;
    protected static PropertyUtils property;
    private Configuration configuration;
    private EyesRunner runner = new VisualGridRunner(10);

    @BeforeSuite
    public void suiteSetUp() {
        property = new PropertyUtils();
        configuration = new Configuration();
        configuration
                .addBrowser(1200, 700, BrowserType.CHROME)
                .addBrowser(700, 500, BrowserType.FIREFOX)
                .addBrowser(1600, 1200, BrowserType.IE_11)
                .addBrowser(1200, 700, BrowserType.EDGE_CHROMIUM)
                .addBrowser(800, 600, BrowserType.SAFARI)
                .addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT)
                .addDeviceEmulation(DeviceName.Pixel_2, ScreenOrientation.PORTRAIT)
                .setApiKey(property.get("applitools.api.key"))
                .setBatch(new BatchInfo(property.get("hackathon.batch.name")))
                .setViewportSize(new RectangleSize(800, 600))
                .setServerUrl(property.get("applitools.server"))
                .setAppName(property.get("hackathon.app.name"));
    }


    @BeforeMethod
    public void methodSetUp() {
        eyes = new Eyes(runner);
        eyes.setConfiguration(configuration);
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void methodTearDown() {
        eyes.closeAsync();
        log.info(runner.getAllTestResults(false).toString());
    }

    @AfterSuite
    public void suiteTearDown() {
        eyes.abortAsync();
        driver.quit();
    }

    protected void setEyesTestName(String testName) {
        Configuration eyesConfiguration = eyes.getConfiguration();
        eyesConfiguration.setTestName(testName);
        eyes.setConfiguration(eyesConfiguration);
    }

}
