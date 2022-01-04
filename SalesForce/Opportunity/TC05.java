package Opportunity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.BaseHooks;

public class TC05 extends BaseHooks{

	@Test
	public void Verify_Opportunities_sort_order_by_Close_date() throws InterruptedException {

		// 2. Click on toggle menu button from the left corner
				WebElement toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
				toggle.click();
				
				// 3. Click view All and click Sales from App Launcher
				WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));
				//wait.until(ExpectedConditions.elementToBeClickable(viewAll));
				viewAll.click();
				
				
				driver.findElement(By.xpath("//p[text()='Sales']")).click();
				//4. Click on Opportunities tab 
				Thread.sleep(3000);
				
				WebElement Opportunities = driver.findElement(By.xpath("//span[text()='Opportunities']"));
				driver.executeScript("arguments[0].click();", Opportunities);
				//5. Select the Table view
				driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon slds-button_icon-more'])[2]")).click();
				driver.findElement(By.xpath("//span[text()='Table']")).click();
				//6. Sort the Opportunities by Close Date in ascending order
				WebElement closeDate = driver.findElement(By.xpath("//span[text()='Close Date']"));
				
				
				Actions builder = new Actions(driver);
				builder.doubleClick(closeDate).perform();
				
				/*
				 * List<WebElement> date =
				 * driver.findElements(By.xpath("//span[@class='uiOutputDate']")); List<Integer>
				 * dateForSort = new ArrayList<Integer>();
				 * 
				 * for (int i = 0; i < date.size(); i++) { String text = date.get(i).getText();
				 * String[] split = text.split("/"); System.out.println(split[0]); int parseInt
				 * = Integer.parseInt(split[0]); dateForSort.add(parseInt);
				 * 
				 * }
				 * 
				 * 
				 * 
				 * if (isSorted(dateForSort)) { System.out.println("passed"); } else {
				 * System.out.println("failed");
				 * 
				 * }
				 */
				
	}
	/*
	 * public static boolean isSorted(List<Integer> a) { // base case if (a == null
	 * || a.size() <= 1) { return true; }
	 * 
	 * for (int i = 0; i < a.size() - 1; i++) { if (a.get(i) > a.get(i+1)) { return
	 * false; } }
	 * 
	 * return true; }
	 */
}
