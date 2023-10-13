package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileuploadpopup_Sendkeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("file-upload")).sendKeys("D:\\college related\\cirriculum vitae\\GURUPRASAD1.pdf");
		Thread.sleep(3000);
		
		driver.close();
		
		
	}
}
