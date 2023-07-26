package com.solvd.apitesting.carina.demo.web.services;

import com.solvd.apitesting.carina.demo.webpages.HomePage;
import com.solvd.apitesting.carina.demo.webpages.SignInPage;

public class SignInPageService {
    public SignInPage goToSignInPage() {
        HomePage homePage = new HomePageService().openHomePage();
        return homePage.clickSignInButton();
    }
}
