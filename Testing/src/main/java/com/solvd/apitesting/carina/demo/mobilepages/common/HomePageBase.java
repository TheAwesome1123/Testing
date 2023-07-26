package com.solvd.apitesting.carina.demo.mobilepages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {
    public HomePageBase(WebDriver webDriver) {
        super(webDriver);
    }

    public abstract ResultsPageBase makeSearch(String search);
}
