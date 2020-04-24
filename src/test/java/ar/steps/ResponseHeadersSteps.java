package ar.steps;

import api.model.ResponseHeaders;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.io.IOException;

public class ResponseHeadersSteps extends PageSteps {

    @Then("^I will get the proper response in '(.*)'$")
    public void iWillGetTheProperResponse(String jsonName) throws IOException {
        ResponseHeaders expectedResponse = APIManager.getResponseFromJsonFile(jsonName, ResponseHeaders.class);
        ResponseHeaders actualResponse = (ResponseHeaders) APIManager.getLastResponse().getResponse();

        Assert.assertEquals(actualResponse.getFoo1(), expectedResponse.getFoo1());
        Assert.assertEquals(actualResponse.getFoo2(), expectedResponse.getFoo2());
    }
}
