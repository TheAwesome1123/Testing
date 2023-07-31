package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.CheckoutInfoPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.CheckoutReviewPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AndroidCheckoutInfoPage.class)
public class AndroidCheckoutInfoPage extends CheckoutInfoPageBase {
    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-First Name\"]")
    private ExtendedWebElement firstNameInput;
    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Last Name\"]")
    private ExtendedWebElement lastNameInput;
    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]")
    private ExtendedWebElement zipcodeInput;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]/android.widget.TextView")
    private ExtendedWebElement continueButton;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout")
    private ExtendedWebElement window;

    public AndroidCheckoutInfoPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public CheckoutReviewPageBase enterCheckoutInfo(String firstName, String lastName, String zip) {
        firstNameInput.click();
        firstNameInput.type(firstName);
        lastNameInput.click();
        lastNameInput.type(lastName);
        zipcodeInput.click();
        zipcodeInput.type(zip);
        continueButton.click();

        return new AndroidCheckoutReviewPage(getDriver());
    }
}
