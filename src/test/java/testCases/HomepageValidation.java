package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObject.HomePage;
import testBase.BaseClass;

public class HomepageValidation extends BaseClass{

	
	@Test()
	public void verify_windowswitch() {
		
		HomePage hp=new HomePage(driver);
		
		String mainpage = driver.getWindowHandle();
		//System.out.println(mainpage);
		hp.click_srinsoftengineering_link();
		
		Set<String> allpages = driver.getWindowHandles();
		for(String page: allpages) {
			if(!page.equals(mainpage)) {
				driver.switchTo().window(page);
				//System.out.println(driver.getTitle());
			}
		}
		
		driver.findElement(By.xpath("(//a[normalize-space()='Contact Us'])[1]")).click();
		
	}
}
