package services;

import api.model.UsuarioResponse;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;
import java.util.HashMap;
import java.util.Map;

public class UsuarioService extends BaseService {
    public static Response get(String jsonName){
        return get(jsonName, UsuarioResponse[].class, setParams());
    }
    private static Map<String, String> setParams(){
        Map<String, String> params = new HashMap<>();
        params.put("baseUrl", PropertyManager.getProperty("base.api.url"));
        params.put("apiKey", API_KEY.get());
        params.put("workspaceId", WORKSPACE_ID_0.get());
        return params;
    }

    public static void obtengoUsuarioId(){
        UsuarioResponse[] usuarioResponses = (UsuarioResponse[]) APIManager.getLastResponse().getResponse();
        Usuario_ID.set(usuarioResponses[0].getId());
    }
}