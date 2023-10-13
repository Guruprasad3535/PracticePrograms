package pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DataDrivenTesting.ActitimeLogin;

public class ActitimeLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
        ActitimeLogin a1=new ActitimeLogin();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(a1.fetchData("url"));
		
		long time=Long.parseLong(a1.fetchData("timeout"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		ActiTimeLoginPage a2=new ActiTimeLoginPage(driver);
		
	    if(a2.getLogo().isDisplayed())
	    	System.out.println("Login Page is displayed");
	    else
	    	System.out.println("Login Page is not displayed");
	    
	    a2.setUsername(a1.fetchData("username"));
	    a2.setPassword(a1.fetchData("password"));
	    a2.clickLogin();
	    
	    Thread.sleep(time);
		driver.close();
	}
	public String fetchData(String key) 
	{
		FileInputStream fis=null;
		try {
			 fis =new FileInputStream("./TestData/data.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties property=new Properties();
		
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return property.getProperty(key);
	}
}
