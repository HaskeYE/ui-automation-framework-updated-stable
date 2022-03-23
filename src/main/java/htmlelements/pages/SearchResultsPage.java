package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

import java.util.ArrayList;
import java.util.List;

public interface SearchResultsPage extends ExtendedWebPage {
    @Description("Your account icon")
    @FindBy("//li[@class='tnav-myaeo utilities-list-item utilities-account qa-utilities-account hidden-on-affix']")
    ExtendedMyWebElement accountIcon();

    @Description("Search button")
    @FindBy("//li[@class='utilities-list-item utilities-search qa-utilities-search relative']")
    ExtendedMyWebElement searchButton();

    @Description("Cart button")
    @FindBy("//li[@class='utilities-list-item utilities-cart qa-utilities-cart relative']")
    ExtendedMyWebElement cartIcon();

    @Description("Products found by search header")
    @FindBy("//div[@class='product-tile qa-product-tile __eadf2 col-md-4 col-xs-6 qa-search-result-item']")
    List<ExtendedMyWebElement> productsListedAfterSearch();
}
