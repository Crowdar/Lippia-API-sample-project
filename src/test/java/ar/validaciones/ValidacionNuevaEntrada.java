package ar.validaciones;

import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
import services.BaseService;
import api.model.EntradaHorariaResponse;

public class ValidacionNuevaEntrada {
    public static void validador() {
        EntradaHorariaResponse response = (EntradaHorariaResponse) APIManager.getLastResponse().getResponse();
        String descripcion = BaseService.DESCRIPCION.get();
        Assert.assertEquals(response.getDescription(), descripcion);
    }
}