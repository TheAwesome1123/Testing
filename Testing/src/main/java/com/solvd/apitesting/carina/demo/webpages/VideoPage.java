package com.solvd.apitesting.carina.demo.webpages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class VideoPage extends ParentPage {
    @FindBy(css = "#logo")
    private ExtendedWebElement homeButton;
    @FindBy(css = "yt-formatted-string[force-default-style]")
    private ExtendedWebElement videoTitle;

    public VideoPage(WebDriver webDriver) {
        super(webDriver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(videoTitle);
    }
    public HomePage goToHomePage() {
        homeButton.click();
        return new HomePage(getDriver());
    }
}
