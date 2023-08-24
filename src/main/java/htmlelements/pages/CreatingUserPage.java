package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CreatingUserPage extends ExtendedWebPage {

    @FindBy(xpath = "//input[@name='login']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='confirm_password']")
    public WebElement passwordConfirmInput;

    @FindBy(xpath = "//input[@name='postalCode']")
    public WebElement postalCodeInput;

    @FindBy(xpath = "//select[@name='month']")
    public WebElement monthOfBirthSelect;

    @FindBy(xpath = "//select[@name='day']")
    public WebElement dayOfBirthSelect;

    @FindBy(xpath = "//select[@name='year']")
    public WebElement yearOfBirthSelect;

    @FindBy(xpath = "//label[@class='aeo-checkbox-label clickable']")
    public WebElement acceptationCheckBox;

    @FindBy(xpath = "//button[@name='register']")
    public WebElement createAccountButton;

    public CreatingUserPage(WebDriver driver) {

    }
}
