package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import utilities.commonOps;

public class electronFlows extends commonOps {
    @Step("Add new task to the list")
    public static void addNewTask(String taskName) {
        UIActions.updateText(ToDoMain.txtCreateTask, taskName);
        UIActions.insertKey(ToDoMain.txtCreateTask, Keys.RETURN);
    }

    @Step("count the number of tasks in the list")
    public static int getNumberOfTasks() {
        return ToDoMain.listTasks.size();
    }

    @Step("empty tasks from list")
    public static void emptyList() {
        for (int i=0; i<getNumberOfTasks(); i++){
        UIActions.mouseHover(ToDoMain.btn_deleteTasks);
    }
}}