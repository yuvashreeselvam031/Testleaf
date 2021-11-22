package nov22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundsTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> findElements2 = driver.findElements(By.xpath("//table[@id='table_id']//th"));
		System.out.println("no of columns "+findElements2.size());

		List<WebElement> findElements = driver.findElements(By.tagName("tr"));
		System.out.println("no of row "+findElements.size());
		
		
		String text = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']/following-sibling::td")).getText();
		
		System.out.println("progress value of learn to interact with element :"+text);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i < findElements2.size(); i++) {
			String text2 = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td[2]")).getText();
			String replaceAll = text2.replaceAll("[^0-9]", "");
			int parseInt = Integer.parseInt(replaceAll);
			list.add(parseInt);

			
			
		}
		Collections.sort(list);
		
		Integer l1 = list.get(0);
		String string = l1.toString();
		driver.findElement(By.xpath("//td[text()='"+string+"%']/following-sibling::td/input")).click();
		
		


		
	}

}
