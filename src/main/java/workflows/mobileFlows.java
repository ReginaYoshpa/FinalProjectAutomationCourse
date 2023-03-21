package workflows;

import extensions.mobileActions;
import io.qameta.allure.Step;
import utilities.commonOps;

public class mobileFlows extends commonOps {

    @Step("Business flow: fill form and calculate return on loan")
    public static void calculateLoanReturn(String amount, String rate, String year, String month){
        mobileActions.tap(financialMain.loanCalcButton);
        mobileActions.updateText(financialLoanCalcPage.loanAmountTxt, amount);
        mobileActions.updateText(financialLoanCalcPage.interestRateTxt, rate);
        mobileActions.updateText(financialLoanCalcPage.loanYearTxt, year);
        mobileActions.updateText(financialLoanCalcPage.loanMonthsTxt, month);
        mobileActions.tap(financialLoanCalcPage.calcButton);
    }
}
