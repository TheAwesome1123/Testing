package com.solvd.apitesting.carina.demo.web.services;

import com.solvd.apitesting.carina.demo.pages.HomePage;
import com.solvd.apitesting.carina.demo.pages.SignInPage;
import org.openqa.selenium.WebDriver;

public class SignInPageService {
    public SignInPage goToSignInPage(WebDriver webDriver) {
        HomePage homePage = new HomePageService().openHomePage(webDriver);
        homePage.clickSignInButton();
        return new SignInPage(webDriver);
    }
}
