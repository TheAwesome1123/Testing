package com.solvd.apitesting.carina.demo.mobilepages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class VideoPageBase extends AbstractPage {
    public VideoPageBase(WebDriver webDriver) {
        super(webDriver);
    }

    public abstract HomePageBase goToHomePage();

    public abstract ChannelPageBase goToChannelPage();
}
