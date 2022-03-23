package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface LoginSidebar extends ExtendedWebPage {

    @Description("Initializing sign in fields")
    @FindBy("//button[@class='btn btn-secondary qa-btn-signin   btn-sm btn-action']")
    ExtendedMyWebElement signinInit();

    @Description("Initializing sign in fields")
    @FindBy("//a[@href='/us/en/myaccount/create-account']")
    ExtendedMyWebElement createAccountInit();

    @Description("Username input")
    @FindBy("//input[@name='username']")
    ExtendedMyWebElement usernameInput();

    @Description("Username input")
    @FindBy("//input[@name='password']")
    ExtendedMyWebElement passwordInput();

    @Description("Login button")
    @FindBy("//button[@class='btn btn-primary qa-btn-login   btn-block']")
    ExtendedMyWebElement loginButton();

    @Description("Error message")
    @FindBy("//h6[@class='alert-header alert-danger']")
    ExtendedMyWebElement errorMessage();

    @Description("Username greeting")
    @FindBy("//h2[@class='modal-title']")
    ExtendedMyWebElement userGreetings();
}
