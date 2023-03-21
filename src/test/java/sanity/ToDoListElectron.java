package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.commonOps;
import workflows.electronFlows;

import java.util.concurrent.TimeUnit;

@Listeners(utilities.Listeners.class)
public class ToDoListElectron extends commonOps {
    @Test(description = "Test01-add and verifies new task")
    @Description("this test adds a new task and verifies it is in the list")
    public void test01_addAndVerifyNewTask()
    {
        electronFlows.addNewTask("learn Java");
        Verifications.verifyNumber(electronFlows.getNumberOfTasks(),1);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

    @Test(description = "Test02-add and verifies new tasks")
    @Description("this test adds a new task and verifies it is in the list")
    public void test02_addAndVerifyNewTasks()
    {
        electronFlows.addNewTask("learn Java");
        electronFlows.addNewTask("learn Python");
        electronFlows.addNewTask("learn C#");
        Verifications.verifyNumber(electronFlows.getNumberOfTasks(),3);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

}
