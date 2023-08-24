package htmlelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import selenium.WebDriverFactory;
import selenium.WebDriverFactoryProvider;
import tasks.ConfigObjectProvider;

import java.time.Duration;

public class MyPageFactory {
    ConfigObjectProvider configs = new ConfigObjectProvider();

    public <T extends ExtendedWebPage> T on(Class<T> webpage) {
        WebDriver wd = getDriver();
        return PageFactory.initElements(wd, webpage);
    }

    public WebDriver getDriver() {
        WebDriverFactory webDriverFactory = WebDriverFactoryProvider.getInstance();
        System.out.println(webDriverFactory.getDriver().hashCode());
        return webDriverFactory.getDriver(); // Here you need to pass WebDriver instance from WebDriverFactory.get;
    }

}

