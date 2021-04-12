package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MailPage {
	protected WebDriver driver=null;
	
	public MailPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By compose_btn = By.cssSelector("div[class*='T-I T-I-KE']");
	private By To_address = By.cssSelector("textarea[name*='to']");
	private By subject = By.cssSelector("input[name*='subjectbox']");
	private By body = By.cssSelector("div[aria-label*='Body']");
	private By snd_btn = By.cssSelector("div[jslog*='32601']");
	
	public void clickCompose() {
		driver.findElement(compose_btn).sendKeys(Keys.ENTER);
	}
	
	public void ToEmail(String To) {
		driver.findElement(To_address).sendKeys(To);
	}
	
	public void Subject(String Subj) {
		driver.findElement(subject).sendKeys(Subj);
	}
	
	public void MailBody(String Body) {
		driver.findElement(body).sendKeys(Body);
	}
	
	public void clicksend() {
		driver.findElement(snd_btn).sendKeys(Keys.ENTER);
	}
	
	
}
