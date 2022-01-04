package Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseHooks;

public class CreateAccount extends BaseHooks {
	@BeforeTest
	public void setData() {
		excelFileName = "CreateAccount";

	}

	@Test(dataProvider = "fetchdata")
	public void toCreateAccount(String acname) throws InterruptedException {

		// 2. Click on toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		// 3. Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		// 4.Click on Accounts tab
		Thread.sleep(3000);
	
		WebElement accounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", accounts);
		// 5. Click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();
		// 6. Enter 'your name' as account name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(acname);

		// 7. Select Ownership as Public
		driver.findElement(By.xpath("//label[text()='Ownership']/following::div[contains(@class,'slds-combobox_')][1]"))
				.click();

		driver.findElement(By.xpath("//span[text()='Public']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();

		String text = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a")).getAttribute("title");
		// verification
		if (text.contains("yuvashree")) {
			System.out.println("sucess");
		} else {
			System.out.println("failure");

		}

	}

}
