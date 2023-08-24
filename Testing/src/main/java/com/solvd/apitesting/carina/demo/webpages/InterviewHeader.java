package com.solvd.apitesting.carina.demo.webpages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class InterviewHeader extends AbstractUIObject {
    @FindBy(css = ".ico-login")
    private ExtendedWebElement loginLink;

    public InterviewHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public InterviewLoginPage clickLoginButton() {
        loginLink.click();
        return new InterviewLoginPage(getDriver());
    }
}
