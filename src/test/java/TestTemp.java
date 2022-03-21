import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.HomePage;
import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.WebPageFactory;
import io.qameta.htmlelements.statement.RetryStatement;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import selenium.WebDriverFactory;
import steps.HomePageSteps;
import tasks.ConfigObjectProvider;

public class TestTemp {
    ConfigObjectProvider cfg = new ConfigObjectProvider();
    static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    @Test
    public void test1() {


        // use .on method of MyPageFactoryProvider


        homePage().open(cfg.getHomepageURL());
        HomePageSteps homePageSteps = new HomePageSteps();  /*since homepage is opened after opening page, openHomepage() will give you access
         to HomePageSteps*/

    }


    public WebDriver getDriver() {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        webDriverFactory.initialize(cfg.getBrowser(), cfg.getSeleniumVer());
        System.out.println(webDriverFactory.get().hashCode());
        return webDriverFactory.get();//TODO: Here you need to pass WebDriver instance from WebDriverFactory.get();
    }

    HomePage homePage() {
        return pageFactory.on(HomePage.class);
    }

}

