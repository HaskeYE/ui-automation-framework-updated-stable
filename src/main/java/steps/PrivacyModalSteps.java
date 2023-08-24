package steps;

import htmlelements.pages.PrivacySettingsModal;

public class PrivacyModalSteps extends BaseSteps {
    private PrivacySettingsModal privacySettingsModal() { return pageFactory.on(PrivacySettingsModal.class); }

    public HomePageSteps acceptCookies() {
        privacySettingsModal().acceptButton.click();
        return new HomePageSteps();
    }
}
