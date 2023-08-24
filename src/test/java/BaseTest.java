import org.junit.After;
import org.junit.Before;
import selenium.WebDriverFactory;
import selenium.WebDriverFactoryProvider;
import tasks.ConfigObjectProvider;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    ConfigObjectProvider cfg = new ConfigObjectProvider();
    WebDriverFactory webDriverFactory = WebDriverFactoryProvider.getInstance();

    @Before
    public void setUpWebDriver() {
        webDriverFactory.initialize(cfg.getBrowser(), cfg.getSeleniumVer());
        webDriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriverFactory.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @After
    public void endWebDriver() {
        webDriverFactory.end();
    }
}
