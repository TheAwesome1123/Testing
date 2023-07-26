package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobilepages.common.HomePageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.ProductsPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AndroidHomePage extends HomePageBase {
    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private ExtendedWebElement emailInput;
    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private ExtendedWebElement passwordInput;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private ExtendedWebElement loginButton;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    private ExtendedWebElement errorMessage;

    public AndroidHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void inputCredentials(String email, String password) {
        emailInput.click();
        emailInput.type(email);
        passwordInput.click();
        passwordInput.type(password);
    }

    @Override
    public ProductsPageBase clickLoginButton() {
        loginButton.click();
        return new AndroidProductsPage(getDriver());
    }

    @Override
    public boolean checkIfErrorMessagePresent() {
        return errorMessage.isElementPresent();
    }


}
