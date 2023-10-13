package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByTextSnap {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
		driver.findElement(By.xpath("//a[text()='kitchen product']")).click();
//        driver.findElement(By.xpath("//p[text()='Nema Knife Sharpner 1 Pcs']")).click();
		WebElement link = driver.findElement(By.partialLinkText("Nema Knife Sharpner 1 Pcs"));
		String s=link.getText();
		
//		driver.navigate().to(s);
		if (driver.getCurrentUrl().contains("Knife Sharpner"))
			System.out.println("pass");
		else
			System.out.println("fail");
		Thread.sleep(3000);
		driver.quit();
	}


}
