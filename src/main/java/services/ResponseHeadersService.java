package services;

import api.model.ResponseHeaders;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.Map;

public class ResponseHeadersService extends MethodsService {

    public static Response get(String jsonName, Map<String, String> inputParameters) {
       return get(jsonName, ResponseHeaders.class, inputParameters);
    }

}
