package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagNameLocator {
       
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		 for (WebElement name : links) {
			 String s=name.getText();
			System.out.println(s);
		}
		 Thread.sleep(3000);
		 driver.close();
		
	}
}
