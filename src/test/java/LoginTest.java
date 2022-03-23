import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import selenium.WebDriverFactory;
import selenium.WebDriverFactoryProvider;
import steps.OpenPageSteps;
import tasks.ConfigObjectProvider;

public class LoginTest {
    ConfigObjectProvider cfg = new ConfigObjectProvider();
    WebDriverFactory webDriverFactory = WebDriverFactoryProvider.getInstance();

    @Before
    public void setUpWebDriver() {
        webDriverFactory.initialize(cfg.getBrowser(), cfg.getSeleniumVer());
    }

    @Test
    public void negativeTest() {
        //webDriverFactory.get();
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .acceptCookies()
                .clickLoginButton()
                .signInInit()
                .typeInLogin("")
                .typeInPassword("")
                .errorOnInputAssertion();
    }

    @Test
    public void positiveTest() {
        //webDriverFactory.get();
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .acceptCookies()
                .clickLoginButton()
                .signInInit()
                .typeInLogin(cfg.getMyEmail())
                .typeInPassword(cfg.getMyPassword())
                .signIn()
                .loggedInAssertion();
    }


    @After
    public void endWebDriver() {
        webDriverFactory.end();
    }
}
