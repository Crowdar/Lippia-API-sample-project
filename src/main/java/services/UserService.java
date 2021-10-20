package services;

import api.model.Data;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.util.MapUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;


public class UserService extends MethodsService {

    public static Response get(String jsonName) {
       return get(jsonName, Data.class);
    }

    public static Response delete(String jsonName) {
        return delete(jsonName, null);
    }

    @Override
    public void validateFields(Object expected, Object actual, Map<String, String> parameters) throws Exception {
        Map<String, Object> expectedObjectMapped = MapUtils.convertObjectToMap(expected);
        Map<String, String> expectedData = (Map<String, String>) expectedObjectMapped.get("data");
        expectedData.replace("first_name", parameters.get("name"));

        ObjectMapper objectMapper = new ObjectMapper();
        expected = objectMapper.convertValue(expectedObjectMapped, Object.class);

        validateFields(expected, actual);
    }

}


