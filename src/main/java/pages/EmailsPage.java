package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.ui.ExpectedConditions.attributeContains;

public class EmailsPage extends BasePage {

    public EmailsPage(WebDriver driver) {
        super(driver);
    }

    public void assertLogin(String login) {
        assertThat(attributeContains(byCss(".gb_gb .gb_b"), "title", login));
    }

    public void getUnreadCountEmails() {
        String emails = $(byTitle("Входящие")).getAttribute("title");

        if (emails.equals("Входящие")) {
            System.out.println("There are no any unread messages!");
        } else {
            System.out.println("There are " + Integer.parseInt(emails.replaceAll("[^\\d]", "")) + " unread message(s)!");
        }
    }
}
