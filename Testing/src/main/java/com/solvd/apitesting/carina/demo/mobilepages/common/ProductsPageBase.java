package com.solvd.apitesting.carina.demo.mobilepages.common;

import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ProductsPageBase extends AbstractPage {
    public ProductsPageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

    public abstract void addBackpackToCart();
    public abstract void addBikeLightToCart();
    public abstract CartPageBase goToCart();
    public abstract HomePageBase logout();
    public abstract void sortFromLowToHighPrice();
}
