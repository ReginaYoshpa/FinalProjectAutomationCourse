package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.commonOps;
import workflows.DBFlows;

@Listeners(utilities.Listeners.class)
public class nopCommerceWebDB extends commonOps {
    @Test(description = "Test01-verify login to nopCommerce with DB credentials")
    @Description("this test logins to nopCommerce Demo with DB credentials")
    public void test01_verifyLoginDB()
    {
        DBFlows.loginDB();
        Verifications.verifyTextinElement(nopCommerceMyAccount.myAccount, "My account");
    }
}
