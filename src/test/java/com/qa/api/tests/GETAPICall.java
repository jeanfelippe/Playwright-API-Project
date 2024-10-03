package com.qa.api.tests;

import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class GETAPICall {

    @Test
    public void getUsersApiTest(){
        Playwright playwright=Playwright.create();
        APIRequest request = playwright.request();
        APIRequestContext requestContext= request.newContext();
        APIResponse apiResponse= requestContext.get("https://reqres.in/api/users");

        int statusCode= apiResponse.status();
        String responseMessage = apiResponse.text();
        //Recebo o status da request
        System.out.println("response status code "+statusCode);
        //recebo o response da request
        System.out.println("response status codee "+responseMessage);


    }
}
