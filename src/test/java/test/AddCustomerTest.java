package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
   WebDriver driver;
   
   
   
   //mockdata
   String username = "demo@techfios.com";
   String password = "abc123";
   String dashBoardHeader = "Dashboard";
   String addcontact = "Add Contact";
	String fullname = "John";
	String company = "Bank Of America";
	String email = "jane1@gmail.com";
	String phonenumber = "234-456";
	String address = "567 columbus road";
	String city = "New York";
	String state = "New York";
	String country = "United States";
	String currency = "USD";
	String group = "Selenium";
	String password1 = "abc123";
	String confrimpassword1 = "abc123";
	String searchbutton = "john";
   
    @Test
    public void  userShouldBeAbleToAddCustomer() throws InterruptedException {
    	
    	driver = BrowserFactory.init();
    	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
    	loginpage.performLogin(username, password);
       DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
       dashboardpage.validateDashboardPage(dashBoardHeader);
       dashboardpage.clickCustomerButton();
       dashboardpage.clickAddCustomerButton();
       AddCustomerPage addcustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
       addcustomerpage.validateAddCustomerPage(addcontact);
       addcustomerpage.UserShouldBeAbleToAddFullName(fullname); 
       addcustomerpage.selectTheCompany(company );  
       addcustomerpage.UserShouldBeAbleTOAddEmail(email);
       addcustomerpage.UserShouldBeAbleTOAddphone(phonenumber); 
       addcustomerpage.UserShouldBeAbleTOAddAddress(address);
       addcustomerpage.UserShouldBeAbleTOAddCity(city); 
       addcustomerpage.UserShouldBeAbleTOAddState(state);
       addcustomerpage.UserShouldBeAbleToSelectCountry(country);
       addcustomerpage.UserShouldBeAbleToSelectCurrency(currency); 
       addcustomerpage.UserShouldBeAbleToSelectGroup(group);
       addcustomerpage.UserShouldBeAbleTOFillPassword(password1);
       addcustomerpage.UserShouldBeAbleTOConfrimPassword(confrimpassword1);
       addcustomerpage.UserShouldBeAbleTOSubmitTheInfo();
       addcustomerpage.UserShouldBeAbleTOClickListCustomer();
       addcustomerpage.UserShouldBeAbleTOFillAndCheckTheCustomer(searchbutton);
       BrowserFactory.tearDown();
       
    	
    	
    }










}
