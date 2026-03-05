package pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderSection extends BasePage{

	public HeaderSection(WebDriver driver) {
		super(driver);
	}
	
	//********Elements************//
	
	@FindBy (xpath="//a[text()='IBM i / AS400']/parent::div/child::div/div/a/div/div/div/div/div")
	public List<WebElement> Header;
	
	@FindBy (xpath ="//a[normalize-space()='IBM i (AS400) Solutions' and @class='nav-link dropdown-toggle navbar-link-item']")
	public WebElement opt_IBMiAs400_Solutions;
	
	public void click_ibmias400() {
		opt_IBMiAs400_Solutions.click();
	}
			
}
