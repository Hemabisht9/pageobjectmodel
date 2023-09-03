package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	  //mockdata
    String username = "demo@techfios.com";
    String password = "abc123";
    String dashBoardHeader = "Dashboard";
	
	
        WebDriver driver;
        @Test
        public void ValidUserShoulBeAbleToLogin() throws InterruptedException {
        	driver = BrowserFactory.init();
        	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        	loginpage.performLogin(username, password); 
        	DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
        	dashboardpage.validateDashboardPage(dashBoardHeader);
        	dashboardpage.clickCustomerButton();
        	dashboardpage.clickAddCustomerButton();
        	 BrowserFactory.tearDown();
        }
}
