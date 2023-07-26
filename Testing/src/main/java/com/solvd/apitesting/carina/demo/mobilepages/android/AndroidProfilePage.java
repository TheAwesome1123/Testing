package com.solvd.apitesting.carina.demo.mobilepages.android;

import com.solvd.apitesting.carina.demo.mobilepages.common.ProfilePageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.SettingsPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.SignInPageBase;
import com.solvd.apitesting.carina.demo.mobilepages.common.uielements.SignInButton;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public class AndroidProfilePage extends ProfilePageBase {
    private SignInButton signInButton;
    private ExtendedWebElement settingsButton;
    private ExtendedWebElement addAccountButton;

    public AndroidProfilePage(WebDriver driver) {
        super(driver);
    }

    public SettingsPageBase goToSettings() {
        this.settingsButton.click();
        return new AndroidSettingsPage(getDriver());
    }

    public SignInPageBase goToSignInPage() {
        // click sign in button
        this.addAccountButton.click();
        return new AndroidSignInPage(getDriver());
    }
}
