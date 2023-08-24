package steps;

import htmlelements.pages.HomePage;
import tasks.ConfigObjectProvider;

public class OpenPageSteps extends BaseSteps {
    ConfigObjectProvider cfg = new ConfigObjectProvider();
    private HomePage homePage() { return pageFactory.on(HomePage.class); } // use .on method of MyPageFactoryProvider

    public HomePageSteps openHomepage() {
        pageFactory.getDriver().get(cfg.getHomepageURL());
        System.out.println("Home page opened");
        return new HomePageSteps();  /*since homepage is opened after opening page, openHomepage() will give you access
         to HomePageSteps*/ }
}
