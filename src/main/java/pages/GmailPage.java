package pages;

import core.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GmailPage extends BasePage {

    public GmailPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        open("http://gmail.com");
    }

    public void login(String login, String password) {
        $(byCss("#Email")).sendKeys(login + Keys.ENTER);
        $(byCss("#Passwd")).sendKeys(password + Keys.ENTER);
    }

}
