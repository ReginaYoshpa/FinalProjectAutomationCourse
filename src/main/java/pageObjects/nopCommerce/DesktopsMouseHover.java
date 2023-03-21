package pageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DesktopsMouseHover {
    @FindBy(how= How.XPATH, using = "//ul[@class='sublist first-level']/li")
    public WebElement linkDesktops;
}
