package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage extends BasePage{
      @FindBy(how = How.XPATH, using = "//div[@class='row wrapper white-bg page-heading']")WebElement DASHBOARD_HEADER_ELEMENT;
      @FindBy(how = How.XPATH, using = "//span[@class='fa arrow']") WebElement CUSTOMER_MENU_ELEMENT;
      @FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADDCUSTOMER_MENU_ELEMENT;

    WebDriver driver;
    public DashboardPage(WebDriver driver ) {
    	this.driver = driver;
    }
    //testdata
    String dashBoardHeader = "Dashboard";
     public void validateDashboardPage(String expectedmsg) {
     
         validateThePageHeader( DASHBOARD_HEADER_ELEMENT.getText(), dashBoardHeader, "dashboard page not found");
         
     }

	public void clickCustomerButton() throws InterruptedException {
		Thread.sleep(2000);
		CUSTOMER_MENU_ELEMENT.click();
	}
	public void clickAddCustomerButton() {
		ADDCUSTOMER_MENU_ELEMENT.click();
	}
    
 
}