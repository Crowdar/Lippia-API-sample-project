package services;

import api.model.workspaces.WorkspacesResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class ProyectoService extends BaseService{
    public static Response get(String jsonName){return get(jsonName, WorkspacesResponse[].class, setParams());}

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",X_API_KEY.get());
        params.put("name-proyecto",NAME_PROYECTO.get());
        return params;
    }

    public static Response post(String jsonName) {return post(jsonName,WorkspacesResponse.class ,setParams());}
}
