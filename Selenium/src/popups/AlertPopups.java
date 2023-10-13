package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopups {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement course=driver.findElement(By.xpath("//a[text()='COURSE']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(course).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span/descendant::a[text()='Selenium Training']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.className("btn-primary")).click();
		
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();
		
		Thread.sleep(2000);
		driver.close();
	}

}
