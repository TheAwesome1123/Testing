package com.solvd.apitesting.carina.demo.webpages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends ParentPage {
    @FindBy(css = "#thumbnail[href=\"/watch?v=-yW4CMjpeNk&pp=ygUJbXV0ZSBjaXR5\"]")
    private ExtendedWebElement video;

    public ResultsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public VideoPage clickOnVideo() {
        this.video.click();
        return new VideoPage(getDriver());
    }
}
