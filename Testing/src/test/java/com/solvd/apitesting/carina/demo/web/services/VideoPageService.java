package com.solvd.apitesting.carina.demo.web.services;

import com.solvd.apitesting.carina.demo.webpages.ResultsPage;
import com.solvd.apitesting.carina.demo.webpages.VideoPage;

public class VideoPageService {
    public VideoPage getVideoPage() {
        ResultsPage resultsPage = new ResultsPageService().getToResultsPage("mute city");
        return resultsPage.clickOnVideo();
    }
}
