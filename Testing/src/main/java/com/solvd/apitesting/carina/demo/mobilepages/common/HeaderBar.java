package com.solvd.apitesting.carina.demo.mobilepages.common;

import com.solvd.apitesting.carina.demo.mobilepages.android.AndroidHomePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderBar extends AbstractUIObject {
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]")
    private ExtendedWebElement menuButton;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGOUT\"]")
    private ExtendedWebElement logoutButton;

    public HeaderBar(WebDriver driver) {
        super(driver);
    }

    public void clickMenuButton() {
        menuButton.click();
    }

    public HomePageBase clickLogoutButton() {
        logoutButton.click();
        return new AndroidHomePage(getDriver());
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
}
