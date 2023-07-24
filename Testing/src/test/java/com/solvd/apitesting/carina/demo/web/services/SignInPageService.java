package com.solvd.apitesting.carina.demo.web.services;

import com.solvd.apitesting.carina.demo.pages.HomePage;
import com.solvd.apitesting.carina.demo.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInPageService {
    public SignInPage goToSignInPage() {
        HomePage homePage = new HomePageService().openHomePage();
        return homePage.clickSignInButton();
    }
}
