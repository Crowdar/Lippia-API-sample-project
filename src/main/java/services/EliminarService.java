package services;

import api.model.EntredaHoraria.EntradaHorariaResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class EliminarService extends BaseService {
    public static Response delete(String jsonName){return delete(jsonName, EntradaHorariaResponse.class, setParams());}
    public static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("baseUrl", PropertyManager.getProperty("base.api.url"));
        params.put("apiKey",X_API_KEY.get());
        params.put("workspaceId",WORKSPACE_ID.get());
        params.put("timeid",ENTRADA_HORARIA.get());
        return params;
    }
}
