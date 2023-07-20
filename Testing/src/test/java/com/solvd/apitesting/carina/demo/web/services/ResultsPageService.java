package com.solvd.apitesting.carina.demo.web.services;

import com.solvd.apitesting.carina.demo.pages.HomePage;
import com.solvd.apitesting.carina.demo.pages.ResultsPage;
import org.openqa.selenium.WebDriver;

public class ResultsPageService {
    public ResultsPage getToResultsPage(WebDriver webDriver, String search) {
        HomePage homePage = new HomePageService().openHomePage(webDriver);
        homePage.makeSearch(search);
        return new ResultsPage(webDriver);
    }
}
