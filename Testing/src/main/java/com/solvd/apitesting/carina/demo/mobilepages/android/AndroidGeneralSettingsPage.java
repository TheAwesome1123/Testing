package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobilepages.common.GeneralSettingsPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public class AndroidGeneralSettingsPage extends GeneralSettingsPageBase {
    private ExtendedWebElement appearanceSettingsButton;

    public AndroidGeneralSettingsPage(WebDriver driver) {
        super(driver);
    }

    public void viewAppearanceSettings() {
        this.appearanceSettingsButton.click();
    }
}
