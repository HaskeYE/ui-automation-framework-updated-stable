package htmlelements;

import annotations.IsAtPageMethod;
import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.extension.DriverProvider;
import org.hamcrest.Matcher;
import org.openqa.selenium.WebDriver;
import selenium.WebDriverFactory;
import selenium.WebDriverFactoryProvider;

/**
 * HtmlElements is not supported for later Selenium versions after 3.10.0, 
 * this is a wrapper class to avoid issues.
 * It can be also used for extending or overriding WebPage behavior
 */
public interface ExtendedWebPage extends WebPage {

    @DriverProvider
    WebDriver getWrappedDriver();

    @IsAtPageMethod
    void isAtPage(Matcher<String> url);

    @Override
    default void isAt(Matcher<String> url) {
        isAtPage(url);
    }

    @Override
        default void open(String s) {
        WebDriverFactory webDriverFactory = WebDriverFactoryProvider.getInstance();
        webDriverFactory.getDriver().get(s);
    }
}
