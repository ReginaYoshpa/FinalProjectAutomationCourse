package pageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SearchPage {
    @FindBy(how= How.XPATH, using = "//div[@class='item-box']")
    public List<WebElement> numberOfElements;
}

