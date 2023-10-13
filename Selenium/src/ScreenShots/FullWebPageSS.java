package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullWebPageSS {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.className("_2doB4z")).click();
		Thread.sleep(2000);
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies
				                           .viewportPasting(1000))
				                           .takeScreenshot(driver);
		
		ImageIO.write(screenshot.getImage(),"PNG", new File("./SeleniumScreenShot/flipkart.png"));
		
		driver.close();
	}
}
