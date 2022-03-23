package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.LoginSidebar;
import tasks.ConfigObjectProvider;

import static io.qameta.htmlelements.matcher.DisplayedMatcher.displayed;

public class LoginSteps {
    ConfigObjectProvider cfg = new ConfigObjectProvider();

    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    private LoginSidebar loginSidebar() { return pageFactory.on(LoginSidebar.class); }

    public LoginSteps signInInit() {
        loginSidebar().signinInit().waitUntil(displayed()).click();
        return this;
    }

    public CreatingUserSteps createAccountInit() {
        loginSidebar().createAccountInit().waitUntil(displayed()).click();
        return new CreatingUserSteps();
    }

    public LoginSteps typeInLogin(String login) {
        loginSidebar().usernameInput().waitUntil(displayed()).sendKeys(login);
        return this;
    }

    public LoginSteps typeInPassword(String password) {
        loginSidebar().passwordInput().waitUntil(displayed()).sendKeys(password);
        return this;
    }

    public LoginSteps signIn() {
        loginSidebar().loginButton().waitUntil(displayed()).click();
        return this;
    }

    public LoginSteps errorOnInputAssertion() {
        loginSidebar().loginButton().waitUntil(displayed()).click();
        assert(loginSidebar().errorMessage().getText().equals("Hold up, there's a problem."));
        return this;
    }

    public LoginSteps loggedInAssertion() {
        assert (loginSidebar().userGreetings().waitUntil(displayed()).isDisplayed());
        return  this;
    }

    public LoginSteps loggedInAssertionNamed(String name) {
        String greetings = name + "'s Account";
        assert (loginSidebar().userGreetings().waitUntil(displayed()).isDisplayed()
                && loginSidebar().userGreetings().waitUntil(displayed()).getText().equals(greetings));
        return  this;
    }
}
