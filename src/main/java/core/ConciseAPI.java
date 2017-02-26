package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Quotes;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public abstract class ConciseAPI {

    public void open(String url) {
        getDriver().get(url);
    }

    public abstract WebDriver getDriver();

    public static By byCss(String cssSelector) {
        return By.cssSelector(cssSelector);
    }

    public static By byTitle(String text) {
        return By.xpath(".//*[contains(@title, " + Quotes.escape(text) + ")]");
    }

    public WebElement $(By elementLocator) {
        return assertThat(visibilityOfElementLocated(elementLocator));
    }

    public <V> V assertThat(ExpectedCondition<V> condition, long timeout) {
        return new WebDriverWait(getDriver(), timeout).until(condition);
    }

    public <V> V assertThat(ExpectedCondition<V> condition) {
        return assertThat(condition, Configuration.timeout);
    }

}
