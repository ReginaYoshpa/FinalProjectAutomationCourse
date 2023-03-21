package pageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class UpperManu {
    @FindBy(how= How.LINK_TEXT, using = "Computers")
    public WebElement btnComputers;

    @FindBy(how= How.XPATH, using = "//ul[@class='top-menu notmobile']/li")
    public List<WebElement> ListUpperMenu;


}
