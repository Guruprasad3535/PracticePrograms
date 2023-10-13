package Synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomWaitPractise {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()=\"Start\"]")).click();
		
		int count=0;
		while(count<20)
		{
			
			try {
				String header=driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
				System.out.println("guru");
				System.out.println(header);
				break;
			}
			catch(Exception e) {
				count++;
				Thread.sleep(2000);
			}
		}
		System.out.println(count);
		
		driver.close();
		
	}
}
