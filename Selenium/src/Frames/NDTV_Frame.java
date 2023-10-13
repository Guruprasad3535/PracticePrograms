package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NDTV_Frame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ndtv.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("gavtab-11")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='tp_drp-ttl drp-lnk']/span[text()='Reveal ']")).click();
		driver.findElement(By.xpath("//a[text()='Word']")).click();
		driver.findElement(By.linkText("IPL 2023")).click();
		
		if(driver.getCurrentUrl().contains("ipl-2023"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		driver.close();
	}
}
