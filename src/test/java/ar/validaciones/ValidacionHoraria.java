package ar.validaciones;

import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
import api.model.EntradaHorariaResponse;

public class ValidacionHoraria {
    public static void validador() {
        EntradaHorariaResponse[] response = (EntradaHorariaResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].getId(), "El campo ID es nulo");
    }
}
