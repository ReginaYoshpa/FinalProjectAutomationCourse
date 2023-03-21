package pageObjects.ToDo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {
    @FindBy(how= How.CSS, using = "input[placeholder='Create a task']")
    public WebElement txtCreateTask;

    @FindBy(how= How.CLASS_NAME, using = "textWrapper_X9gil")
    public List<WebElement> listTasks;

    @FindBy(how= How.CLASS_NAME, using = "destroy_19w1q")
    public WebElement btn_deleteTasks;
}
