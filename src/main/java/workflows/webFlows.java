package workflows;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import utilities.commonOps;

public class webFlows extends commonOps
{
    @Step("flow:login")
    public static void login(String firstName, String lastName, String email, String user, String pass, String verifyPass){
    try {
        UIActions.click(nopCommerceHomePage.RegisterButton);
        UIActions.updateText(nopCommerceRegistrationForm.FirstName,firstName);
        UIActions.updateText(nopCommerceRegistrationForm.LastName,lastName);
        UIActions.updateText(nopCommerceRegistrationForm.Email,email);
        UIActions.updateText(nopCommerceRegistrationForm.Password,pass);
        UIActions.updateText(nopCommerceRegistrationForm.VerifyPassword,verifyPass);
        UIActions.click(nopCommerceRegistrationForm.registerBtn);
        UIActions.click(nopCommerceRegistrationForm.continueBtn);
    }
    catch (Exception e)
        {   UIActions.click(nopCommerceLogin.btnLoginReturningUser);
            UIActions.updateText(nopCommerceLogin.txtEmail,email);
            UIActions.updateText(nopCommerceLogin.txtPassword, pass);
            UIActions.click(nopCommerceLogin.btnLogin);

}}
    @Step("flow: search and verify elements")
    public static void searchAndVerifyElement(String user, String shouldExist){
        UIActions.updateTextHuman(nopCommerceHomePage.txt_search, user);
        UIActions.click(nopCommerceHomePage.btn_search);
        if(shouldExist.equalsIgnoreCase("exists"))
            Verifications.existanceOfElement(nopCommerceSearchPage.numberOfElements);
        else if (shouldExist.equalsIgnoreCase("not-exist"))
            Verifications.nonexistanceOfElement(nopCommerceSearchPage.numberOfElements);
        else
            throw new RuntimeException("invalid expected output in data driven testing, should be exists or not-exist");

    }

}
