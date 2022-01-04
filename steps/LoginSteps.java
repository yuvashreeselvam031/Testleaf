package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends BaseClass {
//public static ChromeDriver driver;
	@Given("Load the webpage")
	public void load_the_webpage() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		   driver = new ChromeDriver(option);
		 //1. Login to https://login.salesforce.com
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Then("enter the username")
	public void enter_the_username() {
		driver.findElement(By.id("username")).sendKeys("earth@testleaf.com");
	}
	@Then("enter the password")
	public void enter_the_password() {
		driver.findElement(By.id("password")).sendKeys("Bootcamp@123");
	}
	@When("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.id("Login")).click();
	}
	@And("verify HomePage")
	public void verify_home_page() throws InterruptedException {
		Thread.sleep(5000);
	 String title = driver.getTitle();
	 if (title.equals("Home | Salesforce")) {
		
	} else {

	}
	}

}
