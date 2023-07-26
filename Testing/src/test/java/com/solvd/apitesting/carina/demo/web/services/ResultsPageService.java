package com.solvd.apitesting.carina.demo.web.services;

import com.solvd.apitesting.carina.demo.webpages.HomePage;
import com.solvd.apitesting.carina.demo.webpages.ResultsPage;
import com.zebrunner.carina.webdriver.IDriverPool;

public class ResultsPageService implements IDriverPool {
    public ResultsPage getToResultsPage(String search) {
        HomePage homePage = new HomePageService().openHomePage();
        return homePage.makeSearch(search);
    }
}
