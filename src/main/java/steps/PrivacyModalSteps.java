package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.PrivacySettingsModal;

import static io.qameta.htmlelements.matcher.DisplayedMatcher.displayed;

public class PrivacyModalSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    private PrivacySettingsModal privacySettingsModal() { return pageFactory.on(PrivacySettingsModal.class); }

    public HomePageSteps acceptCookies() {
        privacySettingsModal().acceptButton().click();
        return new HomePageSteps();
    }
}
