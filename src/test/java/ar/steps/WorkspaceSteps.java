package ar.steps;

import ar.validaciones.ValidacionWorkspace;
import com.crowdar.core.PropertyManager;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import services.BaseService;
import services.WorkspaceService;

public class WorkspaceSteps {
    @When("^Con una cuenta creada en Clockify y X-Api-Key generados$")
    public void apiKey(){
        BaseService.API_KEY.set(PropertyManager.getProperty("apiKey"));
    }
    @And("Obtengo los datos de mi Workspace")
    public void validacionWorkspace(){
        ValidacionWorkspace.validador();
    }
    @And("Obtengo un workspaceid valido")
    public void workspaceID(){
        WorkspaceService.obtengoWorkspaceId();
    }
}
