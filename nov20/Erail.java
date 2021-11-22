package nov20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("chkSelectDateOnly")).click();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("mas");
		Thread.sleep(1000);
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("mdu");
		Thread.sleep(1000);
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);

		List<String> list = new ArrayList<String>();
		
		for (int i = 2; i < list.size(); i++) {
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td["+i+"]/a")).getText();

			list.add(text);
			
			
		}
		// System.out.println(text);
		

	}

}
