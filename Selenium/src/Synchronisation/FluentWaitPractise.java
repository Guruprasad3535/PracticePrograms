package Synchronisation;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitPractise {
	
	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()=\"Start\"]")).click();
		WebElement header=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		                     .withTimeout(Duration.ofSeconds(10))
		                     .pollingEvery(Duration.ofSeconds(10))
		                     .ignoring(Exception.class);
		
		WebElement element=wait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver)
			{
				WebElement e=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
				if(e.isDisplayed())
					return e;
				else
					return null;
			}
		});
		
		System.out.println(element.getText());
		driver.close();
		
	}

}
