package nov15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("yuvashree@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("yuvashree", Keys.TAB);
		String text = driver.findElement(By.xpath("(//input[@type='text'])[3]")).getAttribute("value");
		System.out.println("text " +text);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		boolean displayed = driver.findElement(By.xpath("(//input[@type='text'])[5]")).isDisplayed();		
		System.out.println("isdisplayed "+displayed);
	}
	
}
