package ar.validaciones;

import com.crowdar.api.rest.APIManager;
import api.model.ProyectoResponse;
import org.testng.Assert;

public class ValidacionProyecto {
    public static void validador() {
        ProyectoResponse[] response = (ProyectoResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].getId(), "El campo ID es nulo");
    }
}
