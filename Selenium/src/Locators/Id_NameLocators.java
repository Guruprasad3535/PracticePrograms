package Locators;

import org.openqa.selenium.By;

/*Scenarios
 * open browser enter google.com
 * Type your name in search field 
 * close it
 */

import org.openqa.selenium.firefox.FirefoxDriver;

public class Id_NameLocators {
	
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.google.co.in/");
//		driver.findElement(By.name("q")).sendKeys("GuruPrasad");
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("watchs");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		driver.close();
	} 
	

}
