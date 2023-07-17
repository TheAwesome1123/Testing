package com.solvd.apitesting.carina.demo.customclasses;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/posts/add", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/users/_post/PostRequest.json")
@ResponseTemplatePath(path = "api/users/_post/PostResponse.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PostPost extends AbstractApiMethodV2 {
    public PostPost(String newURL) {
        super("api/users/_post/PostRequest.json", "api/users/_post/PostResponse.json",
            "api/users/_post/PostRequest.properties");
        replaceUrlPlaceholder("base_url", Configuration.getRequired(newURL));
    }
}
