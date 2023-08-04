package com.solvd.apitesting.carina.demo.mobiletesting.android;

import com.solvd.apitesting.carina.demo.mobiletesting.common.*;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductsPageBase.class)
public class AndroidProductsPage extends ProductsPageBase {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
    private HeaderBar headerBar;
    @FindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-PRODUCTS\"]")
    private List<Product> products;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup")
    private ExtendedWebElement sortButton;
    @FindBy(xpath = "//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView")
    private ExtendedWebElement lowToHighPriceOption;

    public AndroidProductsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(sortButton);
    }

    @Override
    public void addProductToCart(String name) {
        for (Product product : products) {
            if(product.getName().equals(name)) {
                product.clickAddToCartButton();
            }
        }
    }

    @Override
    public CartPageBase goToCart() {
        headerBar.getCartButton().click();
        return new AndroidCartPage(getDriver());
    }

    @Override
    public HomePageBase goToMenu() {
        MenuOptions menuOptions = headerBar.clickMenuButton();
        menuOptions.clickLogoutButton();
        return new AndroidHomePage(getDriver());
    }

    @Override
    public void sortFromLowToHighPrice() {
        sortButton.click();
        lowToHighPriceOption.click();
        Assert.assertEquals(products.get(0).getName(), "Sauce Labs Onesie");
    }

    public ExtendedWebElement getSortButton() {
        return sortButton;
    }

    public void setSortButton(ExtendedWebElement sortButton) {
        this.sortButton = sortButton;
    }

    public ExtendedWebElement getLowToHighPriceOption() {
        return lowToHighPriceOption;
    }

    public void setLowToHighPriceOption(ExtendedWebElement lowToHighPriceOption) {
        this.lowToHighPriceOption = lowToHighPriceOption;
    }
}
