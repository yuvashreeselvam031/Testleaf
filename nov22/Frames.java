package nov22;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		WebElement frame = driver.findElement(By.xpath("//div[@id='wrapframe']/iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./data/frameSnap.png");
		FileUtils.copyFile(src, dest);
		
		
		
	}

}
