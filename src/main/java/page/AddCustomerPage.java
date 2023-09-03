package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage{
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")WebElement ADD_CONTACT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")WebElement COMPANY_DRDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")WebElement EMAIL__ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")WebElement PHONE__ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")WebElement ADDRESS__ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")WebElement CITY__ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")WebElement STATE__ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@name='country']")WebElement COUNTRY_DRDOWN__ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='currency']")WebElement CURRENCY_DRDOWN__ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='group']")WebElement GROUP_DRDOWN__ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")WebElement PASSWORD__ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='cpassword']")WebElement CONFRIM_PASSWORD__ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")WebElement SUBMIT_BUTTON__ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")WebElement LIST_BUTTON__ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='foo_filter']")WebElement SEARCH_NAME_BUTTON__ELEMENT;
	
	
	
	
	//TESTDATA
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
	
	WebDriver driver;
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
     public void validateAddCustomerPage(String expectedmsg) throws InterruptedException {
    	 Thread.sleep(2000);
    	validateThePageHeader(ADD_CONTACT_ELEMENT.getText(), expectedmsg, "add contact page not found");
     }
     public void UserShouldBeAbleToAddFullName(String fullname) { 
    	 FULL_NAME_ELEMENT.sendKeys(fullname + randomNumGenerator(99));
     }
       public void selectTheCompany(String company) {  
    	   selectfromdropdown(COMPANY_DRDOWN_ELEMENT, company); 
    	   
       } 
       
       public void UserShouldBeAbleTOAddEmail(String email) { 
    	   EMAIL__ELEMENT.sendKeys(email + randomNumGenerator(99));
       }
       public void UserShouldBeAbleTOAddphone(String phonenumber) { 
    	   PHONE__ELEMENT.sendKeys(phonenumber + randomNumGenerator(99));
       } 
       public void UserShouldBeAbleTOAddAddress(String address) { 
    	   ADDRESS__ELEMENT.sendKeys(address);
       } 
       public void UserShouldBeAbleTOAddCity(String city) { 
    	 CITY__ELEMENT.sendKeys(city);
       } 
       public void UserShouldBeAbleTOAddState(String state) { 
      	 STATE__ELEMENT.sendKeys(state);
         }  
       public void UserShouldBeAbleToSelectCountry(String country) { 
    	   selectfromdropdown(COUNTRY_DRDOWN__ELEMENT, country);
       }
       public void UserShouldBeAbleToSelectCurrency(String currency) { 
    	   selectfromdropdown(CURRENCY_DRDOWN__ELEMENT, currency);
       }
       public void UserShouldBeAbleToSelectGroup(String group) { 
    	   selectfromdropdown(GROUP_DRDOWN__ELEMENT, group);
       }
       public void UserShouldBeAbleTOFillPassword(String password1) { 
        	PASSWORD__ELEMENT.sendKeys(password1);
           } 
       public void UserShouldBeAbleTOConfrimPassword(String confrimpassword1) { 
       	CONFRIM_PASSWORD__ELEMENT.sendKeys(confrimpassword1);
          }  
       public void UserShouldBeAbleTOSubmitTheInfo() throws InterruptedException { 
    	   SUBMIT_BUTTON__ELEMENT.click();
    	   Thread.sleep(3000);
             }  
       public void UserShouldBeAbleTOClickListCustomer()  { 
    	   LIST_BUTTON__ELEMENT.click();
       }
       public void UserShouldBeAbleTOFillAndCheckTheCustomer(String searchbutton) { 
    	   SEARCH_NAME_BUTTON__ELEMENT.sendKeys(searchbutton);
          }
       
}
