package nov18;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.navigate().back();
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String title3 = driver.getTitle();
		if (title3.contains("HTTP")) {
			System.out.println("It is broken");
		}
		else {
			System.out.println("It is not broken");
		}
		driver.navigate().back();
	    List<WebElement> findElements = driver.findElements(By.tagName("a"));
	    System.out.println(findElements.size());
	    
		
		
	
		

	}

}
