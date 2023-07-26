package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobilepages.common.ChannelPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.VideoPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public class AndroidVideoPage extends VideoPageBase {
    private ExtendedWebElement linkToChannel;

    public AndroidVideoPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AndroidHomePage goToHomePage() {
        return new AndroidHomePage(getDriver());
    }

    public ChannelPageBase goToChannelPage() {
        this.linkToChannel.click();
        return new AndroidChannelPage(getDriver());
    }
}
