package ar.apiExampleProject;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;

public class Hooks {

    @Before()
    public void setScenario(Scenario scenario) {
        Logger.getRootLogger().info("-----------" + scenario.getName() + "-----------");
    }

    @After()
    public void dismissAll(Scenario scenario) {
        Logger.getRootLogger().info(" ending -----------" + scenario.getName() + "-----------");

    }
}
