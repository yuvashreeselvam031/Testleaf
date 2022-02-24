package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class SetProperty {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

}
