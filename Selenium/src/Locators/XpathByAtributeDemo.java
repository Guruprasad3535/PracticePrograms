package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByAtributeDemo {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
//		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']")).click();
        driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8970486528");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Guru@3535");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
       String s = driver.findElement(By.xpath("//span[contains(text(),'Hello')]")).getText();
        Thread.sleep(3000);
        
        if (s.contains("Guru"))
        {
        	System.out.println("pass");
        }
        else
        {
        	System.out.println("fail");
        }
           
//        driver.findElement(By.xpath("//span[contains(text(),'Sign')]")).click();
        Thread.sleep(3000);
		driver.close();
		
	}

}
