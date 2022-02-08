package utils;

import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;


public class ResponseHelper {

    public static Object getResponseObject(String responseString, Class responseClass) throws IOException {
        if (System.getProperty("Content-Type") != null) {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(responseString, responseClass);
        }
        return null;

    }

}
