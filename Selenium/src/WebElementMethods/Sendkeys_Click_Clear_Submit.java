package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sendkeys_Click_Clear_Submit {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchTF=driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		searchTF.sendKeys("watchs");
		Thread.sleep(2000);
		searchTF.clear();
		Thread.sleep(2000);
		searchTF.sendKeys("Head phones");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).submit();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().contains("Head+phones"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		driver.close();
		
	}

}
