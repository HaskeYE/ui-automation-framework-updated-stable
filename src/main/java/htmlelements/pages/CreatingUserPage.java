package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.*;

public interface CreatingUserPage extends ExtendedWebPage {
    @Description("Email input")
    @FindBy("//input[@name='login']")
    ExtendedMyWebElement emailInput();

    @Description("First name input")
    @FindBy("//input[@name='firstname']")
    ExtendedMyWebElement firstNameInput();

    @Description("Last name input")
    @FindBy("//input[@name='lastname']")
    ExtendedMyWebElement lastNameInput();

    @Description("Password input")
    @FindBy("//input[@name='password']")
    ExtendedMyWebElement passwordInput();

    @Description("Password confirmation input")
    @FindBy("//input[@name='confirm_password']")
    ExtendedMyWebElement passwordConfirmInput();

    @Description("Postal code input")
    @FindBy("//input[@name='postalCode']")
    ExtendedMyWebElement postalCodeInput();

    @Description("Select month of birth")
    @FindBy("//select[@name='month']")
    ExtendedMyWebElement monthOfBirthSelect();

    @Description("Select day of birth")
    @FindBy("//select[@name='day']")
    ExtendedMyWebElement dayOfBirthSelect();

    @Description("Select year of birth")
    @FindBy("//select[@name='year']")
    ExtendedMyWebElement yearOfBirthSelect();

    @Description("Term acceptation checkbox")
    @FindBy("//input[@name='acceptTerms']")
    ExtendedMyWebElement acceptationCheckBox();

    @Description("Create account button")
    @FindBy("//button[@name='register']")
    ExtendedMyWebElement createAccountButton();
}
