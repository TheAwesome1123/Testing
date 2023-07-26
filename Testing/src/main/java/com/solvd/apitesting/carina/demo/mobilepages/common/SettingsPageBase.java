package com.solvd.apitesting.carina.demo.mobilepages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SettingsPageBase extends AbstractPage {
    public SettingsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract GeneralSettingsPageBase goToGeneralSettings();
}
