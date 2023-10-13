package Locators;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassNameLocator_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("8970486528");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Guru@3535");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.className("hm-icon-label")).click();
		driver.findElement(By.className("hmenu-item")).click();
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.className("_2doB4z")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.name("q")).sendKeys("iphones");
//		driver.findElement(By.className("L0Z3Pu")).click();
//		
//		Thread.sleep(3000);
//		List<WebElement> details=driver.findElements(By.className("_4rR01T"));
//		
//		for (WebElement phone : details) {
//			String s=phone.getText();
//			System.out.println(s);
//		}
//		
//		Thread.sleep(3000);
//		driver.close();
	}
}

