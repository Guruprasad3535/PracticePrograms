package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByTextMyntra {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.xpath("//a[text()='Kids']")).click();
		Thread.sleep(3000);
		if(driver.getTitle().contains("Kids"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		driver.close();
		
   }

}
