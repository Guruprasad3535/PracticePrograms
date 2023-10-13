package DataDrivenTesting;

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

public class ActitimeLogin {
	
	public static void main(String[] args) throws InterruptedException {
		ActitimeLogin a1=new ActitimeLogin();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(a1.fetchData("url"));
		
		long time=Long.parseLong(a1.fetchData("timeout"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		String username=a1.fetchData("un");
		String passw=a1.fetchData("pas");
		
		driver.findElement(By.id("username")).sendKeys(username+Keys.TAB+passw+Keys.ENTER);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
	    boolean val=	wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
	    
	    if(val)
	    	System.out.println("pass");
	    else
	    	System.out.println("fail");
	    
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
