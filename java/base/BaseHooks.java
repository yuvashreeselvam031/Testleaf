package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseHooks {

	public static ChromeDriver driver;
	public String excelFileName;

	@BeforeMethod
	public void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {

	ReaddataUsingDataProvider re = new ReaddataUsingDataProvider();
		String[][] readData = re.toReadData(excelFileName);
		return readData;
	}

	@AfterMethod
	public void closeTheDriver() {
		driver.close();
	}

}
