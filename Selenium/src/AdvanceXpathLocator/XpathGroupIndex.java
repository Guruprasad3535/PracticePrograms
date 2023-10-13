package AdvanceXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathGroupIndex {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("iphones");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @type='submit']")).click();
		String s=driver.findElement(By.xpath("(//span[contains(text(),'iPhone')])[6]")).getText();
	    
		System.out.println("The complete details of iphone is "+s);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
