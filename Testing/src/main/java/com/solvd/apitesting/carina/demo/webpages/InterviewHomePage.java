package com.solvd.apitesting.carina.demo.webpages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class InterviewHomePage extends AbstractPage {
    @FindBy(css = ".header-upper")
    private InterviewHeader header;

    public InterviewHomePage(WebDriver driver) {
        super(driver);
    }

    public InterviewLoginPage goToLoginPage() {
        return header.clickLoginButton();
    }
}
