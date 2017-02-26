import core.ConciseAPI;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends ConciseAPI {

    public static WebDriver driver = new FirefoxDriver();

    @AfterClass
    public static void closeDriver() {
        driver.quit();
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }

}
