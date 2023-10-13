package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollBarCo_ordinates {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Step 1: type cast the WebDriver Object to JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
//		Step 2: by using referance variable call executeScript()
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		driver.close();
	}
}
