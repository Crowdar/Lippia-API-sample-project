package services;

import api.model.ClienteResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class ClienteService extends BaseService{

    public static Response get(String jsonName){return get(jsonName, ClienteResponse[].class, setParams());}

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",X_API_KEY.get());
        params.put("id-workspace",WORKSPACE_ID_0.get());
        params.put("name-client",NAME_CLIENT.get());
        return params;
    }

    public static Response post(String jsonName) {return post(jsonName, ClienteResponse.class ,setParams());}
}
