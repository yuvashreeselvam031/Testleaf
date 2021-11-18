package nov18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement drp1 = driver.findElement(By.id("dropdown1"));
		Select s1 = new Select(drp1);
		s1.selectByIndex(1);
		
		WebElement drp2 = driver.findElement(By.name("dropdown2"));
		Select s2 = new Select(drp2);
		s2.selectByVisibleText("Selenium");
		
		WebElement drp3 = driver.findElement(By.id("dropdown3"));
		Select s3 = new Select(drp3);
		s3.selectByValue("2");
		
		WebElement drp4 = driver.findElement(By.className("dropdown"));
		Select s4 = new Select(drp4);
		
		List<WebElement> options = s4.getOptions();
		int size = options.size();
		System.out.println(size);
		
		driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("selenium");
		
		WebElement drp5 = driver.findElement(By.xpath("(//div[@class='example'])[6]/select"));
		Select s5 = new Select(drp5);
		s5.selectByIndex(3);
		
		
		
		
		
		
	}

}
