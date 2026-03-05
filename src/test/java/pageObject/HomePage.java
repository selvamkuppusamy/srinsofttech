package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//web elements//
	
	@FindBy (xpath="//a[@href='https://www.srinsoft.engineering/']")
	public WebElement hyperlink_SSENG;
	
	//methods//
	
	Actions act=new Actions(driver);
	public void click_srinsoftengineering_link() {
		act.moveToElement(hyperlink_SSENG).click().perform();
	}

}
