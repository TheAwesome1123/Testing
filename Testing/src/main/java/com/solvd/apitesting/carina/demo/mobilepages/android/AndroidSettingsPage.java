package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobilepages.common.GeneralSettingsPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.SettingsPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public class AndroidSettingsPage extends SettingsPageBase {
    private ExtendedWebElement generalSettingsButton;

    public AndroidSettingsPage(WebDriver driver) {
        super(driver);
    }

    public GeneralSettingsPageBase goToGeneralSettings() {
        this.generalSettingsButton.click();
        return new AndroidGeneralSettingsPage(getDriver());
    }
}
