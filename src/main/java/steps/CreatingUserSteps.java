package steps;

import htmlelements.ExtendedMyWebElement;
import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.CreatingUserPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.WebDriverFactory;
import selenium.WebDriverFactoryProvider;

import static io.qameta.htmlelements.matcher.DisplayedMatcher.displayed;

public class CreatingUserSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();
    WebDriver webDriver = WebDriverFactoryProvider.getInstance().getDriver();

    private CreatingUserPage creatingUserPage() { return pageFactory.on(CreatingUserPage.class); }

    public CreatingUserSteps typeInEmail(String email) {
        WebElement el =  webDriver.findElement(By.xpath("//input[@name='login']"));
        el.click();
        el.sendKeys(email);
        //webDriver.findElement(By.xpath("//input[@name='login']")).sendKeys(email);
        //creatingUserPage().emailInput().waitUntil(displayed()).sendKeys(email);
        return this;
    }

    public CreatingUserSteps typeInFirstName(String firstName) {
        creatingUserPage().firstNameInput().waitUntil(displayed()).sendKeys(firstName);
        return this;
    }

    public CreatingUserSteps typeInLastName(String lastName) {
        creatingUserPage().lastNameInput().waitUntil(displayed()).sendKeys(lastName);
        return this;
    }

    public CreatingUserSteps typeInPassword() {
        creatingUserPage().passwordInput().waitUntil(displayed()).sendKeys("passwordStrong1");
        return this;
    }

    public CreatingUserSteps typeInPasswordConfirmation() {
        creatingUserPage().passwordConfirmInput().waitUntil(displayed()).sendKeys("passwordStrong1");
        return this;
    }

    public CreatingUserSteps typeInZipcode() {
        creatingUserPage().postalCodeInput().waitUntil(displayed()).sendKeys("90210");
        return this;
    }

    public CreatingUserSteps chooseMonth() {
        creatingUserPage().monthOfBirthSelect().waitUntil(displayed()).sendKeys("April");
        return this;
    }

    public CreatingUserSteps chooseDay() {
        creatingUserPage().dayOfBirthSelect().waitUntil(displayed()).sendKeys("7");
        return this;
    }

    public CreatingUserSteps chooseYear() {
        creatingUserPage().yearOfBirthSelect().waitUntil(displayed()).sendKeys("2000");
        return this;
    }

    public CreatingUserSteps acceptPolicy() {
        creatingUserPage().acceptationCheckBox().waitUntil(displayed()).click();
        return this;
    }

    public HomePageSteps createAccount() {
        creatingUserPage().createAccountButton().waitUntil(displayed()).click();
        return new HomePageSteps();
    }
}
