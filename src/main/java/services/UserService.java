package services;

import api.Model.PageBase;
import api.Model.User;
import com.crowdar.api.rest.Request;
import com.crowdar.api.rest.Response;
import com.crowdar.api.rest.RestClient;
import com.crowdar.core.JsonUtils;
import java.net.URISyntaxException;

public class UserService extends PageBase {

    public static Request getRequest(String jsonFileName) {
        String jsonRequest = JsonUtils.getJSONFromFile(jsonFileName);
        return JsonUtils.deserialize(jsonRequest, Request.class);
    }

    public static Response get(String id) throws URISyntaxException {
        Request req = getRequest("exampleJson");
        Response resp = new RestClient().get(BASE_URL, User.class, "", req.getUrlParameters(),req.getHeaders().toString());
        setLastResponse(resp);
        return resp;
    }
}
