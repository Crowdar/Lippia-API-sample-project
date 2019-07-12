package ar.steps;

import api.Model.PageBase;
import api.Model.User;
import com.crowdar.api.rest.Request;
import com.crowdar.api.rest.Response;
import com.crowdar.api.rest.RestClient;
import com.crowdar.core.JsonUtils;
import com.crowdar.core.PageSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.http.client.utils.URIBuilder;
import org.testng.Assert;

import java.io.File;
import java.net.URISyntaxException;

import static api.Model.PageBase.BASE_URL;


public class CommonSteps extends PageSteps {

    @Given("^As an api user for example endpoint$")
    public void asAnApiUserForExampleEndpoint()  {
    }

    @When("^I perform a GET to users endpoint with the id '(.*)'$")
    public void iPerformAGETToUsersEndpointWithTheIdId(String id) throws URISyntaxException {}


    @Then("^I will get the proper status code '(.*)'$")
    public void iWillGetTheProperStatusCodeStatusCode(String expStatusCode) {
        int actualStatuscode = PageBase.getLastResponse().getStatusCode();
        Assert.assertEquals(Integer.parseInt(expStatusCode),actualStatuscode, "The status code are no equal" );

    }

    @And("^The proper '(.*)' returned in the response$")
    public void theProperIdReturnedInTheResponse(String id) {
        String response = PageBase.getLastResponse().getResponse().toString();
        Assert.assertTrue(response.contains(id), "The id is not in the response");
    }
}
