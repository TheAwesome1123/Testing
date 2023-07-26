package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobilepages.common.SignInPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AndroidSignInPage extends SignInPageBase {
    private ExtendedWebElement emailInput;
    private ExtendedWebElement nextButton;
    private ExtendedWebElement emailErrorMessage;
    private ExtendedWebElement insecureWarning;

    public AndroidSignInPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void inputEmail(String email) {
        this.emailInput.type(email);
        this.nextButton.click();
    }

    public boolean isEmailErrorMessagePresent() {
        return this.emailErrorMessage.isElementPresent();
    }
}
