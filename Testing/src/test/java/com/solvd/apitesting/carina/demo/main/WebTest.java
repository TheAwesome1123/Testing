package com.solvd.apitesting.carina.demo.main;

import com.solvd.apitesting.carina.demo.pages.HomePage;
import com.solvd.apitesting.carina.demo.pages.VideoPage;
import com.solvd.apitesting.carina.demo.web.services.HomePageService;
import com.solvd.apitesting.carina.demo.pages.ResultsPage;
import com.solvd.apitesting.carina.demo.pages.SignInPage;
import com.solvd.apitesting.carina.demo.web.services.ResultsPageService;
import com.solvd.apitesting.carina.demo.web.services.SignInPageService;
import com.solvd.apitesting.carina.demo.web.services.VideoPageService;
import com.zebrunner.carina.core.IAbstractTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest implements IAbstractTest {
    private static final Logger LOGGER = LogManager.getLogger(WebTest.class);
    private static final WebDriver webDriver = new ChromeDriver();
    private static final HomePageService HOME_PAGE_SERVICE = new HomePageService();
    private static final SignInPageService SIGN_IN_PAGE_SERVICE = new SignInPageService();
    private static final ResultsPageService RESULTS_PAGE_SERVICE = new ResultsPageService();
    private static final VideoPageService VIDEO_PAGE_SERVICE = new VideoPageService();

    @Test
    public void searchForVideo() {
        try {
            ResultsPage resultsPage = RESULTS_PAGE_SERVICE.getToResultsPage(webDriver, "mute city");
            resultsPage.clickOnVideo();
            Thread.sleep(5000);
            webDriver.quit();
        }
        catch (InterruptedException e) {
            LOGGER.info(e);
        }
    }

    @Test
    public void signInWithInvalidEmail() {
        SignInPage signInPage = SIGN_IN_PAGE_SERVICE.goToSignInPage(webDriver);
        signInPage.inputEmail("test");
        Assert.assertTrue(signInPage.isEmailErrorMessagePresent(), "Valid email.");
        webDriver.quit();
    }

    @Test
    public void signInWithEmail() {
        SignInPage signInPage = SIGN_IN_PAGE_SERVICE.goToSignInPage(webDriver);
        signInPage.inputEmail("sdn4900@gmail.com");
        Assert.assertTrue(signInPage.isInsecureBrowserWarningPresent(), "Secure browser.");
        webDriver.quit();
    }

    @Test
    public void goToHomePageFromVideoPage() {
        try {
            VideoPage videoPage = VIDEO_PAGE_SERVICE.getVideoPage(webDriver);
            videoPage.goToHomePage();
            Thread.sleep(5000);
            webDriver.quit();
        }
        catch (InterruptedException e) {
            LOGGER.info(e);
        }
    }

    @Test
    public void goToTrendingPage() {
        HomePage homePage = HOME_PAGE_SERVICE.openHomePage(webDriver);
        homePage.clickHotbar();
        homePage.clickTrendingButton();
        webDriver.quit();
    }
}
