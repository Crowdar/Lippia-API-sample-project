package api.Model;

import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

public class PageBase {

    public static final String BASE_URL = PropertyManager.getProperty("base.api.url");
    private static final ThreadLocal<Response> LAST_RESPONSE = new ThreadLocal<Response>();

    public static void setLastResponse(Response lastResponse) {
        LAST_RESPONSE.set(lastResponse);
    }

    public static Response getLastResponse() {
        return LAST_RESPONSE.get();
    }
}
