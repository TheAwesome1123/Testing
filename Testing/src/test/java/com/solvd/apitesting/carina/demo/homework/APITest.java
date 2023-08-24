package com.solvd.apitesting.carina.demo.homework;

import com.solvd.apitesting.carina.demo.api.GetUser;
import com.solvd.apitesting.carina.demo.api.GetUsers;
import com.solvd.apitesting.carina.demo.api.PostPost;
import com.solvd.apitesting.carina.demo.api.PutCart;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.core.IAbstractTest;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class APITest implements IAbstractTest {
    @Test
    public static void testGetUsers() {
        GetUsers getUsers = new GetUsers("api_url");
        getUsers.callAPIExpectSuccess();
        getUsers.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsers.validateResponseAgainstSchema("api/users/_get/AllUsersResponse.schema");
    }

    @Test
    public static void testGetUser() {
        GetUser getUser = new GetUser("api_url");
        getUser.callAPIExpectSuccess();
        getUser.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUser.validateResponseAgainstSchema("api/users/_get/UserResponse.schema");
    }

    @Test
    public static void testPostPost() {
        PostPost postPost = new PostPost("api_url");
        //postPost.setProperties("api/users/_post/PostRequest.properties");
        postPost.callAPIExpectSuccess();
        postPost.validateResponse();
    }

    @Test
    public static void testPutCart() {
        PutCart putCart = new PutCart("api_url");
        putCart.callAPIExpectSuccess();
        putCart.validateResponse();
    }
}
