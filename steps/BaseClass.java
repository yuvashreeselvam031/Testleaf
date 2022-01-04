package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;

public class BaseClass {
	public static ChromeDriver driver;
	
	@After
	public void postCondition() {

		driver.close();
	}

}
