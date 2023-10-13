package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByContainsLengthy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
		driver.findElement(By.xpath("//a[contains(@id,'login')]")).click();
//		driver.findElement(By.id("logoutLink")).click();
		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'login page')]")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
	}
}
