package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginSidebar extends ExtendedWebPage {

    @FindBy(xpath = "//button[@class='btn btn-secondary qa-btn-signin   btn-sm btn-action']")
    public WebElement signinInit;

    @FindBy(xpath = "//a[@href='/us/en/myaccount/create-account']")
    public WebElement createAccountInit;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@class='btn btn-primary qa-btn-login   btn-block']")
    public WebElement loginButton;

    @FindBy(xpath = "//h6[@class='alert-header alert-danger']")
    public WebElement errorMessage;

    @FindBy(xpath = "//h2[@class='modal-title']")
    public WebElement userGreetings;

    @FindBy(xpath = "//li[@class='ember-view help-block qa-error-help-block has-error   _help-block_21ei9c']")
    public WebElement serverErrorText;

    public LoginSidebar(WebDriver driver) {
        
    }
}
