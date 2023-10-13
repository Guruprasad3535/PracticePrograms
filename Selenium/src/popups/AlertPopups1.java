package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopups1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement js=driver.findElement(By.linkText("JavaScript Alerts"));
		
		Thread.sleep(2000);
		JavascriptExecutor je=(JavascriptExecutor)driver;
//		je.executeScript("arguments[0].scrollIntoView(true)",js);
		
		Thread.sleep(2000);
		js.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'JS Prompt')]")).click();
		
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		a.sendKeys("himynameis");
		
		Thread.sleep(2000);
		a.dismiss();
		
		Thread.sleep(2000);
		driver.close();
	}

}
