package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.commonOps;
import workflows.ApiFlows;

@Listeners(utilities.Listeners.class)
public class grafanaAPI extends commonOps {
    @Test(description = "Test01- get team from grafana")
    @Description("this test verifies team property")
    public void test01_verifyTeam(){
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[0].name"), "Awesome");
    }

    @Test(description = "Test02- add team to grafana")
    @Description("this test adds a team to grafana and verifies it")
    public void test02_addAndVerifyTeam(){
        ApiFlows.postTeam("GreatTeam", "GreatTeam@great.com");
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[1].name"), "GreatTeam");
    }

    @Test(description = "Test03- update team and verify")
    @Description("this test updates and verifies team in grafana")
    public void test03_updateAndVerifyTeam(){
        String id= ApiFlows.getTeamProperty("teams[1].id");
        ApiFlows.updateTeam("GreatTeam", "GreatTeam@team.com", id);
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[1].email"), "GreatTeam@team.com");
    }

    @Test(description = "Test04- delete team and verify")
    @Description("this test deletes team in grafana and verifies it")
    public void test04_deleteTeam(){
        String id= ApiFlows.getTeamProperty("teams[1].id");
        ApiFlows.deleteTeam(id);
        Verifications.verifyText(ApiFlows.getTeamProperty("totalCount"), "1");
    }


}
