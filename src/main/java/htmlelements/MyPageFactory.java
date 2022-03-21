package htmlelements;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.WebPageFactory;
import io.qameta.htmlelements.statement.RetryStatement;
import org.openqa.selenium.WebDriver;
import selenium.WebDriverFactory;
import tasks.ConfigObjectProvider;

public class MyPageFactory {
    ConfigObjectProvider configs = new ConfigObjectProvider();

    public <T extends WebPage> T on(Class<T> webpage) {
        WebPageFactory webPageFactory = new WebPageFactory();
        webPageFactory.property(RetryStatement.TIMEOUT_KEY, String.valueOf(configs.getTimeout())); // TODO: Create timeout as configurable property
        return webPageFactory.get(getDriver(), webpage);
    }

    public WebDriver getDriver() {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        webDriverFactory.initialize(configs.getBrowser(), configs.getSeleniumVer());
        System.out.println(webDriverFactory.get().hashCode());
        return webDriverFactory.get();//TODO: Here you need to pass WebDriver instance from WebDriverFactory.get();
    }

}

