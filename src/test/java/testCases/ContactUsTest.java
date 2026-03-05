package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonutil.Util;
import pageObject.ContactPage;
import testBase.BaseClass;

public class ContactUsTest extends BaseClass {
	
	@Test()
	public void Verify_formsubmission() {
		ContactPage cp= new ContactPage(driver);
		cp.click_contactusbtn();
		cp.click_Accept();
		cp.set_firstname("Selvam");
		cp.set_lastname("K");
		cp.set_email("Selvam.k@srinsofttech.com");
		cp.set_phonenumber("78765676576");
		cp.set_companyname("Comcast");
		cp.select_industry("Retail");
		cp.select_howtofind("Events");
		cp.select_country("Angola");
		cp.set_message("Thanks for submitting the form");
		System.out.println("thanks");
		cp.click_privacy();
		cp.click_submit();
	}
	
	@Test()
	public void verifycountrytext() {
		ContactPage cp= new ContactPage(driver);
		cp.click_contactusbtn();
		String expmsg=cp.displaywherewelocated();
		String actmsg = "Where We Locayted";
		System.out.println(expmsg);
		
		Assert.assertEquals(expmsg, actmsg, "this got failed");
	}
	
	@Test()
	public void verifyformheader() {
		
		ContactPage cp1= new ContactPage(driver);
		cp1.click_contactusbtn();
		
		String expected = "gbdb";
		System.out.println(expected);
		System.out.println(cp1.checkformheader());
		
	}
	
	@Test()
	public void verifytellusstring() {
		
		ContactPage cp= new ContactPage(driver);
		cp.click_contactusbtn();
		String expectedtellus="Tell Us About Your Business Needs";
		
		String actualtellus=cp.checktellus();
		
		System.out.println(actualtellus);
		
		Assert.assertEquals(actualtellus, expectedtellus);
		
		
	}
	
	@Test()
	public void verifyisdisplayed() {
		ContactPage cp= new ContactPage(driver);
		cp.click_contactusbtn();
		Util.isElementDisplayed(cp.Americas);
		
	}

}















