package com.solvd.apitesting.carina.demo.mobilepages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class GeneralSettingsPageBase extends AbstractPage {
    public GeneralSettingsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void viewAppearanceSettings();
}
