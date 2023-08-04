package com.solvd.apitesting.carina.demo.mobiletesting.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Product extends AbstractUIObject {
    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])")
    private ExtendedWebElement addToCartButton;
    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])")
    private ExtendedWebElement name;

    public Product(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public String getName() {
        return name.getText();
    }
}
