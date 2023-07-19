package com.solvd.apitesting.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/carts/1", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "api/users/_put/PutRequest.json")
@ResponseTemplatePath(path = "api/users/_put/PutResponse.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PutCart extends AbstractApiMethodV2 {
    public PutCart(String newURL) {
        replaceUrlPlaceholder("base_url", Configuration.getRequired(newURL));
    }
}
