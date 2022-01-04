package Opportunity;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.BaseHooks;

public class TC03 extends BaseHooks{
	
	@Test
	public void deleteOpportunity() throws InterruptedException {

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
				WebElement findElement = driver.findElement(By.xpath("(//span[contains(@class,'slds-icon_container slds-icon-utility-down')])[1]"));
				findElement.click();
				Thread.sleep(4000);
				WebElement delete = driver.findElement(By.xpath("//div[text()='Delete']"));
				Actions builder = new Actions(driver);
				builder.moveToElement(delete).click().perform();
				driver.findElement(By.xpath("//span[text()='Delete']")).click();
				String text = driver.findElement(By.xpath("//div[contains(@class,'slds-theme--success slds-notify')]"))
						.getText();
				if (text.contains(input)) {
					System.out.println("passed");
				} else {

					System.out.println("failed");
				}

				
				
	}

}
