package com.solvd.apitesting.carina.demo.mobilepages.common;

import com.solvd.apitesting.carina.demo.mobilepages.android.AndroidHomePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MenuOptions extends AbstractUIObject {
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGOUT\"]")
    private ExtendedWebElement logoutButton;

    public MenuOptions(WebDriver driver) {
        super(driver);
    }

    public HomePageBase clickLogoutButton() {
        logoutButton.click();
        return new AndroidHomePage(getDriver());
    }

    public ExtendedWebElement getLogoutButton() {
        return logoutButton;
    }

    public void setLogoutButton(ExtendedWebElement logoutButton) {
        this.logoutButton = logoutButton;
    }
}
