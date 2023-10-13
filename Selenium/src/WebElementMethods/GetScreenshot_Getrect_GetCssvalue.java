package WebElementMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetScreenshot_Getrect_GetCssvalue {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		GetScreenshot
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		File scr=logo.getScreenshotAs(OutputType.FILE);
		File dest=new File("./SeleniumScreenShot/fbLogo.png");
		FileUtils.copyFile(scr, dest);
		
//	    getRect
		
		Rectangle r = logo.getRect();
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		System.out.println(r.getX());
		System.out.println(r.getY());
		
//		getCssValue
		
		System.out.println(logo.getCssValue("color"));
		System.out.println(logo.getCssValue("direction"));
		
		driver.close();
	}

}
