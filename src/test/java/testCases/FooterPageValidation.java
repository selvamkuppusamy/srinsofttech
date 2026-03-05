package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Footer;
import testBase.BaseClass;

public class FooterPageValidation extends BaseClass {
	
	@Test()
	public void verifytoastmessage() throws InterruptedException
	{
		Footer ft = new Footer(driver);
		String Expectedtoast = "Thanks for subscribing! You’ll now get our latest updates in your inbox.";
		
		ft.set_mail("sk18624@gamil.com");
		Thread.sleep(5000);
		ft.click_subscribe();
		String Actualtoast = ft.displaytoast();
		System.out.println(Actualtoast);
		
		Assert.assertEquals(Actualtoast, Expectedtoast);
	}

}
