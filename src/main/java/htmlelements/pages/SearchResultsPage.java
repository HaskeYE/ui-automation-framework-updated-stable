package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends ExtendedWebPage {

    @FindBy(xpath = "//li[@class='tnav-myaeo utilities-list-item utilities-account qa-utilities-account hidden-on-affix']")
    public WebElement accountIcon;

    @FindBy(xpath = "//li[@class='utilities-list-item utilities-search qa-utilities-search relative']")
    public WebElement searchButton;

    @FindBy(xpath = "//li[@class='utilities-list-item utilities-cart qa-utilities-cart relative']")
    public WebElement cartIcon;

    public SearchResultsPage(WebDriver driver) {
        
    }

    @FindBy(xpath = "//div[@class='product-tile qa-product-tile __eadf2 col-md-4 col-xs-6 qa-search-result-item']")
    public List<WebElement> productsListedAfterSearch;
}
