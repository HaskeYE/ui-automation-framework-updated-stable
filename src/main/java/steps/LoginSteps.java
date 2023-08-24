package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.LoginSidebar;
import io.qameta.htmlelements.exception.WaitUntilException;
import tasks.ConfigObjectProvider;

import java.util.Locale;

import static io.qameta.htmlelements.matcher.DisplayedMatcher.displayed;

public class LoginSteps extends BaseSteps {
    ConfigObjectProvider cfg = new ConfigObjectProvider();

    private LoginSidebar loginSidebar() { return pageFactory.on(LoginSidebar.class); }

    public LoginSteps signInInit() {
        loginSidebar().signinInit.click();
        return this;
    }

    public CreatingUserSteps createAccountInit() {
        loginSidebar().createAccountInit.click();
        return new CreatingUserSteps();
    }

    public LoginSteps typeInLogin(String login) {
        loginSidebar().usernameInput.sendKeys(login);
        return this;
    }

    public LoginSteps typeInPassword(String password) {
        loginSidebar().passwordInput.sendKeys(password);
        return this;
    }

    public LoginSteps signIn() {
        loginSidebar().loginButton.click();
        return this;
    }

    public LoginSteps errorOnInputAssertion() {
        loginSidebar().loginButton.click();
        assert(loginSidebar().errorMessage.getText().equals("Hold up, there's a problem."));
        return this;
    }

    public LoginSteps loggedInAssertion() {
        try {
            if (loginSidebar().userGreetings.isDisplayed())
                assert true;
        } catch (WaitUntilException e) {
            try {
                if (loginSidebar().serverErrorText.getText().equals("We've encountered an unexpected error on " +
                        "our end. Please try again later."))
                    assert true;
                else assert false;
            } catch (WaitUntilException eNew) {
                assert false;
            }
        }
        return this;
    }

    public LoginSteps loggedInAssertionNamed(String name) {
        String greetings = (name + "'s Account").toLowerCase();
        try {
            String result = loginSidebar().userGreetings.getText().toLowerCase();
            if (loginSidebar().userGreetings.isDisplayed()
                    && result.equals(greetings))
                assert true;
        } catch (WaitUntilException e) {
            try {
                if (loginSidebar().serverErrorText.getText().equals("We've encountered an unexpected error on " +
                        "our end. Please try again later."))
                    assert true;
                else assert false;
            } catch (WaitUntilException eNew) {
                assert false;
            }
        }
        return this;
    }
}
