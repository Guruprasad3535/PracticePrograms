package popups;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopupby_HashMap {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> contentSettings=new HashMap();
		HashMap<String,Object> profile=new HashMap();
		HashMap<String,Object> preference=new HashMap();
		
		contentSettings.put("notifications", 2);
		contentSettings.put("geolocation", 1);
		
		profile.put("managed_default_content_settings", contentSettings);
		preference.put("profile", profile);
		
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("prefs",preference );
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
	}
}
