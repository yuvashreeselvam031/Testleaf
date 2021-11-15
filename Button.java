package nov15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.navigate().back();
		Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		System.out.println("location "+ location);
		
		String cssValue = driver.findElement(By.id("color")).getCssValue("color");
		System.out.println("color: "+cssValue);
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println("size "+size);
		driver.close();
		
		
	}

}
