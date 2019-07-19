package services;

import api.Model.Data;
import api.Model.UserCreated;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Request;
import com.crowdar.api.rest.Response;
import com.crowdar.api.rest.RestClient;
import com.crowdar.core.JsonUtils;

public class UserService extends APIManager {

    public static Request getRequest(String jsonFileName) {
        String jsonRequest = JsonUtils.getJSONFromFile(jsonFileName);
        return JsonUtils.deserialize(jsonRequest, Request.class);
    }

    public static Response get(String jsonName) {
        Request req = getRequest(jsonName);
        Response resp = new RestClient().get(BASE_URL, Data.class, "", req.getUrlParameters(), req.getHeaders().toString());
        setLastResponse(resp);
        return resp;
    }

    public static Response post(String jsonName) {
        Request req = getRequest(jsonName);
        Response resp = new RestClient().post(BASE_URL, UserCreated.class, req.getBody().toString(), req.getUrlParameters(), req.getHeaders().toString());
        setLastResponse(resp);
        return resp;

    }
}
