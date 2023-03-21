package pageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how= How.LINK_TEXT, using = "Log in")
    public WebElement btnLoginReturningUser;

    @FindBy(how= How.ID, using = "Email")
    public WebElement txtEmail;

    @FindBy(how= How.ID, using = "Password")
    public WebElement txtPassword;

    @FindBy(how= How.XPATH, using = "//button[@class='button-1 login-button']")
    public WebElement btnLogin;

}
