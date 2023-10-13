package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendarpopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'ic_circularclose_grey')]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Sat Apr 29 2023']")).click();
		
		Thread.sleep(2000);
		driver.close();
	}
}
