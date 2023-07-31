package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.CheckoutReviewPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AndroidCheckoutReviewPage.class)
public class AndroidCheckoutReviewPage extends CheckoutReviewPageBase {
    @FindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: OVERVIEW\"]")
    private ExtendedWebElement checkoutOverview;

    public AndroidCheckoutReviewPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(checkoutOverview);
    }

    public boolean isOverviewPresent() {
        return checkoutOverview.isElementPresent();
    }

    public ExtendedWebElement getCheckoutOverview() {
        return checkoutOverview;
    }

    public void setCheckoutOverview(ExtendedWebElement checkoutOverview) {
        this.checkoutOverview = checkoutOverview;
    }
}
