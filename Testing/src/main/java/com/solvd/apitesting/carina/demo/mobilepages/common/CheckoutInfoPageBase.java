package com.solvd.apitesting.carina.demo.mobilepages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CheckoutInfoPageBase extends AbstractPage {
    public CheckoutInfoPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract CheckoutReviewPageBase enterCheckoutInfo(String firstName, String lastName, String zip);
}
