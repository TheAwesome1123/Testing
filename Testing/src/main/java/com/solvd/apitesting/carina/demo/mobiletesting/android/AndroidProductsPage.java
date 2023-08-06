package com.solvd.apitesting.carina.demo.mobiletesting.android;

import com.solvd.apitesting.carina.demo.mobiletesting.common.*;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductsPageBase.class)
public class AndroidProductsPage extends ProductsPageBase implements IMobileUtils {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
    private HeaderBar headerBar;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Item\"]")
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
    public void addProduct(String name) {
        for(Product product : products) {
            if(product.getProductName().equals(name)) {
                product.clickAddToCartButton();
                break;
            }
        }
    }

    @Override
    public CartPageBase goToCart() {
        return headerBar.clickCartButton();
    }

    @Override
    public MenuOptions goToMenu() {
        return headerBar.goToMenu();
    }

    @Override
    public void sortFromLowToHighPrice() {
        sortButton.click();
        lowToHighPriceOption.click();
    }

    public boolean isOnesiePresent() {
        return products.get(0).getProductName().equals("Sauce Labs Onesie");
    }
}
