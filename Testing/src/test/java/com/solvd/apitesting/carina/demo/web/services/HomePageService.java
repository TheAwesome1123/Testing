package com.solvd.apitesting.carina.demo.web.services;

import com.solvd.apitesting.carina.demo.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class HomePageService {
    public HomePage openHomePage(WebDriver webDriver) {
        HomePage homePage = new HomePage(webDriver);
        homePage.open();
        return homePage;
    }
}
