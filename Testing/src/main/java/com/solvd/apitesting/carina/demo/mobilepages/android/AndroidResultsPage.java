package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobilepages.common.ResultsPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public class AndroidResultsPage extends ResultsPageBase {
    private ExtendedWebElement video;

    public AndroidResultsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AndroidVideoPage clickOnVideo() {
        this.video.click();
        return new AndroidVideoPage(getDriver());
    }
}
