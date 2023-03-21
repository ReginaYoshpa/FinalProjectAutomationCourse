package pageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationForm {
    @FindBy(how= How.ID, using = "FirstName")
    public WebElement FirstName;

    @FindBy(how= How.ID, using = "LastName")
    public WebElement LastName;

    @FindBy(how= How.ID, using = "Email")
    public WebElement Email;

    @FindBy(how= How.ID, using = "Password")
    public WebElement Password;

    @FindBy(how= How.ID, using = "ConfirmPassword")
    public WebElement VerifyPassword;

    @FindBy(how= How.NAME, using = "register-button")
    public WebElement registerBtn;

    @FindBy(how= How.LINK_TEXT, using = "Continue")
    public WebElement continueBtn;

}
