package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollBarLocation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Step 1: type cast the WebDriver Object to JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement element=driver.findElement(By.xpath("//h4[text()='BRANDS AT SLASHED PRICES']"));
		Point p=element.getLocation();
		int x=p.getX();
		int y=p.getY();
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		driver.close();
	}
}
