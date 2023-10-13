package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Childpopups {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.findElement(By.className("_2doB4z")).click();
		driver.findElement(By.name("q")).sendKeys("iphones");
		driver.findElement(By.cssSelector("button.L0Z3Pu")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']")).click();
		
		String parent=driver.getWindowHandle();
		Set<String> ids=driver.getWindowHandles();
		
		System.out.println("Parent adderss :"+parent);
		
		for (String id : ids) {
			
			if (!(id.equals(parent))) {
				driver.switchTo().window(id);
				System.out.println("Child adderss :"+id);
			}
		}
		
		String ratings=driver.findElement(By.xpath("//span[text()='APPLE iPhone 13 (Midnight, 128 GB)']"
				+ "/ancestor::div[@class='_1AtVbE col-12-12']"
				+ "/descendant::div[@class='_3LWZlK']")).getText();
		
		String price=driver.findElement(By.xpath("//span[text()='APPLE iPhone 13 (Midnight, 128 GB)']"
				+ "/ancestor::div[@class='_1AtVbE col-12-12']"
				+ "/descendant::div[@class='_30jeq3 _16Jk6d']")).getText();
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
