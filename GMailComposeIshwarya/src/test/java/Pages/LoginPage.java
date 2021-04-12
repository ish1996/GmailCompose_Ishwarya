package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected WebDriver driver=null;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	private By Gmail_user = By.cssSelector("input[type*='email']");
	private By Gmail_pass = By.cssSelector("input[class*='whsOnd']");
	
	public void enterEmail(String userName) {
		driver.findElement(Gmail_user).sendKeys(userName);
	}
	public void EntEmail() {
		driver.findElement(Gmail_user).sendKeys(Keys.ENTER);
	}
	public void enterPass(String Pass) {
		driver.findElement(Gmail_pass).sendKeys(Pass);
	}
	public void EntPass() {
		driver.findElement(Gmail_pass).sendKeys(Keys.ENTER);
	}
}
