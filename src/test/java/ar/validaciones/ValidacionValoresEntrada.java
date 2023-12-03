package ar.validaciones;

import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
import services.BaseService;
import api.model.EntradaHorariaResponse;

public class ValidacionValoresEntrada {
    public static void validador() {
        EntradaHorariaResponse response = (EntradaHorariaResponse) APIManager.getLastResponse().getResponse();
        String descripcion = BaseService.DESCRIPCION.get();
        String project_id = BaseService.PROYECTO_ID.get();
        String hora_inicio = BaseService.INICIO.get();
        String hora_final = BaseService.FIN.get();
        Assert.assertEquals(response.getDescription(), descripcion);
        Assert.assertEquals(response.getProjectId(), project_id);
        Assert.assertEquals(response.timeInterval.start, hora_inicio);
        Assert.assertEquals(response.timeInterval.end, hora_final);
    }
}