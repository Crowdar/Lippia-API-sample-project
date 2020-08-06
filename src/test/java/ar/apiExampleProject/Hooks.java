package ar.apiExampleProject;
import gherkin.ast.Scenario;
import io.cucumber.java.*;
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
