package ar.validator;

import api.model.workspaces.WorkspacesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class ProyectoValidador {
    public static void validador(String name){
        Object response = APIManager.getLastResponse().getResponse();

        if (response instanceof WorkspacesResponse) {
            WorkspacesResponse workspacesResponse = (WorkspacesResponse) response;

            Assert.assertEquals(workspacesResponse.getName(), name, "Los nombres no coinciden");
            Assert.assertTrue(workspacesResponse.getName().equalsIgnoreCase(name), "Los nombres no coinciden");
        } else {
            Assert.fail("La respuesta de la API no es un objeto de tipo ClienteResponse");
        }
    }
}
