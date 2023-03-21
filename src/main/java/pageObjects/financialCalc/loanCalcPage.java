package pageObjects.financialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class loanCalcPage {
    private AppiumDriver mobileDriver;

    public loanCalcPage(AppiumDriver mobileDriver){
        this.mobileDriver= mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(id="loanAmount")
    public AndroidElement loanAmountTxt;

    @AndroidFindBy(id="interestRate")
    public AndroidElement interestRateTxt;

    @AndroidFindBy(id="loanYear")
    public AndroidElement loanYearTxt;

    @AndroidFindBy(id="loanMonth")
    public AndroidElement loanMonthsTxt;

    @AndroidFindBy(id="calc")
    public AndroidElement calcButton;

    @AndroidFindBy(id="totalPayment")
    public AndroidElement totalPayTxt;

}
