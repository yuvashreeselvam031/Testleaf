package Opportunity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseHooks;

public class TC02 extends BaseHooks {

	@Test
	public void editOpportunity() throws InterruptedException {

		// 2. Click on toggle menu button from the left corner
		WebElement toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		toggle.click();
		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.elementToBeClickable(toggle));
		// 3. Click view All and click Sales from App Launcher
		WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));
		// wait.until(ExpectedConditions.elementToBeClickable(viewAll));
		viewAll.click();

		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		// 4. Click on Opportunities tab
		Thread.sleep(3000);

		WebElement Opportunities = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", Opportunities);
		// 5. Search the Opportunity 'Salesforce Automation by *Your Name*'
		String input = "SalesFore Automation by Yuvashree";
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"))
				.sendKeys("SalesFore Automation by Yuvashree", Keys.ENTER);
		// 6. Click on the Dropdown icon and Select Edit\
		Thread.sleep(4000);
		WebElement findElement = driver
				.findElement(By.xpath("(//span[contains(@class,'slds-icon_container slds-icon-utility-down')])[1]"));
		findElement.click();
		Thread.sleep(4000);
		WebElement findElement2 = driver.findElement(By.xpath("//div[text()='Edit']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(findElement2).click().perform();
		// 7. Choose close date as Tomorrow date
		WebElement date = driver.findElement(By.xpath("//label[text()='Close Date']/following::input"));
		date.clear();
		date.sendKeys("01/01/2022");
		// 8. Select 'Stage' as Perception Analysis
		WebElement stage = driver.findElement(By.xpath("//label[text()='Stage']/following::input"));
		builder.moveToElement(stage).click(stage).perform();
		stage.click();
		// Thread.sleep(6000);
		WebElement needAnalysis = driver.findElement(By.xpath("//span[@title='Perception Analysis']"));
		driver.executeScript("arguments[0].click();", needAnalysis);
		// 9. Select Deliver Status as In Progress
		WebElement delivery = driver.findElement(By.xpath("//label[contains(text(),'Delivery')]/following::input"));
		driver.executeScript("arguments[0].scrollIntoView();", delivery);
		delivery.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));

		WebElement inprogress = driver.findElement(By.xpath("//span[@title='In progress']"));
		wait.until(ExpectedConditions.elementToBeClickable(inprogress));

		inprogress.click();
		// 10. Enter Description as SalesForce
		WebElement description = driver.findElement(By.xpath("//label[text()='Description']/following::textarea"));

		description.sendKeys("salesforce");

		// 11. Click on Save and Verify Stage as Perception Analysis
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text = driver.findElement(By.xpath("//div[contains(@class,'slds-theme--success slds-notify')]"))
				.getText();
		if (text.contains(input)) {
			System.out.println("passed");
		} else {

			System.out.println("failed");
		}

	}
}
