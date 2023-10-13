package Locators;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;

public class FaceBook_Log {
	
	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("1234254");
		driver.findElement(By.id("pass")).sendKeys("jhadfhkja");
		
		driver.findElement(By.name("login")).click();
		
		driver.close();
	}

}
