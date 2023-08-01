package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.CartPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.CheckoutInfoPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.ProductsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AndroidCartPage.class)
public class AndroidCartPage extends CartPageBase {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
    private ExtendedWebElement cartHeader;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-REMOVE\"]/android.widget.TextView")
    private ExtendedWebElement removeFromCartButton;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]")
    private ExtendedWebElement checkoutButton;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-CONTINUE SHOPPING\"]/android.widget.TextView")
    private ExtendedWebElement continueShoppingButton;

    public AndroidCartPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(cartHeader);
    }

    @Override
    public void removeItems() {
        while(removeFromCartButton.isElementPresent()) {
            removeFromCartButton.click();
        }
    }

    @Override
    public CheckoutInfoPageBase goToCheckout() {
        checkoutButton.click();
        return new AndroidCheckoutInfoPage(getDriver());
    }

    @Override
    public ProductsPageBase continueShopping() {
        continueShoppingButton.click();
        return new AndroidProductsPage(getDriver());
    }
}
