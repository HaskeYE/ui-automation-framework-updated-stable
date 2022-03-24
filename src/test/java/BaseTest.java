import org.junit.After;
import org.junit.Before;
import selenium.WebDriverFactory;
import selenium.WebDriverFactoryProvider;
import tasks.ConfigObjectProvider;

public class BaseTest {
    ConfigObjectProvider cfg = new ConfigObjectProvider();
    WebDriverFactory webDriverFactory = WebDriverFactoryProvider.getInstance();

    @Before
    public void setUpWebDriver() {
        webDriverFactory.initialize(cfg.getBrowser(), cfg.getSeleniumVer());
    }

    @After
    public void endWebDriver() {
        webDriverFactory.end();
    }
}
