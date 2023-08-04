package com.solvd.apitesting.carina.demo.mobiletesting.android;

import com.solvd.apitesting.carina.demo.mobiletesting.common.HomePageBase;
import com.solvd.apitesting.carina.demo.mobiletesting.common.ProductsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
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
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(emailInput);

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
}
