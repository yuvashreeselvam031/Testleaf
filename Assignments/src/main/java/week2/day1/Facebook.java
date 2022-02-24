package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		// Step 1: Download and set the path 
				WebDriverManager.chromedriver().setup();
				// Step 2: Launch the chromebrowser
				ChromeDriver driver = new ChromeDriver();
				// Step 3: Load the URL https://en-gb.facebook.com/
				driver.get("https://en-gb.facebook.com/");
				// Step 4: Maximise the window
				driver.manage().window().maximize();
				// Step 5: Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
				// Step 6: Click on Create New Account button
				driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		
	}
	
	
		
	

}
