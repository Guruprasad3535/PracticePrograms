package popups;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Media_Stream {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> contentSettings=new HashMap();
		HashMap<String,Object> profile=new HashMap();
		HashMap<String,Object> preference=new HashMap();
		
		contentSettings.put("media_stream",1);
		
		profile.put("managed_default_content_settings", contentSettings);
		preference.put("profile", profile);
		
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("prefs",preference );
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://mictests.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("mic-launcher")).click();
	}

}
