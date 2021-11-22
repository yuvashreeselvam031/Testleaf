package nov21;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindlowHandles {

	public static void main(String[] args) throws IOException {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=Books&ref=nb_sb_noss_2");
		driver.findElement(By.xpath("//span[contains(text(),\"Fingerprint! Publishing World's Best Inspirational\")]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winlist =  new ArrayList<String>(windowHandles);
		String string = winlist.get(1);
		driver.switchTo().window(string);
		String title = driver.getTitle();
		System.out.println(title);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snap.png");
		FileUtils.copyFile(src, dst);
		
	}

}
