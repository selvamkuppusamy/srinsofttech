package commonutil;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Util {
	
	//common method to get text 
	public String getText(WebElement element) {
		return element.getText();
	}
	
	//combined string from a list of web elements
	
	public String getcombinedstring(List<WebElement> element) {
		
		StringBuilder combinedText = new StringBuilder();
		
		for(WebElement elements: element) {
			combinedText.append(elements.getText());
		}
		return combinedText.toString();
	}
	
	 // Method to check visibility
    public static boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }
}
