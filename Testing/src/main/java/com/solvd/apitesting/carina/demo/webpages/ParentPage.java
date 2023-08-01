package com.solvd.apitesting.carina.demo.webpages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ParentPage extends AbstractPage {
    @FindBy(xpath = "/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")
    private ExtendedWebElement searchBar;
    @FindBy(xpath = "//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a")
    private ExtendedWebElement signInButton;
    @FindBy(css = "#guide-button")
    private ExtendedWebElement menuButton;
    @FindBy(xpath = "//*[contains(text(), \"Gaming\")]")
    private ExtendedWebElement trendingButton;

    public ParentPage(WebDriver driver) {
        super(driver);
    }

    public ResultsPage makeSearch(String search) {
        searchBar.assertElementPresent();
        searchBar.click();
        searchBar.type(search);
        searchBar.sendKeys(Keys.ENTER);
        return new ResultsPage(getDriver());
    }

    public SignInPage clickSignInButton() {
        signInButton.click();
        return new SignInPage(getDriver());
    }

    public void clickMenuButton() {
        menuButton.click();
    }

    public TrendingPage clickTrendingButton() {
        trendingButton.click();
        return new TrendingPage(getDriver());
    }
}
