package AdvanceXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathForBack {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("watchs");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(3000);
		String price=driver.findElement(By.xpath("//a[text()='Analog Watch  - For Boys Unique Formal Look Black Dial ...']/../a[2]/div/div[@class='_30jeq3']")).getText();
		String off=driver.findElement(By.xpath("//a[text()='Analog Watch  - For Boys Unique Formal Look Black Dial ...']/../a[2]/div/div[3]/span")).getText();
		
		Thread.sleep(3000);
		System.out.println("Shivark: Analog Watch  - For Boys Unique Formal Look Black Dial ...");
		System.out.println("Price: "+price);
		System.out.println("Offer: "+off);
		driver.quit();
	}
}
