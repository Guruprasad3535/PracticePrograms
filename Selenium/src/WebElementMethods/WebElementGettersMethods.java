package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementGettersMethods {
	
	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    WebElement element=driver.findElement(By.className("_8eso"));
	    System.out.println("Text : "+element.getText());
	    System.out.println("TagName : "+element.getTagName());
	    System.out.println("AccesibleName :"+element.getAccessibleName());
	    System.out.println("AttributeValue :"+element.getAttribute("class"));
	    driver.close();
	}

}
