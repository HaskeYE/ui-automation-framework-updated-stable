package htmlelements;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.WebPageFactory;
import io.qameta.htmlelements.statement.RetryStatement;
import org.openqa.selenium.WebDriver;
import selenium.WebDriverFactory;
import selenium.WebDriverFactoryProvider;
import tasks.ConfigObjectProvider;

public class MyPageFactory {
    ConfigObjectProvider configs = new ConfigObjectProvider();

    public <T extends WebPage> T on(Class<T> webpage) {
        WebPageFactory webPageFactory = new WebPageFactory();
        webPageFactory.property(RetryStatement.TIMEOUT_KEY, String.valueOf(configs.getTimeout())); // Create timeout as configurable property

        WebDriver wd = getDriver();
        return webPageFactory.get(wd, webpage);
    }

    public WebDriver getDriver() {
        WebDriverFactory webDriverFactory = WebDriverFactoryProvider.getInstance();
        System.out.println(webDriverFactory.getDriver().hashCode());
        return webDriverFactory.getDriver(); // Here you need to pass WebDriver instance from WebDriverFactory.get();
    }

}

