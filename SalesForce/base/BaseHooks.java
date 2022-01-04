package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseHooks {

	public ChromeDriver driver;
	public String excelFileName;
	@Parameters({"username","password"})
	@BeforeMethod()
	public void login(String uname, String password) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		  driver = new ChromeDriver(option);
		 //1. Login to https://login.salesforce.com
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
	}
	@AfterMethod
	public void postCondition() {

		//driver.close();
		
	}
	@DataProvider(name="fetchdata")
	public String[][] toGetData() throws IOException {

		String[][] readData = ReadExcelFromDataProvider.readData(excelFileName);
		return readData;	
		
		
	}
	

}
