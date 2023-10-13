package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal_Frame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement signIn=driver.findElement(By.className("accountUserName"));
		
		Actions action=new Actions(driver);
		action.moveToElement(signIn).perform();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
//		driver.switchTo().frame("loginIframe");
		
		driver.switchTo().frame(0);
//		WebElement element=driver.findElement(By.id("loginIframe"));
//		driver.switchTo().frame(element);
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("45481245454554");
		Thread.sleep(2000);
		driver.findElement(By.className("sd-icon-delete-sign")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("inputValEnter")).sendKeys("shoes");
		driver.findElement(By.className("sd-icon-search-under-catagory")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}
