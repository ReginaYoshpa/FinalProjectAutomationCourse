package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.commonOps;

public class desktopFlows extends commonOps {
    @Step("calculate addition: 1+8")
    public static void calculateAddition(){
        UIActions.click(calcMain.btn_clear);
        UIActions.click(calcMain.btn_one);
        UIActions.click(calcMain.btn_plus);
        UIActions.click(calcMain.btn_eight);
        UIActions.click(calcMain.btn_equals);



    }

}
