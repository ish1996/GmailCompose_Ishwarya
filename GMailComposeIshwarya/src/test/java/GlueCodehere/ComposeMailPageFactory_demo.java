package GlueCodehere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.LoginPF;

public class ComposeMailPageFactory_demo {
	
	WebDriver driver = null;
	
	LoginPF LoginPFobj ;
	@Given("go to gmail")
	public void navigate_to_gmail() {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		 driver.get("https://mail.google.com/mail");
	}
	
	@When("^give the (.*) and (.*)$")
	public void gmail_is_open_using_valid_credentials(String user, String pass) throws InterruptedException {
		LoginPFobj = new LoginPF(driver);
		Thread.sleep(2000);
		LoginPFobj.enteruser(user);
		LoginPFobj.clickuser();
		Thread.sleep(10000);
		LoginPFobj.enterpass(pass);
		LoginPFobj.clickpass();
		 
	}
	@Then("user is logged in")
	public void user_is_logged_in()
	{
		
	}
}