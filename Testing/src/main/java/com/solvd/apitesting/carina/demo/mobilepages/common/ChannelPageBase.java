package com.solvd.apitesting.carina.demo.mobilepages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ChannelPageBase extends AbstractPage {
    public ChannelPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract PlaylistPageBase goToPlaylists();
}
