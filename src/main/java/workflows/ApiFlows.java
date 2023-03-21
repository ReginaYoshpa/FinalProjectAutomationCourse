package workflows;

import extensions.ApiActions;
import io.qameta.allure.Step;
import utilities.commonOps;

public class ApiFlows extends commonOps {

    @Step("business flow: get team property")
    public static String getTeamProperty(String Jpath){
        response = ApiActions.get("/api/teams/search");
        return ApiActions.extractFromJSON(response, Jpath);
    }
    @Step("create new team in grafana")
    public static void postTeam(String name, String email){
        params.put("name", name);
        params.put("email", email);
        ApiActions.post(params, "/api/teams");
    }
    @Step("update existing team in grafana")
    public static void updateTeam(String name, String email, String id){
        params.put("name", name);
        params.put("email", email);
        ApiActions.put(params, "/api/teams/"+ id);
    }
    @Step("delete existing team from grafana")
    public static void deleteTeam(String id){
        ApiActions.delete(id);
    }
}
