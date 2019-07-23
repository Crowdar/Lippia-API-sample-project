package ar.steps;

import api.model.Data;
import api.config.EntityConfiguration;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.lang.reflect.InvocationTargetException;

public class UserSteps extends PageSteps {

    @Given("^As an api user for example endpoint$")
    public void asAnApiUserForExampleEndpoint() {
    }

    @When("^I perform a '(.*)' to '(.*)' endpoint with the '(.*)'$")
    public void iPerformAGETToUsersEndpointWithTheIdId(String method, String entity, String value) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(method.toLowerCase(), String.class).invoke("", value);
    }

    @Then("^I will get the proper status code '(.*)'$")
    public void iWillGetTheProperStatusCodeStatusCode(String expStatusCode) {
        int actualStatusCode = APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(Integer.parseInt(expStatusCode), actualStatusCode, "The status code are not equals");
    }

    @And("^The proper '(.*)' '(.*)' returned in the response$")
    public void theProperIdReturnedInTheResponse(String property, String value) {
        if (!value.isEmpty()) {
            Data response = (Data) APIManager.getLastResponse().getResponse();
            Assert.assertEquals(String.valueOf(response.getUser().getId()), value, "The " + property + " is not in the response");
        }
    }
}
