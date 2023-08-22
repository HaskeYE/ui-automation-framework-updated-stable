package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.CreatingUserPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.WebDriverFactoryProvider;

import static io.qameta.htmlelements.matcher.DisplayedMatcher.displayed;

public class CreatingUserSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();
    WebDriver webDriver = WebDriverFactoryProvider.getInstance().getDriver();

    private CreatingUserPage creatingUserPage() { return pageFactory.on(CreatingUserPage.class); }

    public CreatingUserSteps typeInEmail(String email) {
        webDriver.findElement(By.xpath("//div[@class='form-group aeo-input qa-input-login field-email']")).click();
        Actions a = new Actions(webDriver);
        a.sendKeys(email);
        a.build().perform();
        return this;
    }

    public CreatingUserSteps typeInFirstName(String firstName) {
        creatingUserPage().firstNameInput().sendKeys(firstName);
        return this;
    }

    public CreatingUserSteps typeInLastName(String lastName) {
        creatingUserPage().lastNameInput().sendKeys(lastName);
        return this;
    }

    public CreatingUserSteps typeInPassword() {
        webDriver.findElement(By.xpath("//div[@class='form-group aeo-input qa-input-password']")).click();
        Actions a = new Actions(webDriver);
        a.sendKeys("passwordStrong1");
        a.build().perform();
        return this;
    }

    public CreatingUserSteps typeInPasswordConfirmation() {
        creatingUserPage().passwordConfirmInput().sendKeys("passwordStrong1");
        return this;
    }

    public CreatingUserSteps typeInZipcode() {
        creatingUserPage().postalCodeInput().sendKeys("90210");
        return this;
    }

    public CreatingUserSteps chooseMonth() {
        creatingUserPage().monthOfBirthSelect().sendKeys("April");
        return this;
    }

    public CreatingUserSteps chooseDay() {
        creatingUserPage().dayOfBirthSelect().sendKeys("7");
        return this;
    }

    public CreatingUserSteps chooseYear() {
        creatingUserPage().yearOfBirthSelect().sendKeys("2000");
        return this;
    }

    public CreatingUserSteps acceptPolicy() {
        creatingUserPage().acceptationCheckBox().click();
        return this;
    }

    public HomePageSteps createAccount() {
        creatingUserPage().createAccountButton().click();
        return new HomePageSteps();
    }
}
