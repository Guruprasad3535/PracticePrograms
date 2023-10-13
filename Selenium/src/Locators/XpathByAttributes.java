package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByAttributes {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']")).click();
//		driver.findElement(By.xpath("//a[@class='nav-a']")).click();
		driver.findElement(By.linkText("Mobile Accessories")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
