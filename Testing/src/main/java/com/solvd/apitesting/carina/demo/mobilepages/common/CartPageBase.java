package com.solvd.apitesting.carina.demo.mobilepages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class CartPageBase extends AbstractPage {
    private ExtendedWebElement cartHeader;
    private ExtendedWebElement removeFromCartButton;

    public CartPageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

    public abstract void removeItems();

    public ExtendedWebElement getCartHeader() {
        return cartHeader;
    }

    public void setCartHeader(ExtendedWebElement cartHeader) {
        this.cartHeader = cartHeader;
    }

    public ExtendedWebElement getRemoveFromCartButton() {
        return removeFromCartButton;
    }

    public void setRemoveFromCartButton(ExtendedWebElement removeFromCartButton) {
        this.removeFromCartButton = removeFromCartButton;
    }
}
