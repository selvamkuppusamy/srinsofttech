package testCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.BlogPage;
import testBase.BaseClass;

public class BlogpageValidation extends BaseClass {

	@Test()
	public void verifyblognames() throws InterruptedException {
		
		BlogPage bp= new BlogPage(driver);
		
		bp.click_resources();
		bp.click_Blogs();
		
		List<String> PageUrls = new ArrayList<>();
		for(int i=0; i<bp.blog.size(); i++) {
			
			WebElement eachblog = bp.blog.get(i);
			Actions action=new Actions(driver);
			
			action.moveToElement(eachblog).click().perform();
			String pageurl = driver.getCurrentUrl();
			PageUrls.add(pageurl);
			driver.navigate().back();
		}
		
		System.out.println(PageUrls);
		
	}
}
