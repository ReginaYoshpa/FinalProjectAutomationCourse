package extensions;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import utilities.commonOps;

public class ApiActions extends commonOps {

    @Step("get data from server")
    public static Response get(String paramValues){
        response= httpRequest.get(paramValues);
        response.prettyPrint();
        return response;
    }
    @Step("extract value from JSON")
    public static String extractFromJSON(Response response, String path){
        jp= response.jsonPath();
        return jp.get(path).toString();
    }

    @Step("post data to server")
    public static void post(JSONObject params, String resource) {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response= httpRequest.post(resource);
        response.prettyPrint();
    }

    @Step("update data in server")
    public static void put(JSONObject params, String resource) {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response= httpRequest.put(resource);
        response.prettyPrint();
    }

    @Step("delete data from server")
    public static void delete(String id) {
        response= httpRequest.delete("/api/teams/" + id);
        response.prettyPrint();
    }
}
