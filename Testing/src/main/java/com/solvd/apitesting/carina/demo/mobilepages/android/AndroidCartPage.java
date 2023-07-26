package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobilepages.common.CartPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AndroidCartPage extends CartPageBase {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
    private ExtendedWebElement cartHeader;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-REMOVE\"]/android.widget.TextView")
    private ExtendedWebElement removeFromCartButton;

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

    public ExtendedWebElement getCartHeader() {
        return cartHeader;
    }

    public void setCartHeader(ExtendedWebElement cartHeader) {
        this.cartHeader = cartHeader;
    }

    public ExtendedWebElement getRemoveFromCartButton() {
        return removeFromCartButton;
    }

    public void setRemoveFromCartButton(ExtendedWebElement removeFromCartButton) {
        this.removeFromCartButton = removeFromCartButton;
    }
}
