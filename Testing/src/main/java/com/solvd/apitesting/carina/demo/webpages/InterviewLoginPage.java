package com.solvd.apitesting.carina.demo.webpages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class InterviewLoginPage extends AbstractPage {
    @FindBy(css = "input[type=\"email\"]")
    private ExtendedWebElement emailInput;

    @FindBy(css = "input[type=\"password\"]")
    private ExtendedWebElement passwordInput;

    @FindBy(css = ".login-button")
    private ExtendedWebElement loginButton;

    @FindBy(css = ".validation-summary-errors")
    private ExtendedWebElement errorMessage;

    public InterviewLoginPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(emailInput);
    }

    public void inputCredentials(String email, String password) {
        emailInput.click();
        emailInput.type(email);

        passwordInput.click();
        passwordInput.type(password);

        loginButton.click();
    }

    public boolean isEmailInputPresent() {
        return emailInput.isElementPresent();
    }

    public boolean isErrorMessagePresent() {
        return errorMessage.isElementPresent();
    }
}
