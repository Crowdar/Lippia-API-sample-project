package ar.steps;

import java.lang.reflect.InvocationTargetException;

import api.Model.Data;
import api.Model.User;
import org.testng.Assert;

import com.crowdar.core.PageSteps;

import api.Model.PageBase;
import api.config.EntityConfiguration;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UserSteps extends PageSteps {

    @Given("^As an api user for example endpoint$")
    public void asAnApiUserForExampleEndpoint()  {
    }

    @When("^I perform a '(.*)' to '(.*)' endpoint with the '(.*)'$")
    public void iPerformAGETToUsersEndpointWithTheIdId(String method, String entity, String value) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    	System.out.println(method.toLowerCase());
    	EntityConfiguration.valueOf(entity).getEntityService().getMethod(method.toLowerCase(), String.class).invoke("", value);
    }
    
    @Then("^I will get the proper status code '(.*)'$")
    public void iWillGetTheProperStatusCodeStatusCode(String expStatusCode) {
        int actualStatuscode = PageBase.getLastResponse().getStatusCode();
        Assert.assertEquals(Integer.parseInt(expStatusCode),actualStatuscode, "The status code are no equal" );
    }

    @And("^The proper '(.*)' '(.*)' returned in the response$")
    public void theProperIdReturnedInTheResponse(String property, String value) {
        if(!value.isEmpty()){
            Data response = (Data)PageBase.getLastResponse().getResponse();
            Assert.assertEquals(String.valueOf(response.getUser().getId()),value, "The " + property + " is not in the response");
        }
    }
}
