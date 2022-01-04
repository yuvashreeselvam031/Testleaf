package Opportunity;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import base.BaseHooks;

public class TC01 extends BaseHooks{

	@Test
	public void createOpportunity() throws InterruptedException {

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
		//5. Click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();
		//6. Enter Opportunity name as 'Salesforce Automation
		WebElement OppName = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input"));
		OppName.sendKeys("SalesFore Automation by Yuvashree");
		String attribute = OppName.getAttribute("value");
		//7. Choose close date as Today
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input")).sendKeys("12/27/2021");
		//8. Select 'Stage' as Need Analysis
		Actions builder = new Actions(driver);
	//	Thread.sleep(6000);
		WebElement stage = driver.findElement(By.xpath("//label[text()='Stage']/following::input"));
		builder.moveToElement(stage).click(stage).perform();
		stage.click();
		//Thread.sleep(6000);
		WebElement needAnalysis = driver.findElement(By.xpath("(//span[@class='slds-media__body'])[4]"));
		driver.executeScript("arguments[0].click();", needAnalysis);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text = driver.findElement(By.xpath("//div[contains(@class,'slds-theme--success slds-notify')]")).getText();
		if (text.contains(attribute)) {
			System.out.println("passed");
		} else {
			System.out.println("failed");

		}

	}
}
