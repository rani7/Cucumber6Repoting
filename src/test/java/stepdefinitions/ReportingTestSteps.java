package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ReportingTestSteps{
	public WebDriver driver;
	
	@Given("when user launches the browser")
	public void when_user_launches_the_browser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse-selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();  
	}
	
	@Given("user enters testv3 cashpoint whitelisting url")
	public void user_enters_testv3_cashpoint_whitelisting_url() {
		driver.get("https://testapiv3.cashpoint.com/api/v1/admin/whitelistmyip?apikey=pYOp8TPnltEV1RtX9WSJuxSXv0DnqySkv2O59Qhm&deviceuniqueid=ddedff3c8405d2d72cabd883");  
	}

	@Given("user enters cashpoint whitelisting url")
	public void user_enters_cashpoint_whitelisting_url() {
		driver.get("https://apiv3.cashpoint.com/api/v1/admin/whitelistmyip?apikey=pYOp8TPnltEV1RtX9WSJuxSXv0DnqySkv2O59Qhm&deviceuniqueid=ddedff3c8405d2d72cabd883&domain=qsv3.cashpoint.com");  
	}

	@When("user goes to the testv3 cashpoint site")
	public void user_goes_to_the_testv3_cashpoint_site() {
		driver.get("https://testv3.cashpoint.com"); 
	}
	
	@When("user goes to the cashpoint site")
	public void user_goes_to_the_cashpoint_site() {
		driver.get("https://www.cashpoint.com"); 
	}
	
	@Then("user is on the testv3 cashpoint home page")
	public void user_is_on_the_testv3_cashpoint_home_page() {
		String testv3pageTitle=driver.getTitle();
		Assert.assertEquals("CASHPOINT Sportwetten", testv3pageTitle);
	}
	
	@Then("user is on the cashpoint home page")
	public void user_is_on_the_cashpoint_home_page() {
		String pageTitle=driver.getTitle();
		Assert.assertEquals("CASHPOINT Sportwetten", pageTitle);
	}

	@Then("browser is closed")
	public void closeBrowser() {
		driver.quit();
	}

}
