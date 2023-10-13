package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Method_WhatsappWeb {
	
	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://web.whatsapp.com/");
		
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getPageSource());
		
		driver.close();
	}

}
