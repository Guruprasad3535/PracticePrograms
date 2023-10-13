package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisabledElements {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
	}

}
