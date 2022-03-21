import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import selenium.WebDriverFactory;
import steps.OpenPageSteps;
import tasks.ConfigObjectProvider;

public class TestTest {
    //ConfigObjectProvider cfg = new ConfigObjectProvider();
    //static WebDriverFactory webDriverFactory = new WebDriverFactory();

    @Before
    public void setUpWebDriver() {
        //webDriverFactory.initialize(cfg.getBrowser(), cfg.getSeleniumVer());
    }

    @Test
    public void testSeventh() {
        //webDriverFactory.get();
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .clickSearchButton()
                .inputSearchTerm("0119")
                .clickSearchIcon()
                .verifyNumberOfProductIsDisplayed(15);
    }

    @After
    public void restoreSystemInputOutput() {
        //webDriverFactory.end();
    }
}
