package Opportunity;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



import base.BaseHooks;

public class TC04 extends BaseHooks {
	
	@Test
	public void toCreateWithoutMandatoryField() throws InterruptedException {

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
				//6. Choose Close date as Tomorrow Date
				WebElement date = driver.findElement(By.xpath("//label[text()='Close Date']/following::input"));
				date.clear();
				date.sendKeys("01/01/2022");
				//7. Click on save 
				driver.findElement(By.xpath("//button[text()='Save']")).click();
				//8. Verify the Alert message (Complete this field) displayed for Name and Stage
                String text2 = driver.findElement(By.xpath("//div[@class='slds-form-element__help']")).getText();
				
				
				
				  if (text2.contains("Complete this field.")) {
					  System.out.println("passed");
				  
				  } else {
					  
					  
					  System.out.println("failed");
				  }
				 
	}

}
