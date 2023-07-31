package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.*;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductsPageBase.class)
public class AndroidProductsPage extends ProductsPageBase {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
    private HeaderBar headerBar;
    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]")
    private ExtendedWebElement addBackpackToCartButton;
    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])")
    private ExtendedWebElement addBikeLightToCartButton;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private ExtendedWebElement sortButton;
    @FindBy(xpath = "//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView")
    private ExtendedWebElement lowToHighPriceOption;
    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]")
    private ExtendedWebElement onesieLabel;

    public AndroidProductsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(sortButton);
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
        Assert.assertEquals(onesieLabel.getText(), "Sauce Labs Onesie");
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
