import core.Configuration;
import org.junit.Before;
import org.junit.Test;
import pages.EmailsPage;
import pages.GmailPage;

import static data.TestDataConfig.gmailLogin;
import static data.TestDataConfig.gmailPassword;

public class GmailTest extends BaseTest {

    @Before
    public void setUp() {
        Configuration.timeout = 15;
    }

    GmailPage gmail = new GmailPage(getDriver());
    EmailsPage emails = new EmailsPage(getDriver());

    @Test
    public void testLoginAndGetUnreadMails() {

        gmail.open();
        gmail.login(gmailLogin, gmailPassword);

        emails.assertLogin(gmailLogin);

        emails.getUnreadCountEmails();
    }

}
