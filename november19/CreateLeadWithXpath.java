package november19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadWithXpath {

	public static void main(String[] args) {

		

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Create Lead")).click();
			
			driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("yuvashree");
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("s");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("yuva");
			driver.findElement(By.xpath("//input[@id='createLeadForm_personalTitle']")).sendKeys("Ms");
			driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("xxx");
			driver.findElement(By.xpath("//input[@id='createLeadForm_annualRevenue']")).sendKeys("98332346");
			driver.findElement(By.xpath("//input[@id='createLeadForm_sicCode']")).sendKeys("yyy");
			driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("testleaf");
			driver.findElement(By.xpath("//textarea[@id='createLeadForm_importantNote']")).sendKeys("nill");
			
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("shree");
		//	driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("93758");
			driver.findElement(By.xpath("//input[@id='createLeadForm_birthDate']")).sendKeys("31/08/1998");
			driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("testing");
			driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("100");
			driver.findElement(By.xpath("//input[@id='createLeadForm_tickerSymbol']")).sendKeys("xxx");
			
			driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("98");
			driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("xx");
			driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("yuvashree@gmail.com");
			driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("98");
			driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAskForName']")).sendKeys("xxx");
			driver.findElement(By.xpath("//input[@id='createLeadForm_primaryWebUrl']")).sendKeys("dhfgaef");
			
			driver.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("xx");
			driver.findElement(By.xpath("//input[@id='createLeadForm_generalAttnName']")).sendKeys("s");
			driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("yyyyy");
			driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress2']")).sendKeys("zzzz");
			driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("chennai");
			
			WebElement drp1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select droup1 = new Select(drp1);
			droup1.selectByValue("AK");
			
			driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("600052");
			driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCodeExt']")).sendKeys("999");
			
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			
			
			
			
		

	}

}
