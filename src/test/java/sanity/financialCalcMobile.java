package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.commonOps;
import workflows.mobileFlows;

@Listeners(utilities.Listeners.class)
public class financialCalcMobile extends commonOps {
    @Test(description = "Test01- verify loan amount")
    @Description("this test fills in loan terms and calculates return on the loan")
    public void test01_verifyLoanRepayment()
    {
        mobileFlows.calculateLoanReturn("1000", "3", "5", "0");
        Verifications.verifyTextinElement(financialLoanCalcPage.totalPayTxt, "1,078.20");
    }

}
