package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkTextLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.partialLinkText("Midnight")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
