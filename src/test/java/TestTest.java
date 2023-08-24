import org.junit.Test;
import steps.OpenPageSteps;

public class TestTest extends BaseTest{

    @Test
    public void testSeventh() {
        //webDriverFactory.get;
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .acceptCookies()
                .clickSearchButton()
                .inputSearchTerm("0119")
                .clickSearchIcon()
                .verifyNumberOfProductIsDisplayed(15);
    }

}
