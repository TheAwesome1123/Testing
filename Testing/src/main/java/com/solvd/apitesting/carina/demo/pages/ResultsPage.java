package com.solvd.apitesting.carina.demo.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends AbstractPage {
    @FindBy(css = "#thumbnail[href=\"/watch?v=-yW4CMjpeNk&pp=ygUJbXV0ZSBjaXR5\"]")
    private ExtendedWebElement video;

    public ResultsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnVideo() {
        this.video.click();
    }
}
