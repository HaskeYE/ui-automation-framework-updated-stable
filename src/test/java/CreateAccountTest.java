import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import selenium.WebDriverFactory;
import selenium.WebDriverFactoryProvider;
import steps.OpenPageSteps;
import tasks.ConfigObjectProvider;
import utils.RandomUtils;

public class CreateAccountTest {
    ConfigObjectProvider cfg = new ConfigObjectProvider();
    WebDriverFactory webDriverFactory = WebDriverFactoryProvider.getInstance();

    @Before
    public void setUpWebDriver() {
        webDriverFactory.initialize(cfg.getBrowser(), cfg.getSeleniumVer());
    }


    @Test
    public void creatingUserTest() {
        String sampleMail = RandomUtils.generateRandomEmail("bk.ru");
        String sampleName = RandomUtils.generateRandomName();

        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .acceptCookies()
                .clickLoginButton()
                .createAccountInit()
                .typeInEmail(sampleMail)
                .typeInFirstName(sampleName)
                .typeInLastName(sampleName)
                .typeInPassword()
                .typeInPasswordConfirmation()
                .typeInZipcode()
                .chooseMonth()
                .chooseDay()
                .chooseYear()
                .acceptPolicy()
                .createAccount()
                .clickLoginButton()
                .loggedInAssertionNamed(sampleName);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
    }



    @After
    public void restoreSystemInputOutput() {
        webDriverFactory.end();
    }
}

