package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.HomePage;

import static io.qameta.htmlelements.matcher.DisplayedMatcher.displayed;

public class HomePageSteps extends BaseSteps {

    private HomePage homePage() {
        return pageFactory.on(HomePage.class);
    }

    public PrivacyModalSteps acceptPrivacyModal() {
        return new PrivacyModalSteps();
    }

    public SearchSteps clickSearchButton() {
        homePage().searchButton.click();
        return new SearchSteps();
    }

    public LoginSteps clickLoginButton() {
        homePage().accountIcon.click();
        return new LoginSteps();
    }
}
