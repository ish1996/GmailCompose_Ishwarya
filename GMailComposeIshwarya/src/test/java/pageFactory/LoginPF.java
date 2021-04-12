package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPF {
	
	WebDriver driver =null;
	
	@FindBy(css = "input[type*='email']")
	@CacheLookup // cache elements and does not search again and again
	WebElement PF_username;
	@FindBy(css = "input[name*='password']")
	@CacheLookup
	WebElement PF_pass;
	
	public void enteruser(String user)
	{
		PF_username.sendKeys(user);
	}
	public void clickuser()
	{
		PF_username.sendKeys(Keys.RETURN);
	}
	public void enterpass(String pass)
	{
		PF_pass.sendKeys(pass);
	}
	public void clickpass()
	{
		PF_pass.sendKeys(Keys.RETURN);
	}
	
	public LoginPF(WebDriver driver) {
		this.driver=driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);
		//cache element used for 30 seconds
		PageFactory.initElements(factory, this); //initializing elements
	}
}
