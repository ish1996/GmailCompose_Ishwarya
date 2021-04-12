package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SentPage {
	protected WebDriver driver=null;
	
	public SentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By sent_to = By.cssSelector("span[class*='bAq']");
	
	public void checkSent() {
		if(sent_to!=null) {
		System.out.println("Printed---------------------------");}
		
	}
}