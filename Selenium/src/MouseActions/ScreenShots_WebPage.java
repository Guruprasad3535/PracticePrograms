package MouseActions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShots_WebPage {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		TakesScreenshot screen=(TakesScreenshot)driver;
		File scr=screen.getScreenshotAs(OutputType.FILE);
		File dest=new File("./SeleniumScreenShot/"+driver.getTitle()+".png");
		FileUtils.copyFile(scr, dest);
		
		driver.close();
		
	}

}
