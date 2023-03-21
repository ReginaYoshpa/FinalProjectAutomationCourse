package utilities;

import io.appium.java_client.AppiumDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;
import pageObjects.financialCalc.loanCalcPage;
import pageObjects.financialCalc.mainPage;
import pageObjects.nopCommerce.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class base {

    //Web
    protected static WebDriver driver;

    //General
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softassert;
    protected static Screen screen;
    protected static String platform;

    //Page Objects Web
    protected static HomePageRegister nopCommerceHomePage;

    protected static RegistrationForm nopCommerceRegistrationForm;
    protected static LoginPage nopCommerceLogin;
    protected static MyAccount nopCommerceMyAccount;

    protected static UpperManu nopCommerceManu;
    protected static DesktopsMouseHover nopCommerceDesktops;

    protected static DesktopsMainPage nopCommerceDesktopsMainPage;


    protected static SearchPage nopCommerceSearchPage;

    //mobile
    protected static AppiumDriver mobileDriver;
    protected static DesiredCapabilities dc = new DesiredCapabilities();

    //Rest API
    protected static RequestSpecification httpRequest;
    protected static Response response;
    protected static JSONObject params= new JSONObject();
    protected static JsonPath jp;


    //Page Objects Mobile
    protected static mainPage financialMain;
    protected static loanCalcPage financialLoanCalcPage;

    //Page Objects Electron

    protected static pageObjects.ToDo.MainPage ToDoMain;

    //Desktop
    protected static pageObjects.calculator.MainPage calcMain;

    //DB
    protected static Connection con;
    protected static Statement stmt;
    protected static ResultSet rs;







}
