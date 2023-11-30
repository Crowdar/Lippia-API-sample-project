package ar.steps;

import ar.validator.EntradaHorariaValidador;
import ar.validator.WorkspaceValidador;
import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.*;

public class EntradaHorariaSteps extends PageSteps {
    @Given("Con una cuenta creada en Clockify y X-Api-Key")
    public void xApiKey() {
        BaseService.X_API_KEY.set(PropertyManager.getProperty("apiKey"));
    }
    @Then("Obtengo mis workspaces")
    public void workspace() {
        WorkspaceValidador.validador();
    }
    @Then("Obtengo un workspaceid valido")
    public void workspaceId() {
        WorkspaceService.obtengoWorkspaceId();
    }
    @And("Obtengo el usuarioid valido")
    public void usuarioid() {
        BaseService.ID.set("633f5b69648048064054af2b");
    }
    @Then("Obtengo las horas consultadas")
    public void consultas() {
        EntradaHorariaValidador.validador();
    }
    @And("Obtengo una entradaHorariaId")
    public void entradaHorariaID() {BaseService.ENTRADA_HORARIA.set("656846d42a47c52a01332e7e");}
}
