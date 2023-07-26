package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobilepages.common.ChannelPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.PlaylistPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public class AndroidChannelPage extends ChannelPageBase {
    private ExtendedWebElement playlistButton;

    public AndroidChannelPage(WebDriver driver) {
        super(driver);
    }

    public PlaylistPageBase goToPlaylists() {
        this.playlistButton.click();
        return new AndroidPlaylistPage(getDriver());
    }
}
