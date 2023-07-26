package com.solvd.apitesting.carina.demo.main;

import com.solvd.apitesting.carina.demo.mobilepages.android.AndroidHomePage;
import com.solvd.apitesting.carina.demo.mobilepages.common.CartPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.HomePageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.ProductsPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileTest implements IAbstractTest, IMobileUtils {
    @Test
    public void testInvalidUserNameAndPassword() {
        ProductsPageBase productsPage = getPastHomePage("test", "test");
        Assert.assertFalse(productsPage.isPageOpened());
    }

    @Test
    public void testValidUserNameAndPassword() {
        ProductsPageBase productsPage = getPastHomePage("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isPageOpened());
    }

    @Test
    public void addAndRemoveItemsFromCart() {
        ProductsPageBase productsPage = getPastHomePage("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isPageOpened());

        productsPage.addBackpackToCart();
        productsPage.addBikeLightToCart();
        CartPageBase cartPage = productsPage.goToCart();
        Assert.assertTrue(cartPage.isPageOpened());

        cartPage.removeItems();
        Assert.assertFalse(cartPage.getRemoveFromCartButton().isElementPresent());
    }

    // Helper method.
    public ProductsPageBase getPastHomePage(String username, String password) {
        AndroidHomePage homePage = new AndroidHomePage(getDriver());
        homePage.inputCredentials(username, password);
        return homePage.clickLoginButton();
    }
}