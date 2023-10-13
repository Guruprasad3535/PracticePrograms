package AutoSuggestion;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestion_Google {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("APjFqb")).sendKeys("guruprasad");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul/li[@role='presentation']"));
		List a1=new ArrayList();
		
		
		for (WebElement element : suggestions) {
			
			a1.add(element.getText());
		}
		
		Collections.sort(a1);
		
		System.out.println(a1.get(4));
		
	   driver.close();
	}
}
