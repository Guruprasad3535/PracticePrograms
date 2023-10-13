package BasicSelenium;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WhatsappLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//div[@class='_21S-L']/child::span[text()='Aravind']")).click();
		Thread.sleep(2000);
		
		
		for (int i = 1; i <=5; i++) {
			

			if(i%2==0) {
				
				driver.findElement(By.xpath("//div[@class='_1VZX7']/descendant::div[@title='Type a message']")).sendKeys("Bye");
				
				driver.findElement(By.xpath("//button[@data-testid='compose-btn-send']")).click();
		}
			else {
				driver.findElement(By.xpath("//div[@class='_1VZX7']/descendant::div[@title='Type a message']")).sendKeys("Hi");
				driver.findElement(By.xpath("//button[@data-testid='compose-btn-send']")).click();

			}
	}
		Thread.sleep(2000);
		driver.close();
}
}

