package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchEmptyBrowser {

	public static void main(String[] args) {
		
		//LaunchEmpty chrome browser
		//ChromeDriver Driver=new ChromeDriver();
         
		//LaunchEmpty firefox browser
		//FirefoxDriver driver=new FirefoxDriver();
		
		//LaunchEmpty edge browser
//		EdgeDriver driver=new EdgeDriver();
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
//		ChromeDriver driver=new ChromeDriver(option);
		
		EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("user-data-dir=C:\\Users\\Guruprasad V\\AppData\\Local\\Microsoft\\Edge\\User Data");
        edgeOptions.addArguments("--profile-directory=Default");
        edgeOptions.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/");
	}

}
