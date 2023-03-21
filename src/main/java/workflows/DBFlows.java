package workflows;

import extensions.DBActions;
import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.commonOps;

import java.util.List;

public class DBFlows extends commonOps {

    @Step("flow: login to nopCommerce with DB credentials")
    public static void loginDB() {
        String query = "SELECT email, password from employees WHERE id= '3' ";
        List<String> cred = DBActions.getCredentials(query);
        UIActions.click(nopCommerceLogin.btnLoginReturningUser);
        UIActions.updateText(nopCommerceLogin.txtEmail,cred.get(0));
        UIActions.updateText(nopCommerceLogin.txtPassword, cred.get(1));
        UIActions.click(nopCommerceLogin.btnLogin);

    }
    }
