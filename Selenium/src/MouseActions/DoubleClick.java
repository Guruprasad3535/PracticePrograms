package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement course=driver.findElement(By.id("course"));
		
		Actions action=new Actions(driver);
		action.moveToElement(course).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span/a[text()='manual testing']")).click();
		
//		Double click
		WebElement quntity=driver.findElement(By.id("quantity"));
		System.out.println("Quantity before double click :"+quntity.getAttribute("value"));
		
		WebElement doclick=driver.findElement(By.id("add"));
		action.doubleClick(doclick).perform();
		
		System.out.println("Quantity after double click :"+quntity.getAttribute("value"));
		
		if (quntity.getAttribute("value").equals("2"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		driver.close();
	}

}
