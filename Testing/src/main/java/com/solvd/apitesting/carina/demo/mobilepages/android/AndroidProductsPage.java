package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobilepages.common.CartPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.HomePageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.ProductsPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AndroidProductsPage extends ProductsPageBase {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
    private ExtendedWebElement productsHeader;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView")
    private ExtendedWebElement cartButton;
    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]")
    private ExtendedWebElement addBackpackToCartButton;
    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])")
    private ExtendedWebElement addBikeLightToCartButton;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]")
    private ExtendedWebElement menuButton;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGOUT\"]")
    private ExtendedWebElement logoutButton;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private ExtendedWebElement sortButton;
    @FindBy(xpath = "//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView")
    private ExtendedWebElement lowToHighPriceOption;
    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]")
    private ExtendedWebElement onesieLabel;

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

    @Override
    public HomePageBase logout() {
        menuButton.click();
        logoutButton.click();
        return new AndroidHomePage(getDriver());
    }

    @Override
    public void sortFromLowToHighPrice() {
        sortButton.click();
        lowToHighPriceOption.click();
        Assert.assertEquals(onesieLabel.getText(), "Sauce Labs Onesie");
    }

    public ExtendedWebElement getProductsHeader() {
        return productsHeader;
    }

    public void setProductsHeader(ExtendedWebElement productsHeader) {
        this.productsHeader = productsHeader;
    }

    public ExtendedWebElement getCartButton() {
        return cartButton;
    }

    public void setCartButton(ExtendedWebElement cartButton) {
        this.cartButton = cartButton;
    }

    public ExtendedWebElement getAddBackpackToCartButton() {
        return addBackpackToCartButton;
    }

    public void setAddBackpackToCartButton(ExtendedWebElement addBackpackToCartButton) {
        this.addBackpackToCartButton = addBackpackToCartButton;
    }

    public ExtendedWebElement getAddBikeLightToCartButton() {
        return addBikeLightToCartButton;
    }

    public void setAddBikeLightToCartButton(ExtendedWebElement addBikeLightToCartButton) {
        this.addBikeLightToCartButton = addBikeLightToCartButton;
    }

    public ExtendedWebElement getMenuButton() {
        return menuButton;
    }

    public void setMenuButton(ExtendedWebElement menuButton) {
        this.menuButton = menuButton;
    }

    public ExtendedWebElement getLogoutButton() {
        return logoutButton;
    }

    public void setLogoutButton(ExtendedWebElement logoutButton) {
        this.logoutButton = logoutButton;
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

    public ExtendedWebElement getOnesieLabel() {
        return onesieLabel;
    }

    public void setOnesieLabel(ExtendedWebElement onesieLabel) {
        this.onesieLabel = onesieLabel;
    }
}
