package com.solvd.apitesting.carina.demo.mobiletesting.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderBar extends AbstractUIObject {
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]")
    private ExtendedWebElement menuButton;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]")
    private ExtendedWebElement cartButton;

    public HeaderBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public MenuOptions clickMenuButton() {
        menuButton.click();
        return new MenuOptions(getDriver());
    }

    public ExtendedWebElement getMenuButton() {
        return menuButton;
    }

    public void setMenuButton(ExtendedWebElement menuButton) {
        this.menuButton = menuButton;
    }

    public ExtendedWebElement getCartButton() {
        return cartButton;
    }

    public void setCartButton(ExtendedWebElement cartButton) {
        this.cartButton = cartButton;
    }
}
