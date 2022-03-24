import main.ScenarioContext;
import main.ScenarioContextProvider;
import org.junit.Test;
import steps.OpenPageSteps;
import utils.RandomUtils;

public class CreateAccountTest extends BaseTest {
    ScenarioContext scenarioContext = ScenarioContextProvider.getInstance();


    @Test
    public void creatingUserTest() {
        String sampleMail = RandomUtils.generateRandomEmail("bk.ru");
        String sampleName = RandomUtils.generateRandomName();
        scenarioContext.put("firstTestMail", sampleMail);
        scenarioContext.put("firstTestUsername", sampleName);

        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .acceptCookies()
                .clickLoginButton()
                .createAccountInit()

                .typeInFirstName(sampleName)
                .typeInLastName(sampleName)

                .typeInEmail(sampleMail)
                .typeInPassword()

                .typeInPasswordConfirmation()
                .typeInZipcode()
                .chooseMonth()
                .chooseDay()
                .chooseYear()

                .acceptPolicy()

                .createAccount()
                .clickLoginButton()
                .loggedInAssertionNamed(sampleName);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
    }


    @Test
    public void creatingUserAndLogInTest() {
        String sampleMail = scenarioContext.get("firstTestMail");

        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .acceptCookies()
                .clickLoginButton()
                .signInInit()
                .typeInLogin(sampleMail)
                .typeInPassword(cfg.getMyPassword())
                .signIn()
                .loggedInAssertionNamed(sampleMail.substring(0,6));

        scenarioContext.removeAll();
    }
}

