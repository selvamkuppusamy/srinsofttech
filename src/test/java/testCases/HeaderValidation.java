package testCases;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObject.HeaderSection;
import testBase.BaseClass;

public class HeaderValidation extends BaseClass{
	
	@Test()
	public void verifyheader() throws InterruptedException {
		
		HeaderSection hs=new HeaderSection(driver);
		//hs.click_ibmias400();
		for(int i=0; i<hs.Header.size(); i++) {
			hs.click_ibmias400();
			Thread.sleep(3000);
			WebElement element = hs.Header.get(i);
			
			element.click();
			Thread.sleep(3000);
			String Headertxt = element.getText();
			System.out.println(Headertxt);
			
			
		}
	}

}
