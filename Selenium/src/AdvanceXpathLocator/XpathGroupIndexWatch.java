package AdvanceXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathGroupIndexWatch {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("smart watches");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @type='submit']")).click();
		String s=driver.findElement(By.xpath("(//span[contains(text(),'Fitness Tracker')])[10]")).getText();
		System.out.println("The fitness watch with 5 star rating details:\n "+s);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
