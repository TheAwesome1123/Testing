package com.solvd.apitesting.carina.demo.main;

import com.solvd.apitesting.carina.demo.api.PostUserMethod;
import com.solvd.apitesting.carina.demo.customclasses.GetUser;
import com.solvd.apitesting.carina.demo.customclasses.GetUsers;
import com.solvd.apitesting.carina.demo.customclasses.PostPost;
import com.zebrunner.carina.api.APIMethodPoller;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        try {
            HelperMethods.testGetUsers();
            LOGGER.info("--------------------------");
            HelperMethods.testGetUser();
            LOGGER.info("--------------------------");
            HelperMethods.testPostPost();
            LOGGER.info("--------------------------");
            HelperMethods.testPutCart();
            LOGGER.info("Success");
        }
        catch(Exception e) {
            LOGGER.info(e);
        }
    }


}
