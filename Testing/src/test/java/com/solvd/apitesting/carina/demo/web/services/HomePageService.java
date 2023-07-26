package com.solvd.apitesting.carina.demo.web.services;

import com.solvd.apitesting.carina.demo.webpages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageService {
    public HomePage openHomePage() {
        WebDriver webDriver = new ChromeDriver();
        HomePage homePage = new HomePage(webDriver);
        homePage.open();
        return homePage;
    }
}
