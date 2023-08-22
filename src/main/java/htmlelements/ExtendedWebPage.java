package htmlelements;

import annotations.IsAtPageMethod;
import org.hamcrest.Matcher;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import selenium.WebDriverFactory;
import selenium.WebDriverFactoryProvider;

/**
 * HtmlElements is not supported for later Selenium versions after 3.10.0,
 * this is a wrapper class to avoid issues.
 * It can be also used for extending or overriding WebPage behavior
 */
public abstract class ExtendedWebPage {

    WebDriver driver;



    public ExtendedWebPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

     void isAt(Matcher<String> url) {
        isAtPage(url);
    }

     void open(String s) {
        WebDriverFactory webDriverFactory = WebDriverFactoryProvider.getInstance();
        webDriverFactory.getDriver().get(s);
    }
}
