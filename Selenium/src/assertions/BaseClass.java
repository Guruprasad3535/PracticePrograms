package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	WebDriver driver;
	
	@BeforeMethod
	public void lauchBrowser() {
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.close();
	}

}
