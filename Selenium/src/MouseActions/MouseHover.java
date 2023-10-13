package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement kids=driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Kids']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(kids).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li/a[text()='Infant Care']")).click();
		String s=driver.findElement(By.xpath("//div[text()='Baby Care Products']")).getText();
		
		if (s.equalsIgnoreCase("baby care products"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		driver.close();
	}

}
