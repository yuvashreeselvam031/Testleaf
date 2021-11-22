package nov21;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().sendKeys("yuvashree");
		driver.switchTo().alert().accept();
		
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		if (text.contains("yuvashree")) {
			System.out.println("success");
			
		} else {

			System.out.println("name missing");
		}
		
		

		
	}

}
