package Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseHooks;

public class VerifyAccounts extends BaseHooks {

	@Test
	public void verifySorting() throws InterruptedException {

		//2. Click on toggle menu button from the left corner
				driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
				//3. Click view All and click Sales from App Launcher
			  driver.findElement(By.xpath("//button[text()='View All']")).click();

				
				driver.findElement(By.xpath("//p[text()='Sales']")).click();
				Thread.sleep(3000);
				//4.Click on Accounts tab 
				WebElement accounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
				driver.executeScript("arguments[0].click();", accounts);

		Thread.sleep(4000);
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Sort']"));
		driver.executeScript("arguments[0].click();", findElement);
		String text = driver.findElement(By.xpath("//th[@class='slds-cell-edit cellContainer']")).getText();
		if (text.contains("a")) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
		//(//div[@class='slds-cell-fixed'])[2]/a/span
	}
}
