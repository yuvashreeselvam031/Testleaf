package pages;

import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;

import base.BaseHooks;

public class HomePage extends BaseHooks {

	public HomePage verifyCRMSFAisDisplayed() {

		String title = driver.getTitle();
		System.out.println(title);
	//	boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		//Assert.assertArrayEquals(expecteds, actuals);
		return this;

	}
	public MyHomePage clickCRMSFA() {

		driver.findElement(By.linkText("CRM/SFA")).click();
        return new MyHomePage();
		
	}
	
	
}
