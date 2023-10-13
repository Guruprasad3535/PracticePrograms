package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator {
	
    public static void main(String[] args) throws InterruptedException {
	
    	FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.linkText("Apple iPhone 13 (128GB) - Midnight")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		if (driver.getTitle().contains("Midnight"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		Thread.sleep(3000);
		driver.close();
		
    }

}
