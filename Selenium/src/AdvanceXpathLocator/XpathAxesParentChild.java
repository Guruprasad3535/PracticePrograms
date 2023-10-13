package AdvanceXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAxesParentChild {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul/child::li/child::a[contains(text(),'Selenium')]")).click();
		Thread.sleep(3000);
		String s=driver.findElement(By.xpath("//h1/parent::div/child::h3/child::b")).getText();
		
		System.out.println("Selenium course fee: "+s);
		driver.close();
	}

}
