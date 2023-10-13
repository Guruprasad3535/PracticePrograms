package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login.php");
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("grururry");
		driver.findElement(By.cssSelector("input._9npi")).sendKeys("gadgfjhak");
		
		driver.findElement(By.cssSelector("button[name='login']")).click();
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("Log in"))
			System.out.println("pass");
		else
		System.out.println("fail");
		Thread.sleep(3000);
		driver.close();
	}

}
