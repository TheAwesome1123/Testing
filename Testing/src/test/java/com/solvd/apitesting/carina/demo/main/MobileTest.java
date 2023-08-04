package com.solvd.apitesting.carina.demo.main;

import com.solvd.apitesting.carina.demo.mobiletesting.common.*;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
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

        productsPage.addProductToCart("Sauce Labs Backpack");
        productsPage.addProductToCart("Sauce Labs Bike Light");

        CartPageBase cartPage = productsPage.goToCart();
        Assert.assertTrue(cartPage.isPageOpened());

        cartPage.removeItems();
        Assert.assertFalse(cartPage.getRemoveFromCartButton().isElementPresent());
    }

    @Test
    public void loginAndLogout() {
        ProductsPageBase productsPage = getPastHomePage("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isPageOpened());

        HomePageBase homePage2 = productsPage.goToMenu();
        Assert.assertTrue(homePage2.isPageOpened());
    }

    @Test
    public void addBackpackToCartThenGoBackToProducts() {
        ProductsPageBase productsPage = getPastHomePage("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isPageOpened());

        productsPage.addProductToCart("Sauce Labs Backpack");
        CartPageBase cartPage = productsPage.goToCart();
        Assert.assertTrue(cartPage.isPageOpened());

        ProductsPageBase productPage2 = cartPage.continueShopping();
        Assert.assertTrue(productPage2.isPageOpened());
    }

    @Test
    public void sortLowToHighPrice() {
        ProductsPageBase productsPage = getPastHomePage("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isPageOpened());

        productsPage.sortFromLowToHighPrice();
    }

//    @Test
//    public void goToCheckoutReview() {
//        ProductsPageBase productsPage = getPastHomePage("standard_user", "secret_sauce");
//        Assert.assertTrue(productsPage.isPageOpened());
//
//        CartPageBase cartPage = productsPage.goToCart();
//        Assert.assertTrue(cartPage.isPageOpened());
//
//        CheckoutInfoPageBase checkoutInfoPage = cartPage.goToCheckout();
//        CheckoutReviewPageBase checkoutReviewPage =
//            checkoutInfoPage.enterCheckoutInfo("test", "test", "test");
//        Assert.assertTrue(checkoutReviewPage.isOverviewPresent());
//    }

    // Helper method(s).
    public ProductsPageBase getPastHomePage(String username, String password) {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.inputCredentials(username, password);
        return homePage.clickLoginButton();
    }
}