package com.solvd.apitesting.carina.demo.main;

import com.solvd.apitesting.carina.demo.customclasses.GetUser;
import com.solvd.apitesting.carina.demo.customclasses.GetUsers;
import com.solvd.apitesting.carina.demo.customclasses.PostPost;
import com.solvd.apitesting.carina.demo.customclasses.PutCart;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import org.skyscreamer.jsonassert.JSONCompareMode;

public class HelperMethods {
    public static void testGetUsers() {
        GetUsers getUsers = new GetUsers("api_url");
        getUsers.callAPIExpectSuccess();
        getUsers.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsers.validateResponseAgainstSchema("api/users/_get/AllUsersResponse.schema");
    }

    public static void testGetUser() {
        GetUser getUser = new GetUser("api_url");
        getUser.callAPIExpectSuccess();
        getUser.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUser.validateResponseAgainstSchema("api/users/_get/UserResponse.schema");
    }

    public static void testPostPost() {
        PostPost postPost = new PostPost("api_url");
        postPost.setProperties("api/users/_post/PostRequest.properties");
        postPost.callAPIExpectSuccess();
        postPost.validateResponse();
    }

    public static void testPutCart() {
        PutCart putCart = new PutCart("api_url");
        putCart.callAPIExpectSuccess();
        putCart.validateResponse();
    }
}
