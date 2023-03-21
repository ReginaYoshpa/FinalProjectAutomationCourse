package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import utilities.commonOps;

import java.util.List;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.fail;


public class Verifications extends commonOps {
    @Step("verify text in element")
    public static void verifyTextinElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }

    @Step("verify number of elements")
    public static void NumberOfElements(List<WebElement> elems, int expected) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        assertEquals(elems.size(), expected);
    }

    @Step("verify visibility of elements")
    public static void visibilityOfElements(List<WebElement> elems) {
        for (WebElement elem : elems) {
            softassert.assertTrue(elem.isDisplayed(), elem.getText() + " is not displayed");
        }
        softassert.assertAll("some elements weren't displayed");
    }

    @Step("verify element visually")
    public static void visualElement(String expectedImageName) {
        try {
            screen.find(getData("ImageRepo") + expectedImageName + ".png");
        } catch (FindFailed findFailed) {
            System.out.println("error comparing image file " + findFailed);
            fail("error comparing image file " + findFailed);
        }
    }

    @Step("Verify element is displayed")
    public static void existanceOfElement(List<WebElement> elements) {
        assertTrue(elements.size() > 0);
    }

    @Step("Verify element is Not displayed")
    public static void nonexistanceOfElement(List<WebElement> elements) {
        assertFalse(elements.size() > 0);
    }

    @Step("verify text")
    public static void verifyText(String actual, String expected) {
        assertEquals(actual, expected);
    }

    @Step("verify number")
    public static void verifyNumber(int actual, int expected){
        assertEquals(actual, expected);
    }
}
