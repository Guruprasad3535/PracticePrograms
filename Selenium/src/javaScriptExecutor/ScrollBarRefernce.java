package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollBarRefernce {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Step 1: type cast the WebDriver Object to JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement element=driver.findElement(By.xpath("//h4[text()='BRANDS AT SLASHED PRICES']"));

		js.executeScript("arguments[0].scrollIntoView(true)",element);
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
