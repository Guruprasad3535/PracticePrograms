package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Getsize_Getloction {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    WebElement element=driver.findElement(By.className("_8eso"));
	    Dimension size=element.getSize();
	    Point loc=element.getLocation();
	    
//	    getSize();
	    System.out.println("Height : "+size.getHeight());
	    System.out.println("Width : "+size.getWidth());
	    
//	    getLoction();
	    System.out.println("X Co-oridinate : "+loc.getX());
	    System.out.println("Y Co-oridinate : "+loc.getY());
	    
	    driver.quit();
	}
}
