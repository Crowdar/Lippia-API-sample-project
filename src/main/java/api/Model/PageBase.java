package api.Model;

import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

public class PageBase {

    public static final String BASE_URL = PropertyManager.getProperty("base.api.url");

    private static Response LAST_RESPONSE;

    public static void setLastResponse(Response httpResponse){
        LAST_RESPONSE = httpResponse;
    }

    public static Response getLastResponse(){
        return LAST_RESPONSE;
    }
}
