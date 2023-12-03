package services;

import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;
import api.model.EntradaHorariaResponse;
import java.util.HashMap;
import java.util.Map;

public class NuevaEntradaHorariaService extends BaseService{
    public static Response post(String jsonName){return post(jsonName, EntradaHorariaResponse.class, setParams());}

    public static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("baseUrl", PropertyManager.getProperty("base.api.url"));
        params.put("apiKey",API_KEY.get());
        params.put("workspaceId",WORKSPACE_ID_0.get());
        params.put("proyectoId",PROYECTO_ID.get());
        params.put("decripcion",DESCRIPCION.get());
        params.put("inicio",INICIO.get());
        params.put("fin",FIN.get());
        return params;
    }

    public static void obtengoEntradaHorariaID() {
        EntradaHorariaResponse timeEntryResponses = (EntradaHorariaResponse) APIManager.getLastResponse().getResponse();
        ENTRADA_HORARIA_ID.set(timeEntryResponses.getId());
    }
}