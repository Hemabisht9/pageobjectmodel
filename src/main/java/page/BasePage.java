package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasePage {
	public void validateThePageHeader(String actualtext, String expectedtext, String errormsg) {
		 Assert.assertEquals(actualtext, expectedtext , errormsg);
	
	}

 public int randomNumGenerator(int bound) {
		 Random rnd = new Random();
			int generatednum = rnd.nextInt(bound);
		return generatednum;
		
	} 
  public void selectfromdropdown(WebElement Element, String visibleText) {
		Select sel = new Select(Element);
		sel.selectByVisibleText(visibleText);

	}


	
}
