package com.solvd.apitesting.carina.demo.webpages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractPage {
    @FindBy(css = "input[type=\"email\"]")
    private ExtendedWebElement emailInput;
    @FindBy(xpath = "//*[@class=\"jibhHc\"]")
    private ExtendedWebElement emailErrorMessage;
    @FindBy(xpath = "//*[contains(text(), \"This browser or app may not be secure.\")]")
    private ExtendedWebElement insecureBrowserWarning;

    public SignInPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void inputEmail(String email) {
        emailInput.click();
        emailInput.type(email);
        emailInput.sendKeys(Keys.ENTER);
    }

    public boolean isEmailErrorMessagePresent() {
        return emailErrorMessage.isElementPresent();
    }

    public boolean isInsecureBrowserWarningPresent() {
        return insecureBrowserWarning.isElementPresent();
    }
}
