package Locators;

import org.openqa.selenium.edge.EdgeDriver;

public class ZomatoLogin {
   
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/partners/login");
		
	}
}
