package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByAttributesSnap {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("headphones");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		
		if (driver.getCurrentUrl().contains("headphones"))
			System.out.println("pass");
		else
			System.out.println("fail");
		Thread.sleep(3000);
		driver.close();
	}

}
