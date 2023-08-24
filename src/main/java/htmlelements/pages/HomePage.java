package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import org.openqa.selenium.WebElement;
import org.codehaus.plexus.component.annotations.Requirement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends ExtendedWebPage {
    @FindBy(xpath = "//div[@class='ot-sdk-row']")
    public List<WebElement> privacySettingsModal;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement acceptButton;

    @FindBy(xpath = "//li[@class='tnav-myaeo utilities-list-item utilities-account qa-utilities-account hidden-on-affix']")
    public WebElement accountIcon;

    @FindBy(xpath = "//li[@class='utilities-list-item utilities-search qa-utilities-search relative']")
    public WebElement searchButton;

    @FindBy(xpath = "//li[@class='utilities-list-item utilities-cart qa-utilities-cart relative']")
    public WebElement cartIcon;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
