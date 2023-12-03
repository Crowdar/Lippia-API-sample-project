package services;

import api.model.EntradaHorariaResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class EliminarEntradaService extends BaseService{
    public static Response delete(String jsonName){return delete(jsonName, EntradaHorariaResponse.class, setParams());}

    public static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("baseUrl", PropertyManager.getProperty("base.api.url"));
        params.put("apiKey",API_KEY.get());
        params.put("workspaceId",WORKSPACE_ID_0.get());
        params.put("entradaId",ENTRADA_HORARIA_ID.get());
        return params;
    }
}
