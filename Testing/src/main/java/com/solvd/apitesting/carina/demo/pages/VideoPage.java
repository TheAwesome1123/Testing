package com.solvd.apitesting.carina.demo.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class VideoPage extends AbstractPage {
    @FindBy(css = "#logo")
    private ExtendedWebElement homeButton;

    public VideoPage(WebDriver webDriver) {
        super(webDriver);
    }
    public void goToHomePage() {
        homeButton.click();
    }
}
