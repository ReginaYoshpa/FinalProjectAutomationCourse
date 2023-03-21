package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class Listeners extends commonOps implements ITestListener {
    public void onStart(ITestContext execution){
        System.out.println("---------------starting execution-----------");
    }

    public void onFinish(ITestContext execution){
        System.out.println("---------------ending execution-----------");
    }

    public void onTestStart(ITestResult test){
        System.out.println("------starting test "+ test.getName()+ "----------------");
    }

    public void onTestSuccess(ITestResult test){
        System.out.println("------Test "+ test.getName()+ " test passed--------------");

        if (platform.equalsIgnoreCase("api")){
        //stop recording
        try {
            monteScreenRecorder.stopRecord();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //delete recorded file
        //רוצים למחוק הקלטות שהצליחו (להשאיר רק הקלטות של טסטים שנכשלו)
        File file = new File("./test-recordings/ " + test.getName() + ".avi");
        if(file.delete())
            System.out.println("file deleted successfully");
        else
            System.out.println("failed to delete file");
    }}

    public void onTestFailure(ITestResult test){
        System.out.println("------Test "+ test.getName()+ " test failed--------------");

        if (platform.equalsIgnoreCase("api")) {
            //stop recording
            try {
                monteScreenRecorder.stopRecord();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            saveScreenshot();
        }
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult test) {
    }

    public void onTestSkipped(ITestResult test){
        System.out.println("-----------skipping test:" + test.getName() + "----------");
    }

    @Attachment(value = "Page Screen-Shot", type = "image/png")
    public byte[] saveScreenshot() {
        if(platform.equalsIgnoreCase("mobile"))
            return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        else
            return ((TakesScreenshot)mobileDriver).getScreenshotAs(OutputType.BYTES);
    }
}
