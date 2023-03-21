package utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends base{

    public static void initNopCommerce(){
        nopCommerceHomePage= PageFactory.initElements(driver, pageObjects.nopCommerce.HomePageRegister.class);
        nopCommerceRegistrationForm= PageFactory.initElements(driver,pageObjects.nopCommerce.RegistrationForm.class);
        nopCommerceLogin= PageFactory.initElements(driver, pageObjects.nopCommerce.LoginPage.class);
        nopCommerceMyAccount= PageFactory.initElements(driver, pageObjects.nopCommerce.MyAccount.class);
        nopCommerceManu= PageFactory.initElements(driver, pageObjects.nopCommerce.UpperManu.class);
        nopCommerceDesktops= PageFactory.initElements(driver, pageObjects.nopCommerce.DesktopsMouseHover.class);
        nopCommerceDesktopsMainPage= PageFactory.initElements(driver, pageObjects.nopCommerce.DesktopsMainPage.class);
        nopCommerceSearchPage=PageFactory.initElements(driver,pageObjects.nopCommerce.SearchPage.class);
    }
    public static void initFinancial(){
        financialMain= new pageObjects.financialCalc.mainPage(mobileDriver);
        financialLoanCalcPage= new pageObjects.financialCalc.loanCalcPage(mobileDriver);

    }
    public static void initToDo() {
        ToDoMain= PageFactory.initElements(driver, pageObjects.ToDo.MainPage.class);
    }

    public static void initCalculator() {
        calcMain= PageFactory.initElements(driver, pageObjects.calculator.MainPage.class);
    }
    }
