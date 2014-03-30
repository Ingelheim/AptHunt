import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage {

    protected final String url;
    protected final WebDriver driver;

    public HomePage(WebDriver driver, String baseUrl) {
        this.url = baseUrl + "/";
        this.driver = driver;
    }

    public void visit() {
        driver.get(url);
    }

    public String getCreationButtonText() {
        return driver.findElements(By.className("btn-success")).get(0).getText();
    }
}
