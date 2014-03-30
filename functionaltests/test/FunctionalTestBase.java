import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTestBase {

    private static String baseUrl = "http://127.0.0.1:9000";
    private static WebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public static void setUpDriver() throws Exception {
        if (System.getProperty("webdriver.chrome.driver", "").length() == 0) {
            System.setProperty("webdriver.chrome.driver", "./tools/chrome-driver/chromedriver");
        }

        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1600, 1080));
    }

    @Before
    public void createPageObjects() throws Exception {
        homepage = new HomePage(driver, baseUrl);
    }

    @AfterClass
    public static void quitDriver() throws Exception {
        driver.quit();
    }
}
