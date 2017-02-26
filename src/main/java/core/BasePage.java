package core;

import org.openqa.selenium.WebDriver;

public class BasePage extends ConciseAPI {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public WebDriver getDriver() {
        return this.driver;
    }

}
