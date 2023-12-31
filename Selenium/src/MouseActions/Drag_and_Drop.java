package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement block2=driver.findElement(By.xpath("//h1[text()='Block 2']"));
		WebElement block3=driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(block2, block3).perform();
		Thread.sleep(2000);
		driver.close();
	}
}
