package services;

import api.model.ProyectoResponse;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;
import java.util.HashMap;
import java.util.Map;

public class ProyectoService extends BaseService{
    public static Response get(String jsonName){
        return get(jsonName, ProyectoResponse[].class, setParams());
    }
    private static Map<String, String> setParams(){
        Map<String, String> params = new HashMap<>();
        params.put("baseUrl", PropertyManager.getProperty("base.api.url"));
        params.put("apiKey", API_KEY.get());
        params.put("workspaceId", WORKSPACE_ID_0.get());
        return params;
    }

    public static void obtengoProyectoId(){
        ProyectoResponse[] proyectoResponses = (ProyectoResponse[]) APIManager.getLastResponse().getResponse();
        PROYECTO_ID.set(proyectoResponses[0].getId());
    }
}
