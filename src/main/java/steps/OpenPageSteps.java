package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.HomePage;
import tasks.ConfigObjectProvider;

public class OpenPageSteps {
    ConfigObjectProvider cfg = new ConfigObjectProvider();
    private static final MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    //private HomePage homePage() { return pageFactory.on(HomePage.class); } // use .on method of MyPageFactoryProvider

    public HomePageSteps openHomepage() {
        pageFactory
                .on(HomePage.class)
                .open(cfg.getHomepageURL());
        System.out.println("page opened");
        return new HomePageSteps();  /*since homepage is opened after opening page, openHomepage() will give you access
         to HomePageSteps*/ }
}
