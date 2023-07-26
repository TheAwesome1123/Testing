package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobilepages.common.CartPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.ProductsPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AndroidProductsPage extends ProductsPageBase {
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private ExtendedWebElement productsHeader;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView")
    private ExtendedWebElement cartButton;
    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]")
    private ExtendedWebElement addBackpackToCartButton;
    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])")
    private ExtendedWebElement addBikeLightToCartButton;

    public AndroidProductsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(productsHeader);
    }

    @Override
    public void addBackpackToCart() {
        addBackpackToCartButton.click();
    }

    @Override
    public void addBikeLightToCart() {
        addBikeLightToCartButton.click();
    }

    @Override
    public CartPageBase goToCart() {
        cartButton.click();
        return new AndroidCartPage(getDriver());
    }
}
