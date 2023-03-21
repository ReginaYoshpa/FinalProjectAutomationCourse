package pageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccount {

    @FindBy(how= How.LINK_TEXT, using = "My account")
    public WebElement myAccount;
}
