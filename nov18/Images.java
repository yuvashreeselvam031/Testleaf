package nov18;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]/img")).click();
		String title2 = driver.getTitle();
		
		if (title2.contains("HTTP")) {
			System.out.println("It is broken");
			
		}
		else {
			System.out.println("It is not broken");
		}
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[3]/img")).click();
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		
		
		
		
	}

}
