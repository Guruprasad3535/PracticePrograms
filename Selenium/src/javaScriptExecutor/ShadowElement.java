package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("chrome://downloads/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Object obj=js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
	
        Thread.sleep(2000);
        WebElement element=(WebElement)obj;
        element.sendKeys("guru");
        
        Thread.sleep(2000);
        driver.close();
	}

}
