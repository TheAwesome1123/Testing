package com.solvd.apitesting.carina.demo.web.services;

import com.solvd.apitesting.carina.demo.pages.HomePage;
import com.solvd.apitesting.carina.demo.pages.ResultsPage;
import com.zebrunner.carina.webdriver.IDriverPool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResultsPageService implements IDriverPool {
    public ResultsPage getToResultsPage(String search) {
        HomePage homePage = new HomePageService().openHomePage();
        return homePage.makeSearch(search);
    }
}
