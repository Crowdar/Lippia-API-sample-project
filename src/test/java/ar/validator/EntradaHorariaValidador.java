package ar.validator;

import api.model.EntredaHoraria.EntradaHorariaResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class EntradaHorariaValidador {
    public static void validador() {
        EntradaHorariaResponse[] response = (EntradaHorariaResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].getId(), "El campo ID es nulo");
    }
}
