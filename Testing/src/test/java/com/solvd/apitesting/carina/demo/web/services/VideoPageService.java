package com.solvd.apitesting.carina.demo.web.services;

import com.solvd.apitesting.carina.demo.pages.ResultsPage;
import com.solvd.apitesting.carina.demo.pages.VideoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPageService {
    public VideoPage getVideoPage() {
        ResultsPage resultsPage = new ResultsPageService().getToResultsPage("mute city");
        return resultsPage.clickOnVideo();
    }
}
