package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobilepages.common.HomePageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.uielements.MenuButton;
import com.solvd.apitesting.carina.demo.mobilepages.common.uielements.SearchBar;
import com.solvd.apitesting.carina.demo.mobilepages.common.uielements.SignInButton;
import com.solvd.apitesting.carina.demo.mobilepages.common.uielements.TrendingButton;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public class AndroidHomePage extends HomePageBase {
    private SearchBar searchBar;
    private MenuButton menuButton;
    private TrendingButton trendingButton;
    private ExtendedWebElement profileButton;

    public AndroidHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public AndroidResultsPage makeSearch(String search) {
        return new AndroidResultsPage(getDriver());
    }

    public AndroidSignInPage goToSignInPage() {
        return new AndroidSignInPage(getDriver());
    }

    public void clickMenuButton() {

    }

    public AndroidTrendingPage goToTrendingPage() {
        return new AndroidTrendingPage(getDriver());
    }
}
