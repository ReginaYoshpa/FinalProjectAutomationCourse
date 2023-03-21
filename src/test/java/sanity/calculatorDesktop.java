package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.commonOps;
import workflows.desktopFlows;

@Listeners(utilities.Listeners.class)
public class calculatorDesktop extends commonOps {
        @Test(description = "Test01-verify addition command")
        @Description("this test verifies addition result")
        public void test01_verifyAddition()
        {
            desktopFlows.calculateAddition();
            Verifications.verifyTextinElement(calcMain.field_result, "Display is 9");
        }
}
