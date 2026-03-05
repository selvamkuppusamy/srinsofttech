package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Footer extends BasePage {

	public Footer(WebDriver driver) {
		super(driver);
	}
	
	//*********WebElements*********//
	
	@FindBy (xpath="//input[@name='subscribe_mail']")
	WebElement txt_subscriptionmail;
	
	@FindBy (xpath="//p[@id='subscription-success-msg']")
	WebElement msg_confirmation;
	
	@FindBy (xpath="//button[@class='footer_subscribe_btn']")
	WebElement btn_subscribe;

	
	//********Methods************//
	
	public void set_mail(String mailid) {
		txt_subscriptionmail.sendKeys(mailid);
	}
	
	public void click_subscribe() {
		Actions act=new Actions(driver);
		act.moveToElement(btn_subscribe).click().perform();
	}
	
	public String displaytoast() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement toastMessage = wait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//p[@id='subscription-success-msg']")));
		return toastMessage.getText();
		
	}
	
	
	
	
	
	
	
	
	
}
