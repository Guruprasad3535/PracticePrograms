package WindowManagment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowSize {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(2000);
		Dimension d=new Dimension(1024,768);
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		d=new Dimension(1920,1080);
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		d=new Dimension(1366,768);
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		d=new Dimension(1536,864);
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		driver.close();
	}
}
