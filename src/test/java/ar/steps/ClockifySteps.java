package ar.steps;

import ar.validator.ClienteValidador;
import ar.validator.ProyectoValidador;
import ar.validator.WorkspaceValidador;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;
import services.WorkspaceService;

public class ClockifySteps extends PageSteps {
    @Given("^Con una cuenta creada en Clockify y X-Api-Key '(.*)' generados$")
    public static void XApiKey(String token){
        BaseService.X_API_KEY.set(token);
    }

    @Then("Obtengo los datos de mi Workspace")
    public void DatosWorkspace() {
        WorkspaceValidador.validate();
    }

    @And("obtengo un workspaceId")
    public void WorkspaceID() {
        WorkspaceService.defineWorkspaceId();
    }

    @And("^Se crea el nombre del proyecto (.*)$")
    public void NombreDelProyecto(String nameProyecto) {
        BaseService.NAME_PROYECTO.set(nameProyecto);
    }

    @And("^tengo un nombre de cliente (.*)$")
    public void NombreDeCliente(String name) {
        BaseService.NAME_CLIENT.set(name);
    }

    @And("^Validacion del cliente (.*)$")
    public void ValidacionCliente(String name) {
        ClienteValidador.validador(name);
    }

    @And("^Validacion del proyecto (.*)$")
    public void ValidacionProyecto(String name) {
        ProyectoValidador.validador(name);
    }

}
