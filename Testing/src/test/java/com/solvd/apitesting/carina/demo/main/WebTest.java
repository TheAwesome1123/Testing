package com.solvd.apitesting.carina.demo.main;

import com.solvd.apitesting.carina.demo.web.HomePage;
import com.solvd.apitesting.carina.demo.web.ResultsPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTest implements IAbstractTest {
    private static final WebDriver webDriver = new ChromeDriver();

    @Test
    public void searchForVideo() {
        HomePage homePage = new HomePage(webDriver);
        homePage.open();
        homePage.makeSearch("mute city");

        ResultsPage resultsPage = new ResultsPage(webDriver);
        resultsPage.clickOnVideo();
    }
}
