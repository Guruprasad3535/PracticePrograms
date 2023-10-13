package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Moethod_Amazon {
	
	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.amazon.in/");
		
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
//		System.out.println(driver.getPageSource());
		
		driver.close();
	}

}
