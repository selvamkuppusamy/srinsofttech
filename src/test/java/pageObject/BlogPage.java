package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends BasePage{

	public BlogPage(WebDriver driver) {
		super(driver);
	}
	
	
	//*************Web Elements**********//
	
	@FindBy (xpath="(//a[normalize-space()='Resources' and @role='button'])[1]")
	public WebElement resources;
	
	@FindBy (xpath="(//div[text()='Blog' and @class='primary-text'])[1]")
	public WebElement Blogs;
	
	@FindBy (xpath="//article//h2//a")
	public List<WebElement> blog;
	
	@FindBy (xpath = "//article/div[2]/header/h1")
	public WebElement blog_header;
	
	
	public void click_resources() {
		resources.click();
	}
	
	public void click_Blogs() {
		Blogs.click();
	}

}
