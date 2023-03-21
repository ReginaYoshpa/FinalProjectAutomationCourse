package extensions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.commonOps;

import java.util.concurrent.TimeUnit;

public class UIActions extends commonOps {

    @Step ("click on element")
    public static void click(WebElement elem)
    {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }
    @Step ("update text element")
    public static void updateText(WebElement elem, String text)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
}
    @Step ("update dropdown")
    public static void updateDropDown(WebElement elem, String text)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropdown = new Select(elem);
        dropdown.selectByVisibleText(text);
    }
    @Step ("mouse hover")
    public static void mouseHover(WebElement elem1, WebElement elem2){
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

    @Step ("mouse hover")
    public static void mouseHover(WebElement elem1){
        action.moveToElement(elem1).click().build().perform();
    }

    @Step ("update text element slowly as human")
    public static void updateTextHuman(WebElement elem, String text) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        for (char ch : text.toCharArray()) {
            Uninterruptibles.sleepUninterruptibly(100, TimeUnit.MILLISECONDS);
            elem.sendKeys(ch + "");
        }
    }
    @Step ("insert key")
    public static void insertKey(WebElement elem, Keys value)
    {
        elem.sendKeys(value);
    }
}