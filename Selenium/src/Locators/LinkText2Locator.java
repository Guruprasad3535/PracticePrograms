package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText2Locator {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login.php");
		
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.className("_9nq1")).click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
