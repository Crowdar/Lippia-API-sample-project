package services;

import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;
import java.util.HashMap;
import java.util.Map;
import api.model.EntradaHorariaResponse;

public class TraerEntradaHorariaService extends BaseService{
    public static Response get(String jsonName){return get(jsonName, EntradaHorariaResponse[].class, setParams());}

    public static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("baseUrl", PropertyManager.getProperty("base.api.url"));
        params.put("apiKey",API_KEY.get());
        params.put("workspaceId",WORKSPACE_ID_0.get());
        params.put("userId",Usuario_ID.get());
        return params;
    }
}
