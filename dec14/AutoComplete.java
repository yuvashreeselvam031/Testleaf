package dec14;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./data/snaps.png");
		FileUtils.copyFile(src, dst);
		
		WebElement search = driver.findElement(By.className("ui-autocomplete-input"));
		Actions builder = new Actions(driver);
		
		builder.sendKeys(search, "a").pause(Duration.ofSeconds(1)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		String attribute = search.getAttribute("value");
		System.out.println(attribute );
		
	}

}
