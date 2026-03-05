package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LifeAtSrinsoft;
import testBase.BaseClass;

public class LifeAtSrinsoftValidation extends BaseClass{

	@Test()
	public void verify_liftatsrinsoftpage() {
		
		LifeAtSrinsoft ls=new LifeAtSrinsoft(driver);
		ls.click_company();
		ls.click_lifeatsrinsoft();
		
		Assert.assertTrue(ls.Expected_breadcrumb1.equalsIgnoreCase(ls.breadcrumb1.getText()));
		Assert.assertTrue(ls.Expected_breadcrumb2.equalsIgnoreCase(ls.breadcrumb2.getText()));
		Assert.assertTrue(ls.Expected_Title.equalsIgnoreCase(ls.Page_Title.getText()));
		Assert.assertTrue(ls.Expected_section1_header.equalsIgnoreCase(ls.section1_header.getText()));
		Assert.assertTrue(ls.Expected_section1content1.equalsIgnoreCase(ls.section1_content1.getText()));
		Assert.assertTrue(ls.Expected_section1content2.equalsIgnoreCase(ls.section1_content2.getText()));
		Assert.assertTrue(ls.Expected_section2_header1.equalsIgnoreCase(ls.section2_header1.getText()));
		Assert.assertTrue(ls.Expected_section2_header2.equalsIgnoreCase(ls.section2_header2.getText()));
		Assert.assertTrue(ls.Expected_section2_header3.equalsIgnoreCase(ls.section2_header3.getText()));
		Assert.assertTrue(ls.Expected_section2_header4.equalsIgnoreCase(ls.section2_header4.getText()));
		Assert.assertTrue(ls.Expected_section2_header5.equalsIgnoreCase(ls.section2_header5.getText()));
		Assert.assertTrue(ls.Expected_section2_header6.equalsIgnoreCase(ls.section2_header6.getText()));
		Assert.assertTrue(ls.Expected_section2_content1.equalsIgnoreCase(ls.section2_content1.getText()));
		Assert.assertTrue(ls.Expected_section2_content2.equalsIgnoreCase(ls.section2_content2.getText()));
		Assert.assertTrue(ls.Expected_section2_content3.equalsIgnoreCase(ls.section2_content3.getText()));
		Assert.assertTrue(ls.Expected_section2_content4.equalsIgnoreCase(ls.section2_content4.getText()));
		Assert.assertTrue(ls.Expected_section2_content5.equalsIgnoreCase(ls.section2_content5.getText()));
		Assert.assertTrue(ls.Expected_section2_content6.equalsIgnoreCase(ls.section2_content6.getText()));
		Assert.assertTrue(ls.Expected_section3_content.equalsIgnoreCase(ls.section3_content.getText()));
		Assert.assertTrue(ls.Expected_section_jobopening.equalsIgnoreCase(ls.section_jobopenings.getText()));
		
		ls.display_growingtogetherimage();
		ls.display_watchvideo();
		ls.display_letsgetsocial();
		ls.display_imagesrinsoft();
		ls.display_viewjobopenings();
		
	}
}
