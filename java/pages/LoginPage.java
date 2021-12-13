package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends BaseHooks {

	public LoginPage enterUsername(String uname) {

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);

		return this;

	}

	public LoginPage enterPassword(String password) {

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		return this;
	}

	public HomePage clickLoginButton() {

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		return new HomePage();
	}

}
