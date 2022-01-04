package Account;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseHooks;


public class EditAccounts extends BaseHooks {
	@BeforeTest
	public void setData() {
	excelFileName = "EditAccount";

	}
	@Test(dataProvider="fetchdata")
	
	public void toEditAccount(String BillingAdd, String ShippingAdd, String Phnno) throws InterruptedException {
		
		//2. Click on toggle menu button from the left corner
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//search Account in search tab 
		driver.findElement(By.xpath("//input[@placeholder='Search apps and items...']")).sendKeys("Accounts");
		//click on Account
		driver.findElement(By.xpath("//p[@class='slds-truncate']/b")).click();
		//6) Search for the Account Using the unique account name created by you 
		driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys("yuvashree",Keys.ENTER);
	    //7) Click on the displayed Account Dropdown icon and select Edit
		Thread.sleep(4000);
		WebElement findElement = driver.findElement(By.xpath("(//span[contains(@class,'slds-icon_container slds-icon-utility-down')])[1]"));
		findElement.click();
		Thread.sleep(4000);
		WebElement findElement2 = driver.findElement(By.xpath("//div[text()='Edit']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(findElement2).click().perform();
		
		//8) Select Type as Technology Partner
		driver.findElement(By.xpath("//label[text()='Type']/following::input[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();
		//9) Select Industry as Healthcare 
		Thread.sleep(4000);
	driver.findElement(By.xpath("//label[text()='Industry']/following::input[1]")).click();
        		WebElement findElement3 = driver.findElement(By.xpath("//span[text()='Healthcare']"));
        		builder.moveToElement(findElement3).click(findElement3).perform();

		//10)Enter Billing Address
		driver.findElement(By.xpath("//label[text()='Billing Street']/following::textarea")).clear();
		driver.findElement(By.xpath("//label[text()='Billing Street']/following::textarea")).sendKeys(BillingAdd);
		//11)Enter Shipping Address
		driver.findElement(By.xpath("//label[text()='Shipping Street']/following::textarea")).clear();
		driver.findElement(By.xpath("//label[text()='Shipping Street']/following::textarea")).sendKeys(ShippingAdd);
		//12)Select Customer Priority as Low
		driver.findElement(By.xpath("//label[text()='Customer Priority']/following::input")).click();
		driver.findElement(By.xpath("//span[text()='Low']")).click();
		//13)Select SLA as Silver
		driver.findElement(By.xpath("//label[text()='SLA']/following::input")).click();
		driver.findElement(By.xpath("//span[text()='Silver']")).click();
		//14) Select Active as NO 
		Thread.sleep(4000);
		
		WebElement findElement5 = driver.findElement(By.xpath("//label[text()='Active']/following::input"));
		driver.executeScript("arguments[0].click();", findElement5);
		//builder.moveToElement(findElement5).click(findElement5).perform();
		WebElement findElement4 = driver.findElement(By.xpath("//span[text()='No']"));
		builder.moveToElement(findElement4).click(findElement4).perform();
		//15) Enter Unique Number in Phone Field
		//String phno = "93538472954";
		driver.findElement(By.xpath("//label[text()='Phone']/following::input")).clear();
		driver.findElement(By.xpath("//label[text()='Phone']/following::input")).sendKeys(Phnno);
		//16)Select Upsell Oppurtunity as No
		
		WebElement findElement6 = driver.findElement(By.xpath("//label[text()='Upsell Opportunity']/following::input"));
		driver.executeScript("arguments[0].scrollIntoView();", findElement6);
		findElement6.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4000));
		wait.until(ExpectedConditions.elementToBeClickable(findElement6));
		driver.findElement(By.xpath("//span[text()='No']")).click();
		//17)Click on save and verfiy Phone number
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text = driver.findElement(By.xpath("(//span[@class='forceOutputPhone slds-truncate'])[1]")).getText();
		if (Phnno.contains(text)) {
			System.out.println("success");
			
		}else {
			System.out.println("failure");
		}
		
		

		
		
	}

}
