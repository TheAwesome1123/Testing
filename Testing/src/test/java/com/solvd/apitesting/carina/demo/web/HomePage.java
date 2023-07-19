package com.solvd.apitesting.carina.demo.web;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(xpath = "/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")
    private ExtendedWebElement searchBar;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void makeSearch(String search) {
        searchBar.assertElementPresent();
        searchBar.click();
        searchBar.type(search);
        searchBar.sendKeys(Keys.ENTER);
    }
}
