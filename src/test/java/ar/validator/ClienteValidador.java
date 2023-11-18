package ar.validator;

import api.model.ClienteResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class ClienteValidador {
    public static void validador(String name){
        Object response = APIManager.getLastResponse().getResponse();

        if (response instanceof ClienteResponse) {
            ClienteResponse clienteResponse = (ClienteResponse) response;

            Assert.assertEquals(clienteResponse.getName(), name, "Los nombres no coinciden");
            Assert.assertTrue(clienteResponse.getName().equalsIgnoreCase(name), "Los nombres no coinciden");
        } else {
            Assert.fail("La respuesta de la API no es un objeto de tipo ClienteResponse");
        }

    }
}
