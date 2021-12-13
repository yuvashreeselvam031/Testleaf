package week2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
	//driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("total number of product "+text);
	List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='brand']"));
		for (int i = 0; i < findElements.size(); i++) {
			String text2 = findElements.get(i).getText();
			System.out.println(text2);
		}
	}

}
