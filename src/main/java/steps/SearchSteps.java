package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.SearchSidebar;

import static io.qameta.htmlelements.matcher.DisplayedMatcher.displayed;

public class SearchSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    private SearchSidebar searchSidebar() { return pageFactory.on(SearchSidebar.class); }

    public SearchSteps inputSearchTerm(String term) {
        searchSidebar().searchField().waitUntil(displayed()).sendKeys(term);
        return this;
    }

    public SearchResultsPageSteps clickSearchIcon() {
        searchSidebar().searchButton().waitUntil(displayed()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("sleep not good");
        }

        return new SearchResultsPageSteps();
    }

}
