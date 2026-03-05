package pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage extends BasePage{
	
	public ContactPage(WebDriver driver) {
		super(driver);
	}
	
	//*********Web Elements************//
	@FindBy (xpath="//a[text()='Contact Us' and @class='contact_btn']")
	public WebElement contactus_btn;
	
	@FindBy (xpath="//input[@id='firstname']")
	public WebElement txt_firstname;
	
	@FindBy (xpath="//input[@id='lastname']")
	public WebElement txt_lastname;
	
	@FindBy (xpath="//input[@id='remail']")
	public WebElement txt_email;
	
	@FindBy (xpath="//input[@id='cphone']")
	public WebElement txt_phone;
	
	@FindBy (xpath="//input[@id='companyname']")
	public WebElement txt_companyname;
	
	@FindBy (xpath="//Select[@id='formindustry']")
	public WebElement drp_industry;
	
	@FindBy (xpath="//Select[@id='howfind']")
	public WebElement drp_howtofind;
	
	@FindBy (xpath="//Select[@id='country']")
	public WebElement drp_country;
	
	@FindBy (xpath="//textarea[@id='message']")
	public WebElement txt_message;
	
	@FindBy (xpath="//input[@type='checkbox']")
	public WebElement chkbox_privacy;
	
	@FindBy (xpath="//button[text()='Speak with a Solution Expert']")
	public WebElement btn_submit;
	
	@FindBy (xpath="//button[@id='acceptAll']")
	public WebElement btn_CookieAccept;
	
	@FindBy (xpath="//h2[@class='title tg-element-title']/div/div/div")
	public List<WebElement> formheader;
	
	@FindBy (xpath ="//h2[text()='Where We Located']")
	public WebElement wherelocated;
	
	@FindBy (xpath="//h3[text()='Tell Us About Your Business Needs']")
	public WebElement tellus;
	
	@FindBy (xpath="//label[text()='Americas']")
	public WebElement Americas;
	
	
	//************* methods**********//
	
	public void click_contactusbtn() {
		contactus_btn.click();
	}
	
	public void set_firstname(String fname) {
		txt_firstname.sendKeys(fname);
	}
	
	public void set_lastname(String lname) {
		txt_lastname.sendKeys(lname);
	}
	
	public void set_email(String email) {
		txt_email.sendKeys(email);
	}
	
	public void set_phonenumber(String phone) {
		txt_phone.sendKeys(phone);
	}
	
	public void set_companyname(String cname) {
		txt_companyname.sendKeys(cname);
	}
	
	public void set_message(String msg) {
		txt_message.sendKeys(msg);
	}
	
	
	public void click_privacy() {
	   chkbox_privacy.click();
	}
	
	public void select_industry(String industry) {
		Select choose_industry = new Select(drp_industry);
		choose_industry.selectByVisibleText(industry);
	}
	
	public void select_howtofind(String howtofind) {
		Select choose_howtofind = new Select(drp_howtofind);
		choose_howtofind.selectByVisibleText(howtofind);
	}
	
	public void select_country(String country) {
		Select choose_country = new Select(drp_country);
		choose_country.selectByVisibleText(country);
	}
	
	public void click_submit() {
		Actions act = new Actions(driver);
		act.moveToElement(btn_submit).click().perform();
	}
	
	public void click_Accept() {
		btn_CookieAccept.click();
	}
	
	public String displaywherewelocated() {
		return wherelocated.getText();
	}
	
	public String checkformheader() {

	    StringBuilder actualHeader = new StringBuilder();

	    for (WebElement header : formheader) {
	        actualHeader.append(header.getText());
	    }

	    return actualHeader.toString();
	}
	
	public String checktellus() {
		return tellus.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
