package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*Exception in thread "main" org.openqa.selenium.NoSuchElementException: Unable to locate element: //div[contains(@onclick,'openHelpAndSupportMenu')]
For documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element
Build info: version: '4.7.2', revision: '4d4020c3b7'*/
public class XpathByContainsPartial {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
		driver.findElement(By.xpath("//a[contains(@id,'login')]")).click();
		
		driver.findElement(By.xpath("//div[contains(@onclick,'openHelpAndSupportMenu')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		
		Thread.sleep(3000);
		String s=driver.findElement(By.xpath("//span[contains(text(),'build')]")).getText();
		System.out.println("The build no is "+s);
		String s1=driver.findElement(By.xpath("//div[contains(text(),'accounts used')]")).getText();
		System.out.println("The no users using the application is "+s1);
		
		driver.close();
		
	}

}
