package GlueCodehere;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.LoginPage;
import Pages.MailPage;
import Pages.SentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ComposeMail {
	
	WebDriver driver = null;
	
	public MailPage mail;
	public LoginPage login;
	@Given("navigate to gmail")
	public void navigate_to_gmail() {
		System.out.println("Sign-in to your gmail account");
		// String project_path = System.getProperty("user.dir");
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		 driver.navigate().to("https://mail.google.com/mail");
	}
	
	@And("^enter (.*) and (.*)$")
	public void gmail_is_open_using_valid_credentials(String user, String pass) throws InterruptedException {
		
		login = new LoginPage(driver); 
		login.enterEmail(user);
		login.EntEmail();
		Thread.sleep(5000);
		login.enterPass(pass);
		login.EntPass();
		 
	}

	@When("user clicks on compose button")
	public void user_clicks_on_compose_button() throws InterruptedException {
		Thread.sleep(5000);
		mail = new MailPage(driver);
		mail.clickCompose();
		Thread.sleep(5000);
	}
	
	@And("^type the to (.*)$")
	public void type_the_to_adress(String add) throws InterruptedException {
		mail.ToEmail(add);
		Thread.sleep(5000);

	}

	@And("type the subject")
	public void type_the_subject() throws InterruptedException {
		mail.Subject("subject line");
		Thread.sleep(2000);
	}

	@And("type the body")
	public void type_the_body() throws InterruptedException {
		mail.MailBody("mail content");
		Thread.sleep(2000);

	}

	@And("user clicks on send button")
	public void user_clicks_on_send_button() throws InterruptedException {
		Thread.sleep(2000);
		mail.clicksend();
	}

	@Then("email is sent")
	public void email_is_sent() {
		SentPage sent =new SentPage(driver);
		sent.checkSent();
	}

}

