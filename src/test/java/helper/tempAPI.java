package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class tempAPI {
    RequestSpecification httpRequest;
    Response response;
    String url= "http://localhost:3000/";

    @Test
    public void testingAPI() {
        RestAssured.baseURI = url;
        httpRequest=RestAssured.given().auth()
                .preemptive()
                .basic("admin", "admin");

        //get request
        response= httpRequest.get("/api/teams/search");

        //post + put request
        //JSONObject params= new JSONObject();
        //params.put("name", "WowTeam");
        //params.put("email", "WowTeam@wow.com");
        //httpRequest.header("Content-Type", "application/json");
        //httpRequest.body(params.toJSONString());
        //response= httpRequest.post("/api/teams");

        //response= httpRequest.put("/api/teams/3");

        //delete
        //response= httpRequest.delete("/api/teams/2");

        response.prettyPrint();
    }

}
