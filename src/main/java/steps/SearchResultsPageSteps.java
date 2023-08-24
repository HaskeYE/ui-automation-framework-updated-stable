package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.SearchResultsPage;

public class SearchResultsPageSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    private SearchResultsPage searchResultsPage() { return pageFactory.on(SearchResultsPage.class); }

    public SearchResultsPageSteps verifyNumberOfProductIsDisplayed(int numProducts){
        assert (searchResultsPage().productsListedAfterSearch.size() == numProducts);
        return this;
    }
}
