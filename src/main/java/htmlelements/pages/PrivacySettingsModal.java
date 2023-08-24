package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivacySettingsModal extends ExtendedWebPage {

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement acceptButton;

    public PrivacySettingsModal(WebDriver driver) {
        
    }
}
