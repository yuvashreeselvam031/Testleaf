package Account;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.BaseHooks;

public class DeleteAccount extends BaseHooks {

	
	@Test
	public void toDeleteAccount() throws InterruptedException {

		//2. Click on toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//3. Click view All and click Sales from App Launcher
	  driver.findElement(By.xpath("//button[text()='View All']")).click();

		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		//4.Click on Accounts tab 
				WebElement accounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
				driver.executeScript("arguments[0].click();", accounts);
				//5. Search the account 'Your Name'
				driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys("yuvashree" ,Keys.ENTER);
				Thread.sleep(5000);
				WebElement findElement = driver.findElement(By.xpath("(//span[contains(@class,'slds-icon_container slds-icon-utility-down')])[1]"));
				findElement.click();
				Thread.sleep(5000);
				WebElement findElement2 = driver.findElement(By.xpath("//div[text()='Delete']"));
				Actions builder = new Actions(driver);
				builder.moveToElement(findElement2).click().perform();
				driver.findElement(By.xpath("//span[text()='Delete']")).click();
				////div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']
				//String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
				String text = driver.findElement(By.xpath("//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']")).getText();
				if (text.contains("yuvashree")) {
					System.out.println("passed");
				} else {
					System.out.println("failed");

				}
	}
}
