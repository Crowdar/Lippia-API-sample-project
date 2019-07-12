package services;

import api.Model.PageBase;
import api.Model.User;
import com.crowdar.api.rest.Request;
import com.crowdar.api.rest.Response;
import com.crowdar.api.rest.RestClient;
import com.crowdar.core.JsonUtils;
import org.apache.http.client.utils.URIBuilder;

import java.io.File;
import java.net.URISyntaxException;

public class UserService extends PageBase {

    public static void setLastResponse(Response response) {
        setLastResponse(response);
    }

    public static Request getRequest(String jsonFileName) {
        String jsonRequest = JsonUtils.getJSONFromFile("requests" + File.separator + jsonFileName);
        return JsonUtils.deserialize(jsonRequest, Request.class).iterator().next();
    }

    public static Response get(String id) throws URISyntaxException {
        Request req = getRequest("");
        URIBuilder ub = new URIBuilder(BASE_URL);
        ub.addParameter("q", id);
        Response resp = new RestClient().get(ub.toString(), User.class, "", req.getUrlParameters(),req.getHeaders().toString());
        setLastResponse(resp);
        return resp;
    }
}
