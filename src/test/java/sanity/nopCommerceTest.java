package sanity;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.commonOps;
import workflows.webFlows;

@Listeners(utilities.Listeners.class)
public class nopCommerceTest extends commonOps {

    @Test (description = "Test01-verify registration and appearence of 'My Account button'")
    @Description ("this test verifies that we logged in and My Account button is present")
    public void test01_verifyMyAccountButton()
    {
        webFlows.login("regina", "yo", "rlipavs2@gmail.com", "nopTest", "nopTest", "nopTest");
        Verifications.verifyTextinElement(nopCommerceMyAccount.myAccount, "My account");
    }

    @Test (description = "Test02-verify number of desktops")
    @Description ("this test verifies the number of desktop computers")
    public void test02_verifyDesktops()
    {
        UIActions.mouseHover(nopCommerceManu.btnComputers, nopCommerceDesktops.linkDesktops);
        Verifications.NumberOfElements(nopCommerceDesktopsMainPage.numberOfDesktops, 3);
    }

    @Test (description= "Test03- this test verifies that there is an upper manu?")
    @Description ("this test verifies upper manu??")
    public void test03_verifyUpperMenu()
    {
        Verifications.visibilityOfElements(nopCommerceManu.ListUpperMenu);
    }

    @Test (description= "Test04- verify logo image")
    @Description ("this test verifies logo image using Sikuli")
    public void test04_verifyImage()
    {
        Verifications.visualElement("nopCommercePic");
    }

    @Test (description= "Test05- search elements", dataProvider = "data provider users", dataProviderClass = utilities.manageDDT.class)
    @Description ("this test searches items in a table using data driven testing")
    public void test05_searchElements(String user, String shouldExist)
    {
        webFlows.searchAndVerifyElement(user, shouldExist);
    }
}
