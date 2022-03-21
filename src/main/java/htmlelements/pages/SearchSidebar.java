package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface SearchSidebar extends ExtendedWebPage {
    @Description("Search field")
    @FindBy("//input[@name='search']")
    ExtendedMyWebElement searchField();

    @Description("Search button")
    @FindBy("//button[@class='btn-link    btn search-btn']")
    ExtendedMyWebElement searchButton();
}
