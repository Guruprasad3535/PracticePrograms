package AdvanceXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorForwardTraversing {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span a[href='product.php?product=manual-testing']")).click();
		driver.close();
	}

}
