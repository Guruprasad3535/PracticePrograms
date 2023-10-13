package popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload_AutoIT {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	    Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\java eclipse\\AutoIT\\Fileupload.exe");
		
		Thread.sleep(2000);
		driver.close();
	}

}
