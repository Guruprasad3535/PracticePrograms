package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {

	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void browseropt(String browser) {
		
		switch (browser) {
		case "chrome":
			  ChromeOptions option=new ChromeOptions();
			  option.addArguments("--remote-allow-origins=*");
			  driver=new ChromeDriver(option);
			break;
		case "edge":
			 driver=new EdgeDriver();
			 break;
		case "firefox":
			 driver=new FirefoxDriver();
			 break;

		default: System.out.println("Invalid browser");
			break;
		}
		
		driver.manage().window().maximize();
		
		
	}
	
	@AfterMethod
	public void close() {
		
		driver.quit();
	}
	
}
