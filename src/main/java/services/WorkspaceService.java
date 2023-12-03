package services;

import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;
import api.model.WorkspaceResponse;
import java.util.HashMap;
import java.util.Map;

public class WorkspaceService extends BaseService {
    public static Response get(String jsonName){
        return get(jsonName, WorkspaceResponse[].class, setParams());
    }

    private static Map<String, String> setParams(){
        Map<String, String> params = new HashMap<>();
        params.put("baseUrl", PropertyManager.getProperty("base.api.url"));
        params.put("apiKey", API_KEY.get());
        return params;
    }
    public static void obtengoWorkspaceId(){
        WorkspaceResponse[] workspaceResponses = (WorkspaceResponse[]) APIManager.getLastResponse().getResponse();
        WORKSPACE_ID_0.set(workspaceResponses[0].getId());
    }
}
