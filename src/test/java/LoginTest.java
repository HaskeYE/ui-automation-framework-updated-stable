import org.junit.Test;
import steps.OpenPageSteps;

public class LoginTest extends BaseTest{

    @Test
    public void negativeTest() {
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .acceptCookies()
                .clickLoginButton()
                .signInInit()
                .typeInLogin("")
                .typeInPassword("")
                .errorOnInputAssertion();
    }

    @Test
    public void positiveTest() {
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .acceptCookies()
                .clickLoginButton()
                .signInInit()
                .typeInLogin(cfg.getMyEmail())
                .typeInPassword(cfg.getMyPassword())
                .signIn()
                .loggedInAssertion();
    }

}
