package com.solvd.apitesting.carina.demo.mobilepages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ResultsPageBase extends AbstractPage {
    public ResultsPageBase(WebDriver webDriver) {
        super(webDriver);
    }

    public abstract VideoPageBase clickOnVideo();
}
