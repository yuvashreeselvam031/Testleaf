package steps;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreateAccount extends BaseClass {
	
	
	@Given("Click on toggle menu")
public void ClickOnToggleMenu() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
}
	
	@And("Click on viewAll")
	public void ClickOnViewAll() {

		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	@And("Click on Sales")
	public void clickOnSales() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	@And("Click on Accounts tab")
	public void clickOnAccountsTab() throws InterruptedException {
		Thread.sleep(3000);
		//4.Click on Accounts tab 
		WebElement accounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", accounts);
		
	}
	@And("Click on New button")
	public void clickOnNewButton() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}
	@Given("Enter your name as account name")
	public void enterYourAccountName() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys("yuvashree");
	}
	
	@When("Select Ownership as Public")
	public void selectOwnershipAsPublic() {
		driver.findElement(By.xpath("//label[text()='Ownership']/following::div[contains(@class,'slds-combobox_')][1]")).click();
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}
	@And("click on save Button")
public void clickOnSaveButton() {

		driver.findElement(By.xpath("//button[text()='Save']")).click();
}
	@Then("verify your name")
	public void verifyYourName() {
		String text = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a")).getAttribute("title");
		//verification
		if (text.contains("yuvashree")) {
			System.out.println("sucess");
		} else {
			System.out.println("failure");


		}
	}
	
}
