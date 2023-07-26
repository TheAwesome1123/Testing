package com.solvd.apitesting.carina.demo.main;

import com.solvd.apitesting.carina.demo.webpages.HomePage;
import com.solvd.apitesting.carina.demo.webpages.VideoPage;
import com.solvd.apitesting.carina.demo.web.services.HomePageService;
import com.solvd.apitesting.carina.demo.webpages.ResultsPage;
import com.solvd.apitesting.carina.demo.webpages.SignInPage;
import com.solvd.apitesting.carina.demo.web.services.ResultsPageService;
import com.solvd.apitesting.carina.demo.web.services.SignInPageService;
import com.solvd.apitesting.carina.demo.web.services.VideoPageService;
import com.zebrunner.carina.core.IAbstractTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest implements IAbstractTest {
    private static final Logger LOGGER = LogManager.getLogger(WebTest.class);
    private static final HomePageService HOME_PAGE_SERVICE = new HomePageService();
    private static final SignInPageService SIGN_IN_PAGE_SERVICE = new SignInPageService();
    private static final ResultsPageService RESULTS_PAGE_SERVICE = new ResultsPageService();
    private static final VideoPageService VIDEO_PAGE_SERVICE = new VideoPageService();

    @Test
    public void searchForVideo() {
        ResultsPage resultsPage = RESULTS_PAGE_SERVICE.getToResultsPage("mute city");
        resultsPage.clickOnVideo();
    }

    @Test
    public void signInWithInvalidEmail() {
        SignInPage signInPage = SIGN_IN_PAGE_SERVICE.goToSignInPage();
        signInPage.inputEmail("test");
        Assert.assertTrue(signInPage.isEmailErrorMessagePresent(), "Valid email.");
    }

    @Test
    public void signInWithEmail() {
        SignInPage signInPage = SIGN_IN_PAGE_SERVICE.goToSignInPage();
        signInPage.inputEmail("sdn4900@gmail.com");
        Assert.assertTrue(signInPage.isInsecureBrowserWarningPresent(), "Secure browser.");
    }

    @Test
    public void goToHomePageFromVideoPage() {
        VideoPage videoPage = VIDEO_PAGE_SERVICE.getVideoPage();
        videoPage.goToHomePage();
    }

    @Test
    public void goToTrendingPage() {
        HomePage homePage = HOME_PAGE_SERVICE.openHomePage();
        homePage.clickHotbar();
        homePage.clickTrendingButton();
    }
}
