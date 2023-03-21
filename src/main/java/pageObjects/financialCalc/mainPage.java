package pageObjects.financialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class mainPage {
    private AppiumDriver mobileDriver;

    public mainPage(AppiumDriver mobileDriver){
        this.mobileDriver= mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)), this);
    }

    @AndroidFindBy(xpath="//*[@bounds='[607,282][736,411]']")
    public AndroidElement loanCalcButton;
}
