package com.solvd.apitesting.carina.demo.webpages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {
    @FindBy(css = "iron-selector[selected-attribute]")
    private ExtendedWebElement subjectButtons;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(subjectButtons);
    }
}
