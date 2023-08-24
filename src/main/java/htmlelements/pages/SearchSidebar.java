package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchSidebar extends ExtendedWebPage {
        @FindBy(xpath ="//input[@name='search']")
    public WebElement searchField;

        @FindBy(xpath ="//button[@class='btn-link    btn search-btn']")
    public WebElement searchButton;

    public SearchSidebar(WebDriver driver) {
    }
}
