package week1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("yuvashree");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("yuvashreeselvam031@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Yuva#123");
		WebElement dp1 = driver.findElement(By.name("birthday_day"));
		Select drp1 = new Select(dp1);
		drp1.selectByIndex(2);
		WebElement dp2 = driver.findElement(By.name("birthday_month"));
		Select drp2 = new Select(dp2);
		drp2.selectByValue("7");
		WebElement dp3 = driver.findElement(By.name("birthday_year"));
		Select drp3 = new Select(dp3);
		drp3.selectByValue("1999");
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
