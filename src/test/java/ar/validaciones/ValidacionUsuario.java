package ar.validaciones;

import api.model.UsuarioResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class ValidacionUsuario {
    public static void validador() {
        UsuarioResponse[] response = (UsuarioResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].getId(), "El campo ID es nulo");
    }
}
