package com.solvd.apitesting.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/users", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/users/_get/AllUsersResponse.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetUsers extends AbstractApiMethodV2 {
    public GetUsers(String newURL) {
        replaceUrlPlaceholder("base_url", Configuration.getRequired(newURL));
    }
}
