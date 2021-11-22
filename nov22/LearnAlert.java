package nov22;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.internal.com.google.protobuf.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		alert.accept();
		String text = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		alert.sendKeys("yuvashree");
		alert.accept();
		String text2 = driver.findElement(By.id("result1")).getText();
		if (text2.contains("yuvashree")) {
			System.out.println("success");
		}else {
			System.out.println("failure");
		}

		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		String text3 = alert.getText();
		System.out.println(text3);
		alert.accept();
		//String text4 = driver.findElement(By.xpath("//div[text()='Happy Coding!']")).getText();
		//System.out.println(text4);
			driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
			driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
			
		
	
		
	}

}
