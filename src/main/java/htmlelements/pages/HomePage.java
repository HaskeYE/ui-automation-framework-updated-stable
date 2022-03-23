package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.*;

public interface HomePage extends ExtendedWebPage {
    @Description("Cookies settings modal")
    @FindBy("//div[@class='_bottom-container_128srs']")
    ExtendedMyWebElement privacySettingsModal();

    @Description("Accept cookie button")
    @FindBy("//button[@name='accept-cookie']")
    ExtendedMyWebElement acceptButton();

    @Description("Your account icon")
    @FindBy("//li[@class='tnav-myaeo utilities-list-item utilities-account qa-utilities-account hidden-on-affix']")
    ExtendedMyWebElement accountIcon();

    @Description("Search button")
    @FindBy("//li[@class='utilities-list-item utilities-search qa-utilities-search relative']")
    ExtendedMyWebElement searchButton();

    @Description("Cart button")
    @FindBy("//li[@class='utilities-list-item utilities-cart qa-utilities-cart relative']")
    ExtendedMyWebElement cartIcon();
}
