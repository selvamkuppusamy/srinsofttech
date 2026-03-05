package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LifeAtSrinsoft extends BasePage{

	public LifeAtSrinsoft(WebDriver driver) {
		super(driver);
	}
	
	//Strings//
	
	public String Expected_Title = "Life at Srinsoft Technologies";

	public String Expected_breadcrumb1 = "Careers";
	
	public String Expected_breadcrumb2 = "Life At SrinSoft";
	
	public String Expected_section1_header = "Why SrinSoft";
	
	public String Expected_section1content1 = "At SrinSoft, we go beyond the traditional 9 to 5. We’re a vibrant community of technology enthusiasts, innovative thinkers, and passionate professionals dedicated to shaping the future of digital transformation. Here, every day brings new challenges, exciting opportunities, and meaningful collaboration whether it's building cutting edge software solutions or exchanging fresh ideas over coffee.";
	
	public String Expected_section1content2 = "But what truly sets us apart is our people. At SrinSoft, we believe in investing in our team’s growth and success. Through continuous learning, skill development, and a culture that fosters innovation, we empower individuals to evolve, lead, and thrive.";
	
	public String Expected_section2_header1 = "Happy Work Environment";
	
	public String Expected_section2_header2 = "Flexible Working Hours";
	
	public String Expected_section2_header3 = "Fun at Work";
	
	public String Expected_section2_header4 = "Committees";
	
	public String Expected_section2_header5 = "Rewards & Recognitions";
	
	public String Expected_section2_content1 = "Here, work isn't just about paying the bills; it's about doing what we love and having a blast while we're at it.";
	
	public String Expected_section2_content2 = "Oh, and speaking of flexibility, we've got you covered. Our flexible working hours mean you can balance it all without breaking a sweat.";
	
	public String Expected_section2_content3 = "We don’t forget the most important part - fun! We believe that a happy workplace is a productive one, so we're always finding ways to inject a little fun into our day.";
	
	public String Expected_section2_content4 = "We've got all sorts of cool committees you can join, like the Sports Committee or the Fun Committee. Because life is too short to take things too seriously.";
	
	public String Expected_section2_content5 = "Of course, hard work doesn't go unnoticed around here. Our rewards & recognition program is our way of saying \"thanks\" for all your dedication and effort.";
	
	public String Expected_section2_content6 = "It's not just about us - it's about giving back too. That's why we're passionate about CSR - partnering with local communities & supporting our employees' volunteering efforts.";
	
	public String Expected_section_jobopening = "Job Openings";
	
	public String Expected_section2_header6 = "CSR";
	
	public String Expected_section3_content = "If you're looking for a place where you can truly belong where your ideas are valued - then you've come to the right place.";

	//WebElements//
	
	@FindBy (xpath="(//a[normalize-space()='Company'])[1]")
	public WebElement Tab_Company;
	
	@FindBy (xpath="(//div[normalize-space()='Life at Srinsoft'])[1]")
	public WebElement opt_lifeatsrinsoft;
	
	@FindBy (xpath="//h1[normalize-space()='Life at Srinsoft Technologies']")
	public WebElement Page_Title;
	
	@FindBy (xpath="//li[normalize-space()='Careers' and @class='breadcrumb-item']")
	public WebElement breadcrumb1;
	
	@FindBy (xpath="//li[normalize-space()='Life At SrinSoft']")
	public WebElement breadcrumb2;
	
	@FindBy (xpath="//h2[normalize-space()='Why SrinSoft']")
	public WebElement section1_header;
	
	@FindBy (xpath="//h2[normalize-space()='Job Openings']")
	public WebElement section_jobopenings;
	
	@FindBy (xpath="//p[contains(text(),'enthusiasts, innovative thinkers, and passionate')]")
	public WebElement section1_content1;
	
	@FindBy (xpath="//p[contains(text(),'At SrinSoft, we believe in investing')]")
	public WebElement section1_content2;
	
	@FindBy (xpath="//img[@src='assets/img/lifeatss/LifeatSrinSoft Website banner 1920 x 337 2.jpg']")
	public WebElement img_growing_together;

	@FindBy (xpath="//h4[normalize-space()='Happy Work Environment']")
	public WebElement section2_header1;
	
	@FindBy (xpath="//h4[normalize-space()='Flexible Working Hours']")
	public WebElement section2_header2;
	
	@FindBy (xpath="//h4[normalize-space()='Fun at Work']")
	public WebElement section2_header3;
	
	@FindBy (xpath="//h4[normalize-space()='Committees']")
	public WebElement section2_header4;
	
	@FindBy (xpath="//h4[normalize-space()='Rewards & Recognitions']")
	public WebElement section2_header5;
	
	@FindBy (xpath="//h4[normalize-space()='CSR']")
	public WebElement section2_header6;
	
	@FindBy (xpath="//p[contains(text(),' just about paying the bills')]")
	public WebElement section2_content1;
	
	@FindBy (xpath="//p[contains(text(), ' Our flexible working hours mean')]")
	public WebElement section2_content2;
	
	@FindBy (xpath="//p[contains(text(), ' believe that a happy workplace is a')]")
	public WebElement section2_content3;
	
	@FindBy (xpath="//p[contains(text(), ' you can join, like the Sports')]")
	public WebElement section2_content4;
	
	@FindBy (xpath="//p[contains(text(), ' go unnoticed around here')]")
	public WebElement section2_content5;
	
	@FindBy (xpath="//p[contains(text(), 'passionate about CSR - partnering with')]")
	public WebElement section2_content6;
	
	@FindBy (xpath="//a[@href='https://youtu.be/C1id-LrxEbM?si=IkX_hkgSXP6NUcb5' and @class='btn btn-three mt-3']")
	public WebElement btn_watchvideo;
	
	@FindBy (xpath="//a[@href='https://www.instagram.com/lifeatsrinsoft/']")
	public WebElement btn_letsget_social;
	
	@FindBy (xpath="//img[@src='assets/img/lifeatss/SS Collage - new-1 6.jpg']")
	public WebElement img_srinsoft;
	
	@FindBy (xpath="//a[text()='View Job Openings']")
	public WebElement btn_viewjobopenings;
	
	@FindBy (xpath="//p[contains(text(),'a place where you can truly belong where')]")
	public WebElement section3_content;
	

	//methods//
	
	Actions act = new Actions(driver);
	
	public void click_company() {
		//act.moveToElement(Tab_Company);
		Tab_Company.click();
	}
	
	public void click_lifeatsrinsoft() {
		opt_lifeatsrinsoft.click();
	}
	
	public boolean display_growingtogetherimage() {
		return img_growing_together.isDisplayed();
	}
	
	public boolean display_watchvideo() {
		return btn_watchvideo.isDisplayed();
	}
	
	public boolean display_letsgetsocial() {
		return btn_letsget_social.isDisplayed();
	}
	
	public boolean display_imagesrinsoft() {
		return img_srinsoft.isDisplayed();
	}
	
	public boolean display_viewjobopenings() {
		return btn_viewjobopenings.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
