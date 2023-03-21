package pageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageRegister {
    @FindBy(how= How.LINK_TEXT, using = "Register")
    public WebElement RegisterButton;

    @FindBy(how= How.ID, using = "small-searchterms")
    public WebElement txt_search;

    @FindBy(how= How.XPATH, using = "//button[@class='button-1 search-box-button']")
    public WebElement btn_search;
}
