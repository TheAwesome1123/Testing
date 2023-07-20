package com.solvd.apitesting.carina.demo.web.services;

import com.solvd.apitesting.carina.demo.pages.ResultsPage;
import com.solvd.apitesting.carina.demo.pages.VideoPage;
import org.openqa.selenium.WebDriver;

public class VideoPageService {
    public VideoPage getVideoPage(WebDriver webDriver) {
        ResultsPage resultsPage = new ResultsPageService().getToResultsPage(webDriver, "mute city");
        resultsPage.clickOnVideo();
        return new VideoPage(webDriver);
    }
}
