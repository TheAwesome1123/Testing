package com.solvd.apitesting.carina.demo.webpages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TrendingPage extends ParentPage {
    @FindBy(xpath = "//*[contains(text(), \"Gaming\")]")
    private ExtendedWebElement gamingHeader;

    public TrendingPage(WebDriver webDriver) {
        super(webDriver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(gamingHeader);
    }
}
